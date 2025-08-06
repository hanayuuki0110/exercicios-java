import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;
        System.out.println("Menor número: " + menor);
        sc.close();
    }
}
