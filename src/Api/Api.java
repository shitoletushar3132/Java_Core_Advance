package Api;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Api {
    public static void main(String[] args) throws Exception{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://jsonplaceholder.typicode.com/users"))
                .GET()
                .build();
        System.out.println(request);
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
