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
       1. Dólar para Real (USD -> BRL)
       2. Real para Dólar (BRL -> USD)
       3. Manat Azeri para Real (AZN -> BRL)
       4. Lempira Hondurenha para Real (HNL -> BRL)
       5. Euro para Real (EUR -> BRL)
       6. Libras Esterlinas para Real (GBP -> BRL)
       7. Fechar
       ▼
        """);
  }
}
