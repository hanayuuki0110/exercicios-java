import java.util.Scanner;

public class solicitarNota {
    public static void Main(String[] args){
        Scanner sc=new Scanner(System.in);

        int soma=0;
        int i=0;
        int nota[]=new int[3];
        int resultado=0;

        for(i=0; i<3; i++){
            System.out.println("Informe as notas: ");
            nota[i]=sc.nextInt();

        }for(i=0; i< nota.length; i++){
            soma=+nota.length;

            resultado=soma/3;

        }if(resultado>=6){
            System.out.println("Aprovado");

        }else{
            System.out.println("Reprovado");

        }
    }
}
