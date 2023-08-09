package week4and5.TinhToan2So;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverIP = "127.0.0.1";
        int serverPort = 1234;

        Socket socket = new Socket(serverIP,serverPort);
        OutputStream outputStream = socket.getOutputStream();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số 1: ");
        String number1 = scanner.next();
        System.out.println("Nhập số 2: ");
        String number2 = scanner.next();
        outputStream.write(number1.getBytes());
        outputStream.write(number2.getBytes());
        socket.close();

    }
}
