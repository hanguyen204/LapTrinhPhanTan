package com.example.casestudyoop3;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        int serverPort = 1222;
        ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("Server is running and waiting client connect.....");

        Socket socket = serverSocket.accept();
        System.out.println("Client connect");
        while (true){
//            Nhận tin nhắn từ client
            InputStream inputStream = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String receiveFromClient = new String(buffer,0,bytesRead);
            System.out.println("Receive from Client: " + receiveFromClient);
//            Gửi tin nhắn
            OutputStream outputStream = socket.getOutputStream();
            System.out.println("Input message: ");
            Scanner sc = new Scanner(System.in);
            String sendMessageToClient = sc.nextLine();
            outputStream.write(sendMessageToClient.getBytes());
            if (sendMessageToClient.equals("exit")){
                socket.close();
                break;
            }
        }
    }
}
