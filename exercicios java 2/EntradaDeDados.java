



import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int numero;
        double nota;
        String nome;
        
        System.out.println("Informe o nome do aluno: ");
        nome=sc.nextLine();
        
        System.out.println("Qual a idade do aluno: ");
        numero=sc.nextInt();
        
        System.out.println("Informe a nota do aluno: ");
        nota=sc.nextDouble();
        
        System.out.println("Seu nome é " +nome);
        
        System.out.println("sua idade é " +numero);
        
        System.out.println("e sua nota é " + nota);
        
        sc.close();
    }
    
}
