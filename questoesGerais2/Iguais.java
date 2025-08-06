import java.util.Scanner;

public class Iguais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a == b ? "São iguais" : "Não são iguais");
        sc.close();
    }
}
