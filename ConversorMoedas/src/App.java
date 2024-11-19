import assets.*;
import com.google.gson.Gson;
import java.lang.management.GarbageCollectorMXBean;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Menu menu = new Menu();
    apiConsulta BuscaAPI = new apiConsulta();

    menu.showMenu(null, null);
    try {

      int opUsuario = sc.nextInt();
      switch (opUsuario) {
        case 1:
          System.out.println("Dolar Para Real");
          System.out.print("Digite o valor em Dolar para converter para Real: U$");
          double valorDinheiro = sc.nextDouble();
          BuscaAPI.BuscaAPI(valorDinheiro,"USD","BRL");
          break;

        case 2:
          System.out.println("Real Para Dolar");
          System.out.print("Digite o valor em Real para converter para Dolar: R$");
          double valorDinheiro2 = sc.nextDouble();
          BuscaAPI.BuscaAPI(valorDinheiro2,"BRL","USD");
          break;

        case 3:
          System.out.println("Manat azeri Para Real");
          System.out.print("Digite o valor em AZN para converter para Real: U$");
          double valorDinheiro3 = sc.nextDouble();
          BuscaAPI.BuscaAPI(valorDinheiro3,"AZN","BRL");
          break;

        case 4:
          System.out.println("Lempira hondurenha Para Real");
          System.out.print("Digite o valor em Lempira hondurenha para converter para Dolar: U$");
          double valorDinheiro4 = sc.nextDouble();
          BuscaAPI.BuscaAPI(valorDinheiro4,"HNL","BRL");
          break;

        case 5:
          System.out.println("Euro Para Real");
          System.out.print("Digite o valor em Euro para converter para Real: EU$");
          double valorDinheiro5 = sc.nextDouble();
          BuscaAPI.BuscaAPI(valorDinheiro5,"EUR","BRL");
          break;

        case 6:
          System.out.println("Libras Esterlinas Para Real");
          System.out.print("Digite o valor em Libras Esterlinas para converter para Real: £");
          double valorDinheiro6 = sc.nextDouble();
          BuscaAPI.BuscaAPI(valorDinheiro6, "GBP", "BRL");
          break;

        case 7:
          System.exit(1);
          break;

        default:
          System.out.println(" |> Apenas os valores citados são aceitos (Números de 1 a 7)");
          break;
      }
    } catch (Exception e) {
      System.out.println("Erro: " + e);
    }
  }
}
