package week4and5.UDP.TH1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws SocketException {
        int serverPort = 2704;
        DatagramSocket serverSocket = new DatagramSocket(serverPort);
        System.out.println("Server is running....");

        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData,receiveData.length);

    }
}
