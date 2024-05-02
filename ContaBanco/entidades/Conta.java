package entidades;

public class Conta {
    private Integer numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;
    private double deposito;

    public Conta(Integer numeroConta, String agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
    }

    public Conta(Integer numeroConta, String agencia, String nomeCliente, double deposito) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.deposito = deposito;
    }


    public Integer getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getDeposito() {
        return deposito;
    }

    public double saldoInicial(){
        return saldo += deposito;
    }


    public String toString(){
        return  "Olá "
                + getNomeCliente()
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + getAgencia()
                + ", conta "
                + getNumeroConta()
                + " e seu saldo $"
                + String.format("%.2f", saldoInicial())
                + " já está disponivel para saque ";
    }
}
