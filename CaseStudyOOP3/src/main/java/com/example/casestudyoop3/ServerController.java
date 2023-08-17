//package com.example.casestudyoop3;
//
//import javafx.fxml.FXML;
//import javafx.scene.control.TextField;
//
//import java.io.IOException;
//import java.io.OutputStream;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//public class ServerController {
//    public Socket socket() throws IOException {
//        int serverPort = 2704;
//        ServerSocket serverSocket = new ServerSocket(serverPort);
//        System.out.println("Running");
//        Socket socket = serverSocket.accept();
//        System.out.println("Accept");
//        return socket;
//    }
//
//    @FXML
//    public void onClick() throws IOException {
//        socket();
//        System.out.println("Client connect");
//    }
//
//    @FXML
//    public TextField inputMessage;
//
//    @FXML
//    public void send() throws IOException {
//        while (true) {
//            OutputStream outputStream = socket().getOutputStream();
//            String sendMessageToClient = inputMessage.getText();
//            outputStream.write(sendMessageToClient.getBytes());
//            if (sendMessageToClient.equals("exit")) {
//                socket().close();
//                break;
//            }
////            guiTinNhanDenClient(socket());
//
////        while (true) {
////            InputStream inputStream = socket().getInputStream();
////            byte[] buffer = new byte[1024];
////            int bytesRead = inputStream.read(buffer);
////            String receiveFromClient = new String(buffer, 0, bytesRead);
////            System.out.println("Receive from Client: " + receiveFromClient);
////            if (receiveFromClient.equals("exit")) {
////                socket().close();
////                break;
////            }
////        }
//        }
//    }
//
//}
//
