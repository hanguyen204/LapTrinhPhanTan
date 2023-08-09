package week4and5.UDP.TH1;

import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverIp = "localhost";
        int serverPort = 2704;
        DatagramSocket clientSocket = new DatagramSocket();
        String messenger = "Hello";
        byte[] sendData = messenger.getBytes();
        InetAddress serverAddress = InetAddress.getByName(serverIp);
        DatagramPacket clientPacket = new DatagramPacket(sendData,sendData.length,serverAddress,serverPort);

        clientSocket.send(clientPacket);
    }
}
