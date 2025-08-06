import java.util.Scanner;

public class TerminaEmZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n % 10 == 0 ? "Termina em zero" : "Não termina em zero");
        sc.close();
    }
}
