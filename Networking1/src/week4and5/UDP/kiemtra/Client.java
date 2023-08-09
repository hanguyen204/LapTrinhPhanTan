package week4and5.UDP.kiemtra;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverIP = "192.168.2.42";
        int serverPort = 6969;
        DatagramSocket clientSocket = new DatagramSocket();

        while (true) {
            Scanner sc = new Scanner(System.in);
            String message = sc.nextLine();
            byte[] clientData = message.getBytes();
            InetAddress serverAddress = InetAddress.getByName(serverIP);
            DatagramPacket clientPacket = new DatagramPacket(clientData, clientData.length, serverAddress, serverPort);
            clientSocket.send(clientPacket);

            byte[] receiveFromServer = new byte[1024];
            DatagramPacket severPacket = new DatagramPacket(receiveFromServer, receiveFromServer.length);
            clientSocket.receive(severPacket);
            String messageFromServer = new String(severPacket.getData(), 0, severPacket.getLength());
            System.out.println("Message from Server: " + messageFromServer);

            if (message.equals("exit")) {
                clientSocket.close();
                break;
            }
        }
    }
}
