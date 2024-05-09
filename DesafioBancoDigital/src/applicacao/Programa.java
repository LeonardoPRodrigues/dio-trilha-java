package applicacao;

import entidades.*;
import excecao.saldoInsuficiente;

import java.util.Locale;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws saldoInsuficiente {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do titular da conta: ");
        String nome = sc.nextLine();
        Cliente cliente = new Cliente(nome);

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        System.out.print("Deseja realizar um deposito(s/n)? ");
        char aprovacao = sc.next().charAt(0);
        if (aprovacao == 's'){
            System.out.print("Valor do deposito: ");
            double deposito = sc.nextDouble();
            cc.depositar(deposito);
        }

        System.out.print("Deseja realizar uma transferencia(s/n)? ");
        aprovacao = sc.next().charAt(0);
        if (aprovacao == 's'){
            System.out.print("Valor da transferencia: ");
            double transferencia = sc.nextDouble();
            try {
                cc.verificarSaldo(transferencia);
                cc.transferir(transferencia, poupanca);
            }
            catch (saldoInsuficiente e){
                System.out.println("Saldo insuficiente");
            }
        }

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }

}
