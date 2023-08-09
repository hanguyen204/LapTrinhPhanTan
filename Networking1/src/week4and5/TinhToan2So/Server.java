package week4and5.TinhToan2So;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        int serverPort = 1234;

        ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("Server is running......");

        Socket socket = serverSocket.accept();
        System.out.println("Client connected");

        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int byte_num1 = inputStream.read(bytes);
        String message1 = new String(bytes,0,byte_num1);
        int byte_num2 = inputStream.read(bytes);
        String message2 = new String(bytes,0,byte_num2);

        int number1 = Integer.parseInt(message1);
        int number2 = Integer.parseInt(message2);
        System.out.println("Tổng của 2 số là: "+ (number1 +number2));

        socket.close();
        serverSocket.close();
    }
}
