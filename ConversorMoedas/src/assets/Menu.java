package assets;

public class Menu {
  public static void showMenu(String tituloMenu, String fraseAlerta) {
    if (tituloMenu == null) {
      System.out.println("--== CONVERSOR DE MOEDAS ==--");
      menuOpcoes(fraseAlerta);
    } else if (tituloMenu != null) {
      System.out.println("--== " + tituloMenu.toUpperCase() + " ==--");
      menuOpcoes(fraseAlerta);
    }
  }

  private static void menuOpcoes(String fraseAlerta) {
    if (fraseAlerta == null) {
      System.out.println("Escolha um valor e digite seu respectivo valor");
    } else if (fraseAlerta != null) {
      System.out.println(fraseAlerta);
    }

    System.out.print(
        """

                    1. Dolar Para Real
                    2. Real Para Dolar
                    3. Euro Para Dolar
                    4. Dolar Para Euro
                    5. Libra Para Real
                    6. Libra Para Dolar
                    7. Fechar
                    ▼
                    """);
  }
}
