package entidades;

import java.util.Date;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n--------Extrato Conta Corrente--------");
        super.extrato();
        System.out.println(new Date());
    }

}
