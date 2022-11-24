package via.sdj3.slaughterhousegrpcspringboot.client.services.animalService;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.lognet.springboot.grpc.GRpcService;
import via.sdj3.slaughterhousegrpcspringboot.models.AnimalModel;
import via.sdj3.slaughterhousegrpcspringboot.models.ProductPackModel;
import via.sdj3.slaughterhousegrpcspringboot.protobuf.*;
import java.util.ArrayList;
import java.util.List;

@GRpcService
public class AnimalService {

    ManagedChannel managedChannel = ManagedChannelBuilder
            .forAddress("localhost", 6565   )
            .usePlaintext()
            .build();
    SlaughterhouseGrpc.SlaughterhouseBlockingStub synchronousStub
            = SlaughterhouseGrpc.newBlockingStub(managedChannel);

    SlaughterhouseGrpc.SlaughterhouseStub asynchronousStub
            = SlaughterhouseGrpc.newStub(managedChannel);


    public AnimalModel createAnimal(AnimalModel animal) {
        var animalProto = Animal.newBuilder()
                .setType(animal.getType())
                .setWeight(animal.getWeight())
                .build();

        var animalProtoResponse = synchronousStub.createAnimal(animalProto);

        var animalModel = new AnimalModel(
                (long) animalProtoResponse.getAnimalNr(),
                animalProtoResponse.getType(),
                animalProtoResponse.getWeight()
        );

        return animalModel;
    }
    public AnimalModel findByRegNr(Integer regNr) {
        AnimalRegNr request = AnimalRegNr.newBuilder().setRegNr(regNr).build();
        Animal animalProtoResponse = synchronousStub.getAnimalByRegNr(request);

        var animalModel = new AnimalModel(
                (long) animalProtoResponse.getAnimalNr(),
                animalProtoResponse.getType(),
                animalProtoResponse.getWeight()
        );

        return animalModel;
    }

    public AnimalModel updateAnimal(AnimalModel animal) {
        AnimalRegNr request = AnimalRegNr.newBuilder().setRegNr(animal.getId().intValue()).build();
        var animalProto = Animal.newBuilder()
                .setAnimalNr(animal.getId().intValue())
                .setType(animal.getType())
                .setWeight(animal.getWeight())
                .build();
        Animal animalProtoResponse = synchronousStub.updateAnimal(animalProto);

        var animalModel = new AnimalModel(
                animal.getId(),
                animal.getType(),
                animal.getWeight()
        );

        return animalModel;
    }

    public List<AnimalModel> findAll() {
        //AnimalRegNr request = AnimalRegNr.newBuilder().setRegNr(regNr).build();
        Animals animalProtoResponse = synchronousStub.getAllAnimals(Empty.newBuilder().build());

        List<AnimalModel> animals = new ArrayList<AnimalModel>();
        for (var animal : animalProtoResponse.getAnimalsList())
        {
            animals.add( new AnimalModel(
                    (long) animal.getAnimalNr(),
                    animal.getType(),
                    animal.getWeight()
            ));
        }


        return animals;
    }

    public void deleteByRegNr(Integer regNr) {
        AnimalRegNr request = AnimalRegNr.newBuilder().setRegNr(regNr).build();
        Animal animalProtoResponse = synchronousStub.deleteByRegNr(request);
    }

    public List<AnimalModel> getAllAnimalRegNrInProduct(Integer productId) {
        ProductPackRequest request = ProductPackRequest.newBuilder().setId(productId.intValue()).build();
        Animals animalProtoResponse = synchronousStub.getAllAnimalRegNrInProduct(request);

        List<AnimalModel> animals = new ArrayList<AnimalModel>();
        for (var animal : animalProtoResponse.getAnimalsList())
        {
            animals.add( new AnimalModel(
                    (long) animal.getAnimalNr(),
                    animal.getType(),
                    animal.getWeight()
            ));
        }


        return animals;
    }

    public List<ProductPackModel> getAllProductFromAnimal(Integer animalId) {
        AnimalRequest request = AnimalRequest.newBuilder().setId(animalId.intValue()).build();
        ProductPacksResponse productPacksResponse = synchronousStub.getAllProductFromAnimal(request);

        List<ProductPackModel> products = new ArrayList<ProductPackModel>();
        for (var product : productPacksResponse.getProductPackIdList())
        {
            products.add( new ProductPackModel(
                    Long.valueOf(product)
            ));
        }


        return products;
    }

    public List<AnimalModel> findByOrigin(String origin) {
        return null;
    }

    public List<AnimalModel> findByDate(String date) {
        return null;
    }

}
