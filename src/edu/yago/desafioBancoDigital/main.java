package edu.yago.desafioBancoDigital;

public class main {
    public static void main(String[] args) {
        Cliente Yago = new Cliente();
        Yago.setNome("Yago");
        Yago.setDataNascimento("16-06");

        Conta contaCorrente = new ContaCorrente(Yago);
        Conta contaPoupanca = new ContaPoupanca(Yago);
        contaPoupanca.imprimirExtrato();
        contaCorrente.imprimirExtrato();
        contaPoupanca.depositar(100);
        contaPoupanca.transferir(20,contaCorrente);

        contaPoupanca.imprimirExtrato();
        contaCorrente.imprimirExtrato();
    }
}
