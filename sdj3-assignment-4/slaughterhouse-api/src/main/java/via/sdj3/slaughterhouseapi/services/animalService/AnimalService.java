package via.sdj3.slaughterhouseapi.services.animalService;

import com.google.protobuf.Descriptors;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.stereotype.Service;
import via.sdj3.slaughterhouseapi.model.Animal0;
import via.sdj3.slaughterhouseapi.protobuf.Animal;
import via.sdj3.slaughterhouseapi.protobuf.SlaughterhouseGrpc;
import via.sdj3.slaughterhouseapi.services.grpc.IGrpcService;

import java.util.List;
import java.util.Map;

@GRpcService
public class AnimalService extends SlaughterhouseGrpc.SlaughterhouseImplBase {

    ManagedChannel managedChannel = ManagedChannelBuilder
            .forAddress("localhost", 6565   )
            .usePlaintext()
            .build();
    SlaughterhouseGrpc.SlaughterhouseBlockingStub synchronousStub
            = SlaughterhouseGrpc.newBlockingStub(managedChannel);

    SlaughterhouseGrpc.SlaughterhouseStub asynchronousStub
            = SlaughterhouseGrpc.newStub(managedChannel);


    public Map<Descriptors.FieldDescriptor, Object> createAnimal(Animal0 animal) {
        Animal animalProto = Animal.newBuilder()
                .setAnimalNr(animal.getRegNumber())
                .setWeight(animal.getWeight())
                .setType(animal.getType())
                .build();

        Animal animalProtoResponse = synchronousStub.createAnimal(animalProto);
        return animalProtoResponse.getAllFields();

    }


/*    @Override
    public Animal0 findByRegNr(Integer regNr) {
        return null;
    }

    @Override
    public List<Animal0> findByOrigin(String origin) {
        return null;
    }

    @Override
    public List<Animal0> findByDate(String date) {
        return null;
    }

    @Override
    public List<Animal0> findAll() {
        return null;
    }

    @Override
    public Animal0 updateAnimal(Animal0 a) {
        return null;
    }

    @Override
    public void deleteByRegNr(Integer regNr) {

    }*/
}
