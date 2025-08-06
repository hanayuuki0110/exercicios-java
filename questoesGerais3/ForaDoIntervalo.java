import java.util.Scanner;

public class ForaDoIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero < 30 || numero > 90) {
            System.out.println("O número está FORA do intervalo de 30 a 90.");
        } else {
            System.out.println("O número está DENTRO do intervalo de 30 a 90.");
        }

        sc.close();
    }
}
