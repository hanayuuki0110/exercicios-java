
package quartoprojeto;

import java.util.Scanner;


public class lancamento {
    public static void main(String[] args)throws InterruptedException {
        
        Scanner sc=new Scanner(System.in);
        
        int cont=10;
        
        System.out.println("Contagem regressiva:");
        while(cont>=0){
            
            System.err.println(cont);
            cont--;
            
            Thread.sleep(2000); //2000 milissegundos
        }
        
        System.out.println();
    }
        
        
    
}
