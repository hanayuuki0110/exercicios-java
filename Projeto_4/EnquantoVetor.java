
package quartoprojeto;

import java.awt.BorderLayout;
import java.util.Scanner;


public class EnquantoVetor {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String opcao="n�o";
                
                while(opcao.equals("N�o")){
                    
                    System.out.println("Esta chuvendo? \n1 -sim \nN�o");
                    opcao=sc.nextLine().toLowerCase();
                }
                System.out.println("Parou de chover! Posso ir embora");
    }
}

