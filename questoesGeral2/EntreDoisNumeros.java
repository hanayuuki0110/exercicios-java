import java.util.Scanner;

public class EntreDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        boolean entre = n > min && n < max;
        System.out.println(entre ? "Está entre A e B" : "Não está entre A e B");
        sc.close();
    }
}
