import java.util.Scanner;

public class VerificaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println(nome + ", você é maior de idade.");
        } else {
            System.out.println(nome + ", você é menor de idade.");
        }

        sc.close();
    }
}
