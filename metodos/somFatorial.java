public class somFatorial {

    public static double som(double val){

        double total=1;

        for(int i=1; i<=val; i++){

            total=total*i;

        }
        return total;
    }
}
