package week4and5.UDP.kiemtra;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        int serverPort = 2712;
        DatagramSocket serverSocket = new DatagramSocket(serverPort);
        System.out.println("Server is running.....");
        while (true) {
            byte[] receiveFromClient = new byte[1024];
            DatagramPacket severPacket = new DatagramPacket(receiveFromClient, receiveFromClient.length);
            serverSocket.receive(severPacket);
            String messageFromClient = new String(severPacket.getData(), 0, severPacket.getLength());
            System.out.println("Message from Client: " + messageFromClient);

            Scanner sc = new Scanner(System.in);
            String message = sc.nextLine();
            byte[] serverData = message.getBytes();
            InetAddress serverAddress = severPacket.getAddress();
            int portServer = severPacket.getPort();
            DatagramPacket sendPacket = new DatagramPacket(serverData,serverData.length,serverAddress,portServer);
            serverSocket.send(sendPacket);
            if (message.equals("exit")){
                serverSocket.close();
                break;
            }
        }

    }
}
