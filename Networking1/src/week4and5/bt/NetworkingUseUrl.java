package week4and5.bt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkingUseUrl {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://docs.google.com/document/d/1W2qcstm5A5OEsdIQ-VUmJwAt8-N0ZXl8XvGAq1lhTGw/edit");
        InputStreamReader isr = new InputStreamReader(url.openStream());
        BufferedReader br = new BufferedReader(isr);
        String line = "";
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }

        br.close();
    }
}
