
using System.Net;
using System.Net.Sockets;
using System.Text;

class Program
{
    private const int PORT_NO = 5000;
    private const string SERVER_IP = "127.0.0.1";
    
    private static void HandleOneClient(TcpListener listener)
    {
        using TcpClient client = listener.AcceptTcpClient();

        Console.WriteLine("Client connected");
        using NetworkStream stream = client.GetStream();

        // read
        byte[] dataFromClient = new byte[1024];
        string s = "";
        while (s != "exit")
        {
            int bytesRead = stream.Read(dataFromClient, 0, dataFromClient.Length);
            s = Encoding.ASCII.GetString(dataFromClient, 0, bytesRead);
            Console.WriteLine(s);

            // respond
            byte[] dataToClient = Encoding.ASCII.GetBytes($"Returning {s}");
            stream.Write(dataToClient, 0, dataToClient.Length);
            if (s == "exit")
            {
            }
        }
        client.Close();

    }
    
    static void Main(string[] args)
    {
        Console.WriteLine("Starting server..");

        IPAddress ip = IPAddress.Parse(SERVER_IP);
        TcpListener listener = new TcpListener(ip, PORT_NO);
        listener.Start();

        Console.WriteLine("Server started..");

        while (true)
        {
            //TcpClient client = listener.AcceptTcpClient();
            Thread thread = new Thread( () => HandleOneClient(listener));
            thread.Start();
        }
    }


    private static void HandleMultipleClients(TcpListener listener)
    {
        
    }
}
