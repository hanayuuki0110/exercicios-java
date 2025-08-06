import java.util.Scanner;

public class Multiplo10ou15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean multiplo = (n % 10 == 0) || (n % 15 == 0);
        System.out.println(multiplo ? "É múltiplo de 10 ou 15" : "Não é múltiplo de 10 ou 15");
        sc.close();
    }
}
