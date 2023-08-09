package week4and5.TNKGD;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        int serverPort = 2004;
        ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("Server is running and wait client connected");
        Socket socket = serverSocket.accept();
        System.out.println("Client is connected");
        while (true) {
            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int byteRead = inputStream.read(bytes);
            String message = new String(bytes, 0, byteRead);
            System.out.println("Receive from to client: " + message);

            OutputStream outputStream = socket.getOutputStream();
            Scanner scanner = new Scanner(System.in);
            String replyMessage = scanner.nextLine();
            outputStream.write(replyMessage.getBytes());
            if (replyMessage.equals("exit")){
                break;
            }
        }
        serverSocket.close();
        socket.close();


    }
}
