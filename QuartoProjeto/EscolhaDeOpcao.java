
package quartoprojeto;

import java.util.Scanner;

public class EscolhaDeOpcao {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int opc=0, num;
        
        while (opc !=3){
            
            System.out.println("Escolha a op��o desejada: "
            +"\n1 - Quadrado"
            +"\n2 - Dobro"
            +"\n3 - Sair");
            
            opc=sc.nextInt();
            if(opc==1){
                
                System.out.println("Informe um numero: ");
                num=sc.nextInt();
                System.out.println("O quadrado do " + num +"�: " + (num*num));
                
            }else if(opc==2){
                
                
                System.out.println("Informe um numero: ");
                num=sc.nextInt();
                System.out.println("O dobro do " + num +"�: " + (num*2));

                }else if(opc==3){
                
                System.out.println("Informe um numero: ");
                num=sc.nextInt();
                System.out.println("Voce escolheu sair");
            }else{
                    
                    System.out.println("Op��o invalida tente novamente");
                }
        }
        
    }
                              
}
    

