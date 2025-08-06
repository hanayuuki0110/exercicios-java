public class mediaVetor {

    public static int receberMedia(int med[], int vezes){

        int total=0;

        for(int i=0; i<vezes; i++){

            total=total+med[i];

        }

        return total/vezes;
    }
}
