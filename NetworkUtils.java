package Internet_Check;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkUtils extends CheckInternet{
    @Override
    boolean InternetAvailable() {
        try{
            URL url = new URL("http://www.google.com");
            URLConnection connection = url.openConnection();
            connection.connect();
            System.out.println("Internet is connected");
            return true;
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Internet is not Available");
            return false;
        }
    }


    @Override
    boolean InternetTurnedOff() {
        try {
            // Try to resolve a well-known internet host (e.g., Google DNS).
            InetAddress.getByName("8.8.8.8");
            System.out.println("Internet is on");
            return true;
        } catch (IOException e) {
            System.out.println("Internet is off");
            return false;
        }
    }
}
