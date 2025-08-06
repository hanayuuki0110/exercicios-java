
package terceiro.projeto;

import java.util.Scanner;


public class Laco5 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int numero=0;
        for(int i=0; i<5; i++){
            
            System.out.println("Informe um numero: ");
            numero=numero + sc.nextInt();
            
        }
        
        System.out.println("A soma dos numeror é: " +numero);
    }
    
}
