import java.util.Scanner;

public class ParEMaiorQueVinte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0 && numero > 20) {
            System.out.println("O número é PAR e MAIOR que 20.");
        } else {
            System.out.println("O número NÃO é par e maior que 20 ao mesmo tempo.");
        }

        sc.close();
    }
}
