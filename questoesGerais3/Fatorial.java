import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fat = 1;
        int i = 1;

        while (i <= n) {
            fat *= i;
            i++;
        }
        System.out.println("Fatorial de " + n + " = " + fat);
        sc.close();
    }
}
