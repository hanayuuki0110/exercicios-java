import java.util.Scanner;

public class MenuLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Opção 1");
            System.out.println("2 - Opção 2");
            System.out.println("3 - Sair");
            opc = sc.nextInt();

            switch (opc) {
                case 1 -> System.out.println("Você escolheu a opção 1");
                case 2 -> System.out.println("Você escolheu a opção 2");
                case 3 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida");
            }
        } while (opc != 3);

        sc.close();
    }
}
