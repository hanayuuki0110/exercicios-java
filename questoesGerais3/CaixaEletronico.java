import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000.0;
        System.out.println("1-Ver saldo 2-Sacar 3-Depositar");
        int opc = sc.nextInt();

        switch (opc) {
            case 1 -> System.out.println("Saldo: R$ " + saldo);
            case 2 -> {
                System.out.print("Valor para sacar: ");
                double saque = sc.nextDouble();
                if (saque <= saldo) {
                    saldo -= saque;
                    System.out.println("Saque efetuado. Saldo atual: R$ " + saldo);
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            }
            case 3 -> {
                System.out.print("Valor para depositar: ");
                double deposito = sc.nextDouble();
                saldo += deposito;
                System.out.println("Depósito efetuado. Saldo atual: R$ " + saldo);
            }
            default -> System.out.println("Opção inválida");
        }
        sc.close();
    }
}
