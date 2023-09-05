package Conta;

class ContaPoupanca extends Conta {
    public ContaPoupanca(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " para a conta: " + numeroConta +  " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}
