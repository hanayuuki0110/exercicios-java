package quinto.projeto;


import java.util.Scanner;
import javax.sound.midi.Soundbank;


public class vetores {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int[]num=new int[5];
        
        for(int i=0; i<5; i++){
            
            System.out.println("Informe um numero: ");
            num[i]=sc.nextInt();
        }
        for(int i=0; i<5; i++){
            
            System.out.println(num[i]);
        }
    }
    
}
