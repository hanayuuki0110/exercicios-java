
package quartoprojeto;

import java.util.Scanner;


public class QuantDeGol {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int quantg=0;
        int opsair =0;
        while(quantg>=0){
            
            System.out.println("Informe quantos gols seu time fez: ");
            quantg=quantg+sc.nextInt();
            
            System.out.println("Deseja sair? Digite valor negativo para sair." + "e um valor positivo para continuar");
            opsair=sc.nextInt();
            
            System.out.println("Meu time fez " +quantg+ " gols!!!!");
        }
        System.out.println("Meu time fez " +quantg+ " gols!!!!");
        
    }
    
}
