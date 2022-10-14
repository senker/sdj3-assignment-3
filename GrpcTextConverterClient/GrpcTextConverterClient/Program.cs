using System.Threading.Tasks;
using Grpc.Net.Client;
using GrpcTextConverterClient;

// The port number must match the port of the gRPC server.
using var channel = GrpcChannel.ForAddress("http://localhost:8084");
var client = new TextConverter.TextConverterClient(channel);
var reply = client.capitalizeFirstCharacter(
    new RequestText() { InputText = "hello there"});
Console.WriteLine("Greeting: " + reply);
Console.WriteLine("Press any key to exit...");
Console.ReadKey();