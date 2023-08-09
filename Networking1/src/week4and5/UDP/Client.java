package week4and5.UDP;

import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverIp = "localhost";
        int serverPort = 1245;
        DatagramSocket datagramSocket = new DatagramSocket();
        String message = "Hello server, Im Haa";
        byte[] bytes = message.getBytes();
        InetAddress serverAddress = InetAddress.getByName(serverIp);
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length,serverAddress,serverPort);
        datagramSocket.send(datagramPacket);

        datagramSocket.close();
    }
}
