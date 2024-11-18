package assets;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class apiConsulta {
  public static void BuscaAPI() {
    String apiKey = "efa9964898478b587f6f86cb";
    try {
      HttpClient client = HttpClient.newHttpClient();
      HttpRequest request =
          HttpRequest.newBuilder()
              .uri(URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD"))
              .build();
      HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

      String json = response.body();

      Gson gson = new Gson();
      Moeda moeda = gson.fromJson(json, Moeda.class);
      System.out.println(moeda);

    } catch (Exception e) {
      System.out.println("ERRO " + e);
    }
  }
}
