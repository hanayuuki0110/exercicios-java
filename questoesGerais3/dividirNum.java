import java.util.Scanner;

public class dividirNum {
    public static void Main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        int valor[] = new int[0];

        for (int i = 0; i < 2; i++) {
            System.out.println("Informe um numero");
            valor[i] = sc.nextInt();


            }if (valor[0]%valor[2]==0) {
                System.out.println("Esta entre 50 e 10");

            } else {
                System.out.println("Nao esta entre 50 e 10");

            }

    }
}