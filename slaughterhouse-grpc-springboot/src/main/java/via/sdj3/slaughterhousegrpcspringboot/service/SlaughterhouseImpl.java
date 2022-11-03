package via.sdj3.slaughterhousegrpcspringboot.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.sdj3.slaughterhousegrpcspringboot.protobuf.*;

import java.util.ArrayList;
import java.util.List;

@GRpcService
public class SlaughterhouseImpl extends SlaughterhouseGrpc.SlaughterhouseImplBase {
    @Override
    public void getAllAnimalRegNrInProduct(ProductPacks request, StreamObserver<Animals> responseObserver) {
        System.out.println("[SlaughterhouseImpl::getAllAnimalRegNrInProduct]");

        String allTrayRef = "";
        for (Trays tray : request.getTrayRefList())
        {
            allTrayRef += tray.getTrayNr() + " - ";
        }

        System.out.println("Received product nr ====> " + request.getPackNr() + " Tray ref ====> " + allTrayRef);
        Animals animalsResponse = Animals.newBuilder()
                .addAnimals(
                        Animal.newBuilder()
                                .setAnimalNr(1)
                                .setWeight(23.33)
                                .build()
                )
                .addAnimals(
                        Animal.newBuilder()
                                .setAnimalNr(2)
                                .setWeight(99.99)
                                .build()
                )
                .build();

        responseObserver.onNext(animalsResponse);
        responseObserver.onCompleted();
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
