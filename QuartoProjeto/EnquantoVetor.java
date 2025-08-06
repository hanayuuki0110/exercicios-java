
package quartoprojeto;

import java.awt.BorderLayout;
import java.util.Scanner;


public class EnquantoVetor {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String opcao="não";
                
                while(opcao.equals("Não")){
                    
                    System.out.println("Esta chuvendo? \n1 -sim \nNão");
                    opcao=sc.nextLine().toLowerCase();
                }
                System.out.println("Parou de chover! Posso ir embora");
    }
}

