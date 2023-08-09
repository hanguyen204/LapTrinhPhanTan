package week4and5.onTapUDPvaTCP.TCP.ontapTCP1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCP_Server {
    public static void main(String[] args) throws IOException {
        //        cổng server
        int serverPort = 2712;
//        socket server lắng nghe kết nối từ client
        ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("Server is running and waiting for client connection....");

//        chấp nhận kết nối từ client
        Socket socket = serverSocket.accept();
        System.out.println("Client connected.");
        while (true) {
//        đọc dữ liệu từ client
            InputStream inputStream = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int byteRead = inputStream.read(buffer);
//        đọc dữ liệu từ mảng buffer đọc từ 0 đến cuối và lưu vào message bằng kiểu dữ liệu dạng string
            String messageFromClient = new String(buffer, 0, byteRead);
            System.out.println("Client receive message: " + messageFromClient);
// reply to client
            OutputStream outputStream = socket.getOutputStream();
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap tin nhan: ");
            String receiveFromServer = sc.nextLine();
            outputStream.write(receiveFromServer.getBytes());
            if (receiveFromServer.equals("exit")) {
                break;
            }
        }
        socket.close();
        serverSocket.close();
    }
}
