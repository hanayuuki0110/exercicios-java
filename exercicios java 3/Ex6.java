
package exerciciosjava;

import java.util.Scanner;


public class Ex6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int vazio;
        
        System.out.println("Informe o primeiro numero: ");
        int num1=sc.nextInt();
        
        System.out.println("Informe o segundo numero: ");
        int num2=sc.nextInt();
        
        System.out.println( +num1 +", " +num2);
                
        vazio=num1;
        
        num1=num2;
        
        System.out.println( +vazio +", " +num1);
        
        
    }
    
}
