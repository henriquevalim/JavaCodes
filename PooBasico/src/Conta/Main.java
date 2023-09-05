package Conta;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("12345-6", 1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("98765-4", 500);
        ContaSalario contaSalario = new ContaSalario("56789-0", 800);

        contaCorrente.depositar(200);
        contaCorrente.sacar(100);
        contaCorrente.transferir(contaPoupanca, 150);

        contaPoupanca.depositar(100);
        contaPoupanca.sacar(50);
        contaPoupanca.transferir(contaSalario, 70);

        contaSalario.depositar(300);
        contaSalario.sacar(200);

        System.out.println("Saldo da Conta Corrente: R$" + contaCorrente.consultarSaldo());
        System.out.println("Saldo da Conta Poupança: R$" + contaPoupanca.consultarSaldo());
        System.out.println("Saldo da Conta Salário: R$" + contaSalario.consultarSaldo());
    }
}