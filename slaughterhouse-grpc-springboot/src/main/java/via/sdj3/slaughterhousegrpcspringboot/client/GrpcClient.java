package via.sdj3.slaughterhousegrpcspringboot.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import via.sdj3.slaughterhousegrpcspringboot.protobuf.*;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();

        SlaughterhouseGrpc.SlaughterhouseBlockingStub stub
                = SlaughterhouseGrpc.newBlockingStub(channel);

        Animals animals = stub.getAllAnimalRegNrInProduct(
                ProductPackRequest.newBuilder()
                        .setId(1)
                        .build()
        );

        for (Animal _animal : animals.getAnimalsList()) {
            System.out.println("Animal -> " + _animal.toString());
        }

        int animalId = 4;

        ProductPacksResponse productPacksIds = stub.getAllProductFromAnimal(
                AnimalRequest.newBuilder()
                        .setId(animalId)
                        .build()
        );

        if (productPacksIds.getProductPackIdList().size() == 0) {
            System.out.println("No product packs found for animal with id -> " + animalId);
        } else {
            for (int productPackId : productPacksIds.getProductPackIdList()) {
                System.out.println("Product pack id -> " + productPackId);
            }
        }

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