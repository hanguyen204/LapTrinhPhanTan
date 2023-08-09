package week4and5.onTapUDPvaTCP.TCP.ontapTCP3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverIP = "localhost";
        int serverPort = 2712;
        Socket socket = new Socket(serverIP,serverPort);
        while (true){
            OutputStream outputStream = socket.getOutputStream();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter message:");
            String message = sc.nextLine();
            outputStream.write(message.getBytes());

            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int readByte = inputStream.read(bytes);
            String receiveFromServer = new String(bytes,0,readByte);
            System.out.println("Receive From Server: " + receiveFromServer);

            if (message.equals("exit")){
                break;
            }
        }
        socket.close();
    }
}
