
package terceiro.projeto;

import java.util.Scanner;

public class Laco7 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        double soma=0;
        
        String palavra;
        
        for(int i=0; i<4; i++){
            System.out.println("Informe a nota: ");
            double not=sc.nextDouble();
            
            
    
    soma=(soma+not)/4;
    
            System.out.println("A media ficou: " +soma);
    }
    
}
}
