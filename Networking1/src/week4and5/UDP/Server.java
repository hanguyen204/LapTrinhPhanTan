package week4and5.UDP;

import java.io.IOException;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        int serverPort = 1245;
        DatagramSocket receiveSocket = new DatagramSocket(serverPort);
        System.out.println("Server is running.....");

        byte[] bytes = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(bytes,bytes.length);
        receiveSocket.receive(receivePacket);
        String messageFromToClient = new String(receivePacket.getData(),0,receivePacket.getLength());
        System.out.println("Receive from to client: " + messageFromToClient);

        receiveSocket.close();
    }
}
