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

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
                        5.0,
                        "Arla"/*,
                        LocalDate.of(2017, 1, 13)*/
                )
        );
        AnimalModel chicken1 = animalRepository.save(
                new AnimalModel(
                        "Chicken",
                        7.0,
                        "Arla"/*,
                        LocalDate.of(2017, 1, 13)*/
                )
        );
        AnimalModel cow = animalRepository.save(
                new AnimalModel(
                        "Cow",
                        150.0,
                        "Not Arla"/*,
                        LocalDate.of(2017, 1, 13)*/
                )
        );
        AnimalModel pig = animalRepository.save(
                new AnimalModel(
                        "Pig",
                        250.0,
                        "Danish crown"/*,
                        LocalDate.of(2017, 1, 13)*/
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
                                .setOrigin(animal.getOrigin())
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

    @Override
    public void createAnimal(Animal request, StreamObserver<Animal> responseObserver) {
        var createdAnimal = animalRepository.save(new AnimalModel(
                request.getType(),
                request.getWeight(),
                request.getOrigin()/*,
                dateConverter(request.getDate())*/
        ));

        buildAnimal(responseObserver, createdAnimal);
    }

    @Override
    public void getAnimalByRegNr(AnimalRegNr request, StreamObserver<Animal> responseObserver) {
        Optional<AnimalModel> foundAnimal = animalRepository.findById((long) request.getRegNr());

        if (foundAnimal.isEmpty()) {
            var status = Status.NOT_FOUND.withDescription("Animal not found");
            responseObserver.onError(status.asException());
            return;
        }
        AnimalModel animal = new AnimalModel();
        animal = foundAnimal.get();

        buildAnimal(responseObserver, animal);

    }



    public LocalDate dateConverter(String date)
    {
        String dateInString = date;
        LocalDate returnDate = LocalDate.parse(dateInString, DateTimeFormatter.BASIC_ISO_DATE);
        return returnDate;
    }

    @Override
    public void updateAnimal(Animal request, StreamObserver<Animal> responseObserver) {
        Optional<AnimalModel> foundAnimal = animalRepository.findById((long) request.getAnimalNr());

        if (foundAnimal.isEmpty()) {
            var status = Status.NOT_FOUND.withDescription("Animal not found");
            responseObserver.onError(status.asException());
            return;
        }
        var createdAnimal = animalRepository.save(new AnimalModel(
                (long) request.getAnimalNr(),
                request.getType(),
                request.getWeight(),
                request.getOrigin()/*,
                dateConverter(request.getDate())*/
        ));


        buildAnimal(responseObserver, createdAnimal);
    }

    @Override
    public void getAllAnimals(Empty request, StreamObserver<Animals> responseObserver) {
        var allAnimals = animalRepository.findAll();

        var animals = generateAnimalsResponse(allAnimals);
        responseObserver.onNext(animals);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteByRegNr(AnimalRegNr request, StreamObserver<Animal> responseObserver) {
        Optional<AnimalModel> foundAnimal = animalRepository.findById((long) request.getRegNr());

        if (foundAnimal.isEmpty()) {
            var status = Status.NOT_FOUND.withDescription("Animal not found");
            responseObserver.onError(status.asException());
            return;
        }

        animalRepository.delete(foundAnimal.get());

        Animal.Builder builder = Animal.newBuilder();
        builder.setAnimalNr(foundAnimal.get().getId().intValue());
        builder.setWeight(foundAnimal.get().getWeight());
        builder.setType(foundAnimal.get().getType());
        builder.setOrigin(foundAnimal.get().getOrigin());

        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getAllAnimalsByOrigin(AnimalOrigin request, StreamObserver<Animals> responseObserver) {
        var allAnimals = animalRepository.findAll();


        List<AnimalModel> byOrigin = new ArrayList<AnimalModel>();
        for (var animal : allAnimals)
        {
            if (animal.getOrigin().equals(request.getOrigin()))
            {
                byOrigin.add(animal);
            }
        }

        var animals = generateAnimalsResponse(byOrigin);


        responseObserver.onNext(animals);
        responseObserver.onCompleted();
    }

    private void buildAnimal(StreamObserver<Animal> responseObserver, AnimalModel animal) {
        Animal.Builder builder = Animal.newBuilder();
        builder.setAnimalNr(animal.getId().intValue());
        builder.setWeight(animal.getWeight());
        builder.setType(animal.getType());
        builder.setOrigin(animal.getOrigin());

        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}
