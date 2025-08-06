
package terceiro.projeto;

import java.util.Scanner;


public class Laco6 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String palavra;
        
        for(int i=0; i<3; i++){
            
            System.out.println("Informe uma palabvra; ");    
            palavra=sc.nextLine();
            
            System.out.println("\nA palavra digitada foi: " + palavra +"\n");
        }
    }
}
