import java.util.Scanner;

public class MaiorDeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoNascimento = sc.nextInt();
        int idade = 2025 - anoNascimento;
        System.out.println(idade >= 18 ? "É maior de idade" : "Não é maior de idade");
        sc.close();
    }
}
