package src;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://app.ticketmaster.com/discovery/v2/events.json?apikey=uxoAAPe38AqJZwxwxFNDw74mgWMdpJ3B");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                Scanner scanner = new Scanner(url.openStream());
                String json = scanner.useDelimiter("\\A").next();
                scanner.close();

                System.out.println(json);
                // Parse the response.
                // Do other things.
            } else {
                System.out.println("Error: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}