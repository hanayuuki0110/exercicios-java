import java.util.Scanner;

public class PodeVotar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 16) {
            System.out.println("Você pode votar.");
        } else {
            System.out.println("Você ainda NÃO pode votar.");
        }

        sc.close();
    }
}
