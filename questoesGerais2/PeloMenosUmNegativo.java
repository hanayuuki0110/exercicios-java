import java.util.Scanner;

public class PeloMenosUmNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a < 0 || b < 0) ? "Pelo menos um é negativo" : "Nenhum é negativo");
        sc.close();
    }
}
