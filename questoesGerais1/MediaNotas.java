import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double soma = 0;
        double nota;

        System.out.println("Digite notas (-1 para encerrar):");
        while (true) {
            nota = sc.nextDouble();
            if (nota == -1) break;
            soma += nota;
            count++;
        }

        if (count > 0) {
            System.out.println("Média: " + (soma / count));
        } else {
            System.out.println("Nenhuma nota válida informada.");
        }
        sc.close();
    }
}
