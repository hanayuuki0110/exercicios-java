
package exerciciosjava;

import java.util.Scanner;


public class Ex4 {
    public static void main(String[] args) {
        
        int result;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Informe o primeiro numero: ");
        int num1=sc.nextInt();
        
        result=num1*2;
        
        System.out.println("Seu resultado é " +result);
    }
    
}
