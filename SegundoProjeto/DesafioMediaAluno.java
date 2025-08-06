


import java.util.Scanner;

public class DesafioMediaAluno {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        double numero1;
        double numero2;
        double numero3;
        double media;
        
        System.out.println("Informe a primeira nota");
        numero1=sc.nextDouble();
        
        System.out.println("Informe a segunda nota");
        numero2=sc.nextDouble();
        
        System.out.println("Informe a terceira nota");
        numero3=sc.nextDouble();
        
        media=(numero1+numero2+numero3)/3;
        
        System.out.println("A media do aluno é "+media);
        
        if(media<6){
            System.out.println("O aluno não passou");
        }else{
            System.out.println("O aluno passou");
        }
        
    }
}
