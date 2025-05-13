
package exerciciosjava;

import java.util.Scanner;

public class Ex8 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double popul;
        double geral;
        double arqui;
        double cadei;
        System.out.println("Informe o publico total do estadio: ");
        double publ=sc.nextDouble();
        
        
        popul=(publ*0.10)*5;
        geral=(publ*0.50)*10;
        arqui=(publ*0.30)*20;
        cadei=(publ*0.10)*30;
        
        System.out.println("A renda do jogo conforme os tipos de ingresso são: ");
        System.out.println("\nPublico: " +(int)popul +"\nGeral: " +(int)geral +"\nArquibancadas: " +(int)arqui +"\nCadeiras: " +(int)cadei);
        
        
    }
    
}
