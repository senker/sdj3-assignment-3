﻿
using System.Net;
using System.Net.Sockets;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Starting server..");

        IPAddress ip = IPAddress.Parse("127.0.0.1");
        TcpListener listener = new TcpListener(ip, 5000);
        listener.Start();

        Console.WriteLine("Server started..");

        while (true)
        {
            HandleOneClient(listener);
        }
    }
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
        }

    }
}