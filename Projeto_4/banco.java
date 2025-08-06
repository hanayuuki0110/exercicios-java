
package quartoprojeto;

import java.util.Scanner;


public class banco {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        double sal=0, saq, dep;
        int opc=0;
        
        while(opc !=4){
            
            System.out.println("Oque fara com o seu saldo? "
            +"\n1 - Depositar na conta"
            +"\n2 - Sacar"
            +"\n3 - saldo"
            +"\n4 - sair");
        
            
        }if(opc==1){
                
            System.out.println("Quanto ira depositar na conta?");
            dep=sc.nextDouble();
            sal=sal+dep;
            
            System.out.println("Seu saldo é de " +sal+ "reais");
                }else if(opc==2){
                    
                    System.out.println("Informe o valor que sera sacado");
                    saq=sc.nextDouble();
                    saq=sal-saq;
                }else if(opc==3){
                    
                    System.out.println("Seu saldo é " +sal);
                }else if(opc==4){
                    
                    System.out.println("Encerrando sessão");
                }else{
                    
                    System.out.println("opção invalida! tente novamente");
                }
        
        

                    

    }
    
}
