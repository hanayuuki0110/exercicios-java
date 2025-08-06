import java.util.Scanner;

public class ContaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int pares = 0;

        while (count < 10) {
            int n = sc.nextInt();
            if (n % 2 == 0) pares++;
            count++;
        }
        System.out.println("Quantidade de pares: " + pares);
        sc.close();
    }
}
