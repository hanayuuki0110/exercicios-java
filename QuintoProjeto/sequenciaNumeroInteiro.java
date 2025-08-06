
package quinto.projeto;

import java.util.Scanner;


public class sequenciaNumeroInteiro {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int num, soma=0;
        
        do{
            
            System.out.println("Informe um numero: ");
            num=sc.nextInt();
            if(num>0){
                
                soma=soma+num;
            }else if(num==0){
                
                System.out.println("Usuario digitou 0");
            }while(num!=0);
            
            System.out.println("Total de soma é: " +soma);;
            
        }
    }
    
}

