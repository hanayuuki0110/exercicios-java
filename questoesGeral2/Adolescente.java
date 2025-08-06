import java.util.Scanner;

public class Adolescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        boolean adolescente = idade >= 13 && idade <= 19;
        System.out.println(adolescente ? "É adolescente" : "Não é adolescente");
        sc.close();
    }
}
