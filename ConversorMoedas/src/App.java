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
          BuscaAPI.BuscaAPI();

          break;

        case 2:
          break;

        case 3:
          break;

        case 4:
          break;

        case 5:
          break;

        case 6:
          break;

        case 7:
          System.exit(1);
          break;

        default:
          System.out.println(" |> Apenas os valores citados são aceitos (Números de 1 a 7)");
          break;
      }
    } catch (Exception e) {
      // TODO: handle exception
    }
  }
}
