package org.mca;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

public class ApiFetcher {

    public static void main(String[] args) {
        try {
            // API URL
            String apiUrl = "https://jsonplaceholder.typicode.com/users";

            // Create URL object
            URL url = new URL(apiUrl);

            // Open connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Check response code
            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                // Read response
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Parse JSON response
                JSONArray users = new JSONArray(response.toString());
                System.out.println("Fetched Users:\n");

                // Loop through each user
                for (int i = 0; i < users.length(); i++) {
                    JSONObject user = users.getJSONObject(i);
                    System.out.println("Name: " + user.getString("name"));
                    System.out.println("Email: " + user.getString("email"));
                    System.out.println("City: " + user.getJSONObject("address").getString("city"));
                    System.out.println("--------------------------------");
                }

            } else {
                System.out.println("HTTP GET Request Failed. Response Code: " + responseCode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
