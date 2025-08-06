import java.util.Scanner;

public class MediaPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double soma = 0;
        int n;

        while (true) {
            n = sc.nextInt();
            if (n < 0) break;
            soma += n;
            count++;
        }

        if (count > 0)
            System.out.println("Média: " + (soma / count));
        else
            System.out.println("Nenhum número positivo informado.");

        sc.close();
    }
}
