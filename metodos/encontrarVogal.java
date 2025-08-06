public class encontrarVogal {

    public static int contVogal(String tex) {

        int contador = 0;
        tex = tex.toLowerCase();

        for (int i = 0; i < tex.length(); i++) {
            char c = tex.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;

            }


        }
        {
            return contador;
        }
    }
}