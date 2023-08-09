package week4and5.TNKGD;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        String IP = "127.0.0.1";
        int serverPort = 2004;
        Socket socket = new Socket(IP,serverPort);
        while (true) {
            OutputStream outputStream = socket.getOutputStream();
            Scanner scanner = new Scanner(System.in);
            String replyToServer = scanner.nextLine();
            outputStream.write(replyToServer.getBytes());

            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int bytesRead = inputStream.read(bytes);
            String message = new String(bytes, 0, bytesRead);
            System.out.println("Server Reply: " + message);
            if (message.equals("exit")){
                break;
            }
        }
        socket.close();
    }
}
