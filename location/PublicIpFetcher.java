import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PublicIpFetcher {
    public static void main(String[] args) {
        // String apiUrl = "https://api64.ipify.org?format=text";

        String ip = "103.134.216.160"; // Example IP (Replace with user's IP)
        String apiUrl = "http://ip-api.com/json/" + ip;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(apiUrl))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // String city = json.getString("city");
            // String country = json.getString("country");
            // return city + ", " + country;

            System.out.println("Your public Ip address is :" + response.body());
        } catch (Exception e) {
            System.out.println("Error fetching public IP: " + e.getMessage());
        }
    }
}
