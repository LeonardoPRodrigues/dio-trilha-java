package applicacao;

import entidades.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta contaBanco;

        System.out.print("Digite o número da agência: ");
        String agencia = sc.nextLine();
        System.out.print("Digite o número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Digite o nome do cliente: ");
        sc.nextLine();
        String nomeCliente = sc.nextLine();

        System.out.print("\nDeseja realizar um deposito inicial na conta(s/n)? ");
        char permissao = sc.next().charAt(0);
        if (permissao == 's') {
            System.out.print("Deposito inicial: ");
            double deposito = sc.nextDouble();

            contaBanco = new Conta(numeroConta, agencia, nomeCliente, deposito);
        } else {
            contaBanco = new Conta(numeroConta, agencia, nomeCliente);
        }

        System.out.println("\n" + contaBanco.toString());

    }
}