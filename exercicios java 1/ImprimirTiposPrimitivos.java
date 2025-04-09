package primeiro.projeto;

/**
 *
 * @author fabio_p_goncalves
 */
public class ImprimirTiposPrimitivos {
    public static void main(String[] args) {
        char sexo='F';
        System.out.println("sexo: "+sexo);
        
        byte cod=120;
        System.out.println("Código: "+cod);
        
        short qtdPecas=32154;
        System.out.println("quantidade de peças: "+qtdPecas);
        
        int valorA=5;
        int valorB=4;
        int total=valorA+valorB;
        
        System.out.println("A soma de A + B é: " +total);
        
        float valor_Total=15.75f;
        System.out.println("valor total: R$"+valor_Total);
        
        double kmRodado=75.987f;
        System.out.println("Quilometragem rodada: "+kmRodado +"KM");
        
        long n=12345678996325841L;
        System.out.println("n: "+n);
        
        boolean aberto=true;
        System.out.println("A loja está aberta: "+aberto);
        
        int num=5;
        System.out.println("Numero: "+num);
        
        num++;
        
        System.out.println("Numero: "+num);
        System.out.println("Numero: "+num++);
        System.out.println("Numero: "+ ++num);
        System.out.println("Numero: "+ --num);
        System.out.println("Numero: "+ num--);
        
        int x=24;
        byte y=(byte) x;
        
    }
}
