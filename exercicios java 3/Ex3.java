
package exerciciosjava;

import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
        
        int result;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero: ");
        int num1=sc.nextInt();
        
        System.out.println("Informe o segundo numero: ");
        int num2=sc.nextInt();
        
        System.out.println("Informe o teceiro numero: ");
        int num3=sc.nextInt();
        
        result=(num1+num2)*num3;
        
        System.out.println("O resultado é " +result);
    }
}
