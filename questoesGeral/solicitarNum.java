import java.util.ArrayList;
import java.util.Scanner;

public class solicitarNum {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int i;
        ArrayList<Integer> num=new ArrayList<>();

        for(i=0; i<2; i++) {
            System.out.println("Informe um numero");
            int valor=sc.nextInt();

            num.add(valor);

        }
        if(num.get(0) > num.get(1)){
            System.out.println("O maior numero e "+num.get(0));

        }else if(num.get(1) > num.get(0)){
            System.out.println("O maior numero e "+num.get(1));

        }else{
            System.out.println("Os numeros são iguais");
        }

    }
}