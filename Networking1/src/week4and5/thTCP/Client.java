package week4and5.thTCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

class Client {
    public static void main(String[] args) {
        String serverIp = "127.0.0.1";
        int serverPort = 8080;

        try {
            Socket socket = new Socket(serverIp, serverPort);

            OutputStream outputStream = socket.getOutputStream();
            String message = "Hello, server. I'm Ha";
            outputStream.write(message.getBytes());

            socket.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}