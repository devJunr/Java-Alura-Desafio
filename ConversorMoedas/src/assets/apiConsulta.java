package assets;
import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;
import java.text.DecimalFormat;

public class apiConsulta extends Menu{
  public static void BuscaAPI(Double valorParaConverter, String CodigoMoedaA, String CodigoMoedaB) {
    DecimalFormat df = new DecimalFormat("#.00");
    Scanner sc = new Scanner(System.in);
    String apiKey = "COLE SUA API KEY AQUI";
    try {
      HttpClient client = HttpClient.newHttpClient();
      HttpRequest request =
          HttpRequest.newBuilder()
              .uri(URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/"+CodigoMoedaA))
              .build();
      HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
      String json = response.body();
      Gson gson = new Gson();
      Moeda moeda = gson.fromJson(json, Moeda.class);
      Double moedaA = valorParaConverter;
      Double moedaB = moeda.getTaxasDeConversao().get(CodigoMoedaB);
      System.out.println("-".repeat(15));
      System.out.println("Taxa de conversão de "+ CodigoMoedaA +" para "+CodigoMoedaB);
      System.out.println(CodigoMoedaA + "$ " + df.format(moedaA) + " => " + CodigoMoedaB + "$ " + df.format(moedaA * moedaB));
      System.out.println("-".repeat(15));
      System.out.println("Deseja realizar outra conversão? (S para Sim, N para Não)");
      String novaPesquisa = sc.next();
      novaPesquisa = novaPesquisa.toUpperCase();
      char converterNovamente = novaPesquisa.charAt(0);
        try{
          if (converterNovamente == 'N'){
            System.exit(1);
          } else if (converterNovamente != 'S' && converterNovamente != 'N') {
            System.out.println("\n --> Um caractere inválido foi digitado. O programa será encerrado.");
            System.exit(1);
          }
        } catch (RuntimeException e) {
          System.out.println("Erro: " + e);
        }

    } catch (Exception e) {
      System.out.println("ERRO " + e);
    }
  }
}
