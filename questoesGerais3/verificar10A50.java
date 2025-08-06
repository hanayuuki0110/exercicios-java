import java.util.Scanner;

public class verificar10A50 {
    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero");
        int valor=sc.nextInt();

        if(valor>=50 && valor<=10){
            System.out.println("Esta entre 50 e 10");

        }else{
            System.out.println("Nao esta entre 50 e 10");

        }
    }
}
