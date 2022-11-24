package via.sdj3.slaughterhousegrpcspringboot.client.services.animalService;

import com.google.protobuf.Descriptors;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.lognet.springboot.grpc.GRpcService;
import via.sdj3.slaughterhousegrpcspringboot.models.AnimalModel;
import via.sdj3.slaughterhousegrpcspringboot.protobuf.Animal;
import via.sdj3.slaughterhousegrpcspringboot.protobuf.SlaughterhouseGrpc;

import java.util.Map;

@GRpcService
public class AnimalService {

    ManagedChannel managedChannel = ManagedChannelBuilder
            .forAddress("localhost", 8091   )
            .usePlaintext()
            .build();
    SlaughterhouseGrpc.SlaughterhouseBlockingStub synchronousStub
            = SlaughterhouseGrpc.newBlockingStub(managedChannel);

    SlaughterhouseGrpc.SlaughterhouseStub asynchronousStub
            = SlaughterhouseGrpc.newStub(managedChannel);


    public Map<Descriptors.FieldDescriptor, Object> createAnimal(AnimalModel animal) {
        Animal animalProto = Animal.newBuilder()
                .setType(animal.getType())
                .setWeight(animal.getWeight())
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
