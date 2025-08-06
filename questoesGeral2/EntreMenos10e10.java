import java.util.Scanner;

public class EntreMenos10e10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean entre = n >= -10 && n <= 10;
        System.out.println(entre ? "Está entre -10 e 10" : "Não está entre -10 e 10");
        sc.close();
    }
}
