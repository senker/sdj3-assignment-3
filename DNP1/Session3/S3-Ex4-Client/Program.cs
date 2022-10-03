using System.Net.Sockets;
using System.Text;

class Program
{
    
    private const int PORT_NO = 5000;
    private const string SERVER_IP = "127.0.0.1";
    
    static void Main(string[] args)
    {
        try
        {
            using TcpClient client = new TcpClient(SERVER_IP, PORT_NO);
            using NetworkStream stream = client.GetStream();


            string clientInput = "";
            while (clientInput != "exit")
            {
                Console.Write("Gimme your input: ");
                clientInput = Console.ReadLine();
            
                byte[] dataToServer = Encoding.ASCII.GetBytes(clientInput);
                stream.Write(dataToServer, 0, dataToServer.Length);
            
                byte[] dataFromServer = new byte[1024];
                int bytesRead = stream.Read(dataFromServer, 0, dataFromServer.Length);
                string response = Encoding.ASCII.GetString(dataFromServer, 0, bytesRead);
                Console.WriteLine(response);
            }
            //stream.Close();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }
}