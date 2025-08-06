import java.util.Scanner;

public class AmbosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a > 0 && b > 0) ? "Ambos são positivos" : "Nem ambos são positivos");
        sc.close();
    }
}
