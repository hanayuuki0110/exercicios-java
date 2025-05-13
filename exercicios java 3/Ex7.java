
package exerciciosjava;

import java.util.Scanner;


public class Ex7 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Double result;
        
        System.out.println("Informe seu salario: ");
        double sal=sc.nextDouble();
        
        result=(sal+sal*0.15);
        
        System.out.println("Seu salario reajustado é de " +result);
    }
    
}
