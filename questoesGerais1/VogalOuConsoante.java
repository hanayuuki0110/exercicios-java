import java.util.Scanner;

public class VogalOuConsoante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra = sc.next().charAt(0);

        switch (letra) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vogal");
            default -> System.out.println("Consoante");
        }
        sc.close();
    }
}
