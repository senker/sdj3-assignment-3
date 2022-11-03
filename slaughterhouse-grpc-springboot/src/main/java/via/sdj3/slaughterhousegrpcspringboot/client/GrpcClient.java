package via.sdj3.slaughterhousegrpcspringboot.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import via.sdj3.slaughterhousegrpcspringboot.protobuf.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();

        SlaughterhouseGrpc.SlaughterhouseBlockingStub stub
                = SlaughterhouseGrpc.newBlockingStub(channel);

        Animal animal = Animal
                .newBuilder()
                .setAnimalNr(3)
                .setWeight(10)
                .build();

        AnimalPart animalPart = AnimalPart.newBuilder()
                .setAnimalRef(animal)
                .setPartNumber(3)
                .setPartWeight(2.0)
                .setType("beef")
                .build();

        Trays tray = Trays.newBuilder()
                .setTrayNr(1)
                .addPartType(animalPart)
                .setMaximumWeight(23.33)
                .build();


        ProductPacks productPacks = ProductPacks.newBuilder()
                .setPackNr(10)
                .addTrayRef(tray)
                .build();

        Animals animals = stub.getAllAnimalRegNrInProduct(productPacks);

        for (Animal _animal: animals.getAnimalsList()) {
            System.out.println("Animal -> " + _animal.toString());
        }

//        AliveResponse text = stub.getAlive(
//                Empty.newBuilder().build()
//        );
//
//        for (String obj : text.getTextList())
//             {
//                 System.out.println("[.getAlive()]" + obj);
//
//             }


//        Iterator<Animals> response = stub
//                .getAllAnimalRegNrInProduct(
//                        ProductPacks.newBuilder(product).build()
//                );


//        for (Iterator<Animal> it = response; it.hasNext(); ) {
//            Animal obj = it.next();
//            System.out.println(obj.toString());
//        }

        System.out.println();
        System.out.println();
        channel.shutdown();
    }

}
/*    ProductPacks response = stub.getAllAnimalRegNrInProduct(ProductPacks.newBuilder()
            .setPackNr(10)
            .setTrayRef(1, Trays.newBuilder().setTrayNr(5)
                    .setMaximumWeight(25.33)
                    .setPartType(1, AnimalPart.newBuilder()
                            .setPartNumber(5)
                            .setPartWeight(23.33)
                            .setAnimalRef(Animal.newBuilder().setAnimalNr(5).setWeight(23.33))
                            .setType("beef")
                    ))
            .build());*/