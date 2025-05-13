
package quinto.projeto;

import java.util.Scanner;

/**
 *
 * @author fabio_p_goncalves
 */
public class media {
    
public class CadastroAlunos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] nome = new String[3];
        double[][] notas = new double[3][3];
        double[] media = new double[3];
        double soma;

        for (int i = 0; i < 3; i++){
            System.out.println("Informe o nome do aluno " + (i + 1) + ": ");
            nome[i] = sc.nextLine();
            soma = 0;
            for (int j = 0; j < 3; j++){
                System.out.println("Informe a nota " + (j + 1) + " de " + nome[i] + ": ");
                notas[i][j] = sc.nextDouble();
                soma += notas[i][j];
            }
            media[i] = soma / 3;
            sc.nextLine();
        }System.out.println("\n--- Resultados ---");
        for (int i=0; i<3; i++){
            System.out.println("Aluno: " + nome[i]);
            System.out.print("Notas: ");
            for (int j=0; j<3; j++){
                System.out.print(notas[i][j] + " ");
            }System.out.println("\nMédia: " + String.format("%.2f", media[i]));
        }for(int i=0; i>=7; i++)
            
            if(media[i]>=7){
                System.out.println("O aluno " +nome[i]+ " tirou " +media[i]+ "e foi aprovado");
            }else{
                    System.out.println("O aluno " +nome[i]+ " tirou " +media[i]+ "e não foi aprovado");
                    
                    }

    }
}
    
}
