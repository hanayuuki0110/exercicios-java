import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;
        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextLine();
        } while (!senha.equals("admin123"));
        System.out.println("Senha correta!");
        sc.close();
    }
}
