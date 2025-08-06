import java.util.Scanner;

public class EstacaoAno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();

        switch (mes) {
            case 1, 2, 3 -> System.out.println("Verão");
            case 4, 5, 6 -> System.out.println("Outono");
            case 7, 8, 9 -> System.out.println("Inverno");
            case 10, 11, 12 -> System.out.println("Primavera");
            default -> System.out.println("Mês inválido");
        }
        sc.close();
    }
}
