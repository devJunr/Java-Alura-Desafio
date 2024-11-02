import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("---== CONVERSÃO DE MOEDAS ==---");
            while (true) {
                System.out.println("""
                \n
                Escolha uma opção e digite o valor correspondente a opção
                1. Dólar para Real
                2. Real para Dólar
                3. Real para Euro
                4. Euro para Real
                5. Dólar para Euro
                6. Euro para Dólar
                7. Sair
                """);
                System.out.print("Escolha uma opção: ");
                int escolhaMenu = sc.nextInt();

                switch(escolhaMenu){
                    case 1:
                        System.out.println("Dólar para Real");
                        break;

                    case 2:
                        System.out.println("Real para Dólar");
                        break;

                    case 3:
                        System.out.println("Real para Euro");
                        break;

                    case 4:
                        System.out.println("Euro para Real");
                        break;

                    case 5:
                        System.out.println("Dólar para Euro");
                        break;

                    case 6:
                        System.out.println("Euro para Dólar");
                        break;

                    case 7:
                        System.out.println("Sistema fechado");
                        System.exit(1);
                        break;
                }
            }
        } catch(java.util.InputMismatchException e){
            System.out.println("ERRO: Apenas números são aceitos ");
        } catch (Exception e){
            System.out.println("ERRO CODE: " + e);
        }

    }
}