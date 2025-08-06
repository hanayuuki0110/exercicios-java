import java.util.Scanner;

public class num100a20 {
    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero");
        int valor=sc.nextInt();

        if(valor>=20 && valor<=100){
            System.out.println("Esta entre 50 e 10");

        }else{
            System.out.println("Nao esta entre 50 e 10");

        }
    }
}
