package Conta;

abstract class Conta {
    protected String numeroConta;
    protected double saldo;

    public Conta(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " para a conta: " + numeroConta + " realizado. Novo saldo: R$"  + saldo);
    }

    public abstract void sacar(double valor);

    public void transferir(Conta destino, double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada para conta " + destino.numeroConta);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}