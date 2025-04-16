
package exerciciosjava;

import java.util.Scanner;


public class Ex5 {
    
    public static void main(String[] args) {
        
        int result;
        int result2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero: ");
        int num1=sc.nextInt();
        
        System.out.println("Informe o segundo numero: ");
        int num2=sc.nextInt();
        
        result=num1*2;
        result2=num2*2;
        
        
        System.out.println("Seu primeiro e segundo numero informado ao quadrado são" +result +" ," +result2);
        System.out.println("E somados são "+(result+result2));
    }
    
}
