package via.sdj3.slaughterhousegrpcspringboot.service;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import via.sdj3.slaughterhousegrpcspringboot.models.AnimalModel;
import via.sdj3.slaughterhousegrpcspringboot.models.AnimalPartModel;
import via.sdj3.slaughterhousegrpcspringboot.models.ProductPackModel;
import via.sdj3.slaughterhousegrpcspringboot.models.TrayModel;
import via.sdj3.slaughterhousegrpcspringboot.protobuf.*;
import via.sdj3.slaughterhousegrpcspringboot.repositories.AnimalPartRepository;
import via.sdj3.slaughterhousegrpcspringboot.repositories.AnimalRepository;
import via.sdj3.slaughterhousegrpcspringboot.repositories.ProductPackRepository;
import via.sdj3.slaughterhousegrpcspringboot.repositories.TrayRepository;

import java.util.*;

@GRpcService
public class SlaughterhouseImpl extends SlaughterhouseGrpc.SlaughterhouseImplBase {
    private final AnimalRepository animalRepository;
    private final AnimalPartRepository animalPartRepository;
    private final ProductPackRepository productPackRepository;

    private final TrayRepository trayRepository;

    @Autowired
    public SlaughterhouseImpl(AnimalRepository animalRepository, AnimalPartRepository animalPartRepository, ProductPackRepository productPackRepository, TrayRepository trayRepository) {
        this.animalRepository = animalRepository;
        this.animalPartRepository = animalPartRepository;
        this.productPackRepository = productPackRepository;
        this.trayRepository = trayRepository;

//        seedDatabase();
    }

    private void seedDatabase() {
        AnimalModel chicken = animalRepository.save(
                new AnimalModel(
                        "Chicken",
                        5.0
                )
        );
        AnimalModel chicken1 = animalRepository.save(
                new AnimalModel(
                        "Chicken",
                        7.0
                )
        );
        AnimalModel cow = animalRepository.save(
                new AnimalModel(
                        "Cow",
                        150.0
                )
        );
        AnimalModel pig = animalRepository.save(
                new AnimalModel(
                        "Pig",
                        250.0
                )
        );

        TrayModel chickenTray = trayRepository.save(
                new TrayModel(15.0)
        );

        TrayModel cowTray = trayRepository.save(
                new TrayModel(500.0)
        );

        AnimalPartModel chickenPart = animalPartRepository.save(
                new AnimalPartModel(
                        1,
                        2.0,
                        chicken.getType(),
                        chicken,
                        chickenTray
                )
        );

        AnimalPartModel chickenPart1 = animalPartRepository.save(
                new AnimalPartModel(
                        1,
                        2.0,
                        chicken1.getType(),
                        chicken1,
                        chickenTray
                )
        );

        AnimalPartModel cowPart = animalPartRepository.save(
                new AnimalPartModel(
                        1,
                        2.0,
                        cow.getType(),
                        cow,
                        cowTray
                )
        );

        ProductPackModel productPack = productPackRepository.save(
            new ProductPackModel(
                new HashSet<TrayModel>(Arrays.asList(
                    chickenTray,
                    cowTray
                ))
            )
        );
    }

    @Override
    public void getAllAnimalRegNrInProduct(ProductPackRequest request, StreamObserver<Animals> responseObserver) {
        Optional<ProductPackModel> productPackOptional = productPackRepository.findById((long) request.getId());

        if (productPackOptional.isEmpty()) {
            var status = Status.NOT_FOUND.withDescription("Product pack not found");
            responseObserver.onError(status.asException());
            return;
        }

        List<AnimalModel> foundAnimals = new ArrayList<AnimalModel>();

        for (TrayModel tray : productPackOptional.get().getTrays()) {
            for (AnimalPartModel animalPart : tray.getAnimalParts()) {
                foundAnimals.add(animalPart.getAnimal());
            }
        }

        responseObserver.onNext(generateAnimalsResponse(foundAnimals));
        responseObserver.onCompleted();

//        System.out.println("[SlaughterhouseImpl::getAllAnimalRegNrInProduct]");
//
//        String allTrayRef = "";
//        for (Trays tray : request.getTrayRefList())
//        {
//            allTrayRef += tray.getTrayNr() + " - ";
//        }
//
//        System.out.println("Received product nr ====> " + request.getPackNr() + " Tray ref ====> " + allTrayRef);
//        Animals animalsResponse = Animals.newBuilder()
//                .addAnimals(
//                        Animal.newBuilder()
//                                .setAnimalNr(1)
//                                .setWeight(23.33)
//                                .build()
//                )
//                .addAnimals(
//                        Animal.newBuilder()
//                                .setAnimalNr(2)
//                                .setWeight(99.99)
//                                .build()
//                )
//                .build();
//
//        responseObserver.onNext(animalsResponse);
//        responseObserver.onCompleted();
    }

    private Animals generateAnimalsResponse(List<AnimalModel> animals) {
        Animals.Builder builder = Animals.newBuilder();

        animals.forEach(animal ->
                builder.addAnimals(
                        Animal.newBuilder()
                                .setAnimalNr((animal.getId().intValue()))
                                .setWeight(animal.getWeight())
                                .setType(animal.getType())
                )
        );

        return builder.build();
    }

    @Override
    public void getAllProductFromAnimal(Animal request, StreamObserver<ProductPacks> responseObserver) {
        super.getAllProductFromAnimal(request, responseObserver);
    }

        @Override
    public void getAlive(Empty request, StreamObserver<AliveResponse> responseObserver) {
        System.out.println("[SlaughterhouseImpl::getAlive]");

        AliveResponse texts = AliveResponse.newBuilder()
                .addText("hello world")
                .addText("wassap")
                .build();


        responseObserver.onNext(texts);
        responseObserver.onCompleted();
    }
}
