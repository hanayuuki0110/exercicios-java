import java.util.Scanner;

public class MenuOperacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        System.out.println("Escolha a operação: 1-Soma 2-Subtração 3-Multiplicação");
        int op = sc.nextInt();

        switch (op) {
            case 1 -> System.out.println("Soma: " + (a + b));
            case 2 -> System.out.println("Subtração: " + (a - b));
            case 3 -> System.out.println("Multiplicação: " + (a * b));
            default -> System.out.println("Opção inválida");
        }
        sc.close();
    }
}
