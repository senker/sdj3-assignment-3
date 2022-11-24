package via.sdj3.slaughterhouseapi.services.grpc;

import io.grpc.ManagedChannel;

public interface IGrpcService {
    ManagedChannel channelRef();
}
