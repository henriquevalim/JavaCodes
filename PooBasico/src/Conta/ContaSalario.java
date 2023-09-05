package Conta;

class ContaSalario extends Conta {
    public ContaSalario(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}
