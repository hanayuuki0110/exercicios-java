import java.util.Scanner;

public class Vogal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra = sc.next().toLowerCase().charAt(0);
        boolean vogal = "aeiou".indexOf(letra) != -1;
        System.out.println(vogal ? "É vogal" : "Não é vogal");
        sc.close();
    }
}
