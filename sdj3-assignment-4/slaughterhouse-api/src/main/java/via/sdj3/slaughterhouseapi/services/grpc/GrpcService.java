package via.sdj3.slaughterhouseapi.services.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcService implements IGrpcService{
    private ManagedChannel channel;
    @Override
    public ManagedChannel channelRef() {
        channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();
        return channel;
    }

    public ManagedChannel getChannel()
    {
        return channel;
    }
}
