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

        //seedDatabase();
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

        TrayModel chickenBreastTray = trayRepository.save(
                new TrayModel(15.0)
        );

        TrayModel chickenLegTray = trayRepository.save(
                new TrayModel(15.0)
        );

        TrayModel cowTray = trayRepository.save(
                new TrayModel(500.0)
        );

        AnimalPartModel chickenBreasts = animalPartRepository.save(
                new AnimalPartModel(
                        1,
                        2.0,
                        "breast",
                        chicken,
                        chickenBreastTray
                )
        );

        AnimalPartModel chicken1Breasts = animalPartRepository.save(
                new AnimalPartModel(
                        1,
                        2.0,
                        "breast",
                        chicken1,
                        chickenBreastTray
                )
        );

        AnimalPartModel chickenLegs = animalPartRepository.save(
                new AnimalPartModel(
                        1,
                        2.0,
                        "leg",
                        chicken,
                        chickenLegTray
                )
        );

        AnimalPartModel cowPart = animalPartRepository.save(
                new AnimalPartModel(
                        1,
                        2.0,
                        "steak",
                        cow,
                        cowTray
                )
        );

        ProductPackModel productPack = productPackRepository.save(
            new ProductPackModel(
                new HashSet<TrayModel>(Arrays.asList(
                    chickenBreastTray,
                    cowTray
                ))
            )
        );

        ProductPackModel productPack1 = productPackRepository.save(
                new ProductPackModel(
                        new HashSet<TrayModel>(Arrays.asList(
                                chickenLegTray
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
    public void getAllProductFromAnimal(AnimalRequest request, StreamObserver<ProductPacksResponse> responseObserver) {
        Long animalId = (long) request.getId();
        Optional<AnimalModel> animalOptional = animalRepository.findById(animalId);

        if (animalOptional.isEmpty()) {
            var status = Status.NOT_FOUND.withDescription("Animal not found");
            responseObserver.onError(status.asException());
            return;
        }

        Optional<List<AnimalPartModel>> animalPartsOptional = animalPartRepository
                .findAnimalPartModelsByAnimal_Id(animalId);

        List<ProductPackModel> foundProductPacks = new ArrayList<ProductPackModel>();

        for (AnimalPartModel animalPart : animalPartsOptional.get()) {
            for (ProductPackModel productPack : animalPart.getTray().getProductPacks()) {
                foundProductPacks.add(productPack);
            }
        }

        responseObserver.onNext(generateProductPacksResponse(foundProductPacks));
        responseObserver.onCompleted();
    }

    private ProductPacksResponse generateProductPacksResponse(List<ProductPackModel> productPacks) {
        ProductPacksResponse.Builder builder = ProductPacksResponse.newBuilder();

        productPacks.forEach(productPack ->
                builder.addProductPackId(productPack.getId().intValue())
        );

        return builder.build();
    }
}
