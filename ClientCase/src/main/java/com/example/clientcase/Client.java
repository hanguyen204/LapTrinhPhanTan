package com.example.clientcase;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverIP = "localhost";
        int serverPort = 1222;
        Socket socket = new Socket(serverIP,serverPort);
        while (true) {
//      Gửi tin nhắn đến server
            OutputStream outputStream = socket.getOutputStream();
            System.out.println("Input message: ");
            Scanner sc = new Scanner(System.in);
            String sendMessageToServer = sc.nextLine();
            outputStream.write(sendMessageToServer.getBytes());
//      Nhận tin nhắn từ server
            InputStream inputStream = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String messageFromServer = new String(buffer,0,bytesRead);
            System.out.println("Receive message from server: " + messageFromServer);
        if (sendMessageToServer.equals("exit")){
            socket.close();
            break;
        }
        }
    }
}
