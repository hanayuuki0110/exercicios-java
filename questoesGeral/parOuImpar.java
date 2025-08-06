import java.util.Scanner;

public class parOuImpar {
    public static void Main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Informe um numero");
        int valor=sc.nextInt();

        if(valor%2==0){
            System.out.println("Par");

        }else{
            System.out.println("Impar");

        }
    }
}
