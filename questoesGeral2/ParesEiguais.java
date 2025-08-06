import java.util.Scanner;

public class ParesEiguais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean paresEiguais = (a % 2 == 0) && (b % 2 == 0) && (a == b);
        System.out.println(paresEiguais ? "São pares e iguais" : "Não são pares e iguais");
        sc.close();
    }
}
