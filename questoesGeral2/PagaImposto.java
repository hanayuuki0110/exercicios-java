import java.util.Scanner;

public class PagaImposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        System.out.println(salario > 2500 ? "Deve pagar imposto" : "Não deve pagar imposto");
        sc.close();
    }
}
