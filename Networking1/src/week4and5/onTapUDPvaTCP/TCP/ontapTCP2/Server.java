package week4and5.onTapUDPvaTCP.TCP.ontapTCP2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        int serverPort = 2712;
        ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("Server is running and waiting for client connect...");
        Socket socket = serverSocket.accept();
        System.out.println("Client Connect!!!");
        while (true){
            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int readByte = inputStream.read(bytes);
            String receiveFromClient = new String(bytes,0,readByte);
            System.out.println("Receive From Client: " + receiveFromClient);

            OutputStream outputStream = socket.getOutputStream();
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap Tin Nhan: ");
            String message = sc.nextLine();
            outputStream.write(message.getBytes());

            if (message.equals("exit")){
                break;
            }
        }
        socket.close();
        serverSocket.close();
    }
}
