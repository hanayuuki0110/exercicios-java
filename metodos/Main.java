import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        contNum tel=new contNum();
        somaDe1aN tel1=new somaDe1aN();
        impNom tel2=new impNom();
        tabuada tel3=new tabuada();
        contRegressivo tel4=new contRegressivo();
        somFatorial tel5= new somFatorial();
        mediaVetor tel6= new mediaVetor();

        String nome;

        int quant=0;
        int z;


        tel.numerosParesAte100();

        System.out.println("Informe um numero: ");
        int num=sc.nextInt();

        System.out.println(tel1.somN(num));

        System.out.println("Informe um nome: ");
        nome=sc.nextLine();

        sc.nextLine();

        System.out.println("Informe quantas vezes o nome sera imprimido: ");
        quant=sc.nextInt();

        for(int i=0; i<quant; i++){

            System.out.println(tel2.impressaoNome(nome));

        }

        System.out.println("Informe um numero: ");
        num=sc.nextInt();

        for(int i=1; i<=10; i++){

            System.out.println(i+"x"+tel3.tab(num)+"="+tel3.tab(num)*i);
        }
        System.out.println("Informe um numero: ");
        num=sc.nextInt();

        for(int i=tel4.cont(num); i>=0; i--) {

            System.out.println(i);
        }

            System.out.println("Informe um valor: ");
            double val=sc.nextInt();

            System.out.println(tel5.som(val));

            System.out.println("Informe quantas notas serão informadas: ");
            quant=sc.nextInt();

        int[] not = new int[quant];

        for(z=0; z<quant; z++){

                System.out.println("Informe as notas");
                not[z]= sc.nextInt();

            }

            System.out.println("A media de suas notas ficou: "+tel6.receberMedia(not, quant));

        }

    }