package week4and5.onTapUDPvaTCP.TCP.ontapTCP1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCP_Client {
    public static void main(String[] args) throws IOException {

//      IP server máy : "localhost" và "127.0.0.1" đây là 2 ip server mặc định là chung máy
        String serverIP = "localhost";
//      cổng(port) : port của server
        int serverPort = 2712;
        //      tạo kết nối tới server
        Socket socket = new Socket(serverIP, serverPort);
        while (true) {
//        gửi dữ liệu tới server dưới dạng byte
            OutputStream os = socket.getOutputStream();
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập tin nhắn: ");
            String message = sc.nextLine();
            os.write(message.getBytes());

            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int byteRead = inputStream.read(bytes);
            String messageFromServer = new String(bytes,0,byteRead);
            System.out.println("Receive From Server: " + messageFromServer);
            if (message.equals("exit")){
                //        đóng kết nối
                break;
            }
        }
        socket.close();
    }
}
