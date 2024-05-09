package entidades;

import java.util.Date;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n--------Extrato Conta Poupança--------");
        super.extrato();
        System.out.println(new Date());
    }
}
