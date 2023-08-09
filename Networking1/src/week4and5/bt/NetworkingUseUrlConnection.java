package week4and5.bt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class NetworkingUseUrlConnection {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://docs.google.com/document/d/14XRpKEfH_yDsxgVR-wi7XzKjxKCM1MPTtNfargX9pu8/edit");
        URLConnection uc = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}
