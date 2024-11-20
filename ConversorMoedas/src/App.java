import assets.*;
import com.google.gson.Gson;
import java.lang.management.GarbageCollectorMXBean;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Menu menu = new Menu();
    apiConsulta BuscaAPI = new apiConsulta();
    Boolean repeticao = true;
      try {
        while (repeticao){
          menu.showMenu(null, null);
          int opUsuario = sc.nextInt();
          switch (opUsuario) {
            case 1:
              System.out.println("Dolar Para Real");
              System.out.print("Digite o valor em Dolar para converter para Real: USD$");
              double valorDinheiro = sc.nextDouble();
              System.out.println("-> AGUARDE");
              BuscaAPI.BuscaAPI(valorDinheiro,"USD","BRL");
              break;

            case 2:
              System.out.println("Real Para Dolar");
              System.out.print("Digite o valor em Real para converter para Dolar: BRL$");
              double valorDinheiro2 = sc.nextDouble();
              System.out.println("-> AGUARDE");
              BuscaAPI.BuscaAPI(valorDinheiro2,"BRL","USD");
              break;

            case 3:
              System.out.println("Manat azeri Para Real");
              System.out.print("Digite o valor em AZN para converter para Real: AZN$");
              double valorDinheiro3 = sc.nextDouble();
              System.out.println("-> AGUARDE");
              BuscaAPI.BuscaAPI(valorDinheiro3,"AZN","BRL");
              break;

            case 4:
              System.out.println("Lempira hondurenha Para Real");
              System.out.print("Digite o valor em Lempira hondurenha para converter para Dolar: HNL$");
              double valorDinheiro4 = sc.nextDouble();
              System.out.println("-> AGUARDE");
              BuscaAPI.BuscaAPI(valorDinheiro4,"HNL","BRL");
              break;

            case 5:
              System.out.println("Euro Para Real");
              System.out.print("Digite o valor em Euro para converter para Real: EUR$");
              double valorDinheiro5 = sc.nextDouble();
              System.out.println("-> AGUARDE");
              BuscaAPI.BuscaAPI(valorDinheiro5,"EUR","BRL");
              break;

            case 6:
              System.out.println("Libras Esterlinas Para Real");
              System.out.print("Digite o valor em Libras Esterlinas para converter para Real: GBP");
              double valorDinheiro6 = sc.nextDouble();
              System.out.println("-> AGUARDE");
              BuscaAPI.BuscaAPI(valorDinheiro6, "GBP", "BRL");
              break;

            case 7:
              System.exit(1);
              break;

            default:
              System.out.println(" |> Apenas os valores citados são aceitos (Números de 1 a 7)");
              break;

          }
        }
      } catch (java.util.InputMismatchException e) {
        System.out.println("Erro: O valor informado não é do tipo esperado.");
      } catch(Exception e){
        System.out.println("Erro - Código: " + e);
      }
     }
}
