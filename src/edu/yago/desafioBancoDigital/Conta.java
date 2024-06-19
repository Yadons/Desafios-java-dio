package edu.yago.desafioBancoDigital;

public abstract class Conta implements IConta{
    private static final int agencia_default = 0001;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    private static int sequencial = 1;

    public  Conta(Cliente cliente) {
        this.agencia = Conta.agencia_default;
        this.numero = sequencial++;
        this.cliente = cliente;
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public  void sacar(double valor) {
        saldo -= valor;
    }
    public void depositar(double valor) {
        saldo += valor;
    }
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    protected void imprimirInformoacoes(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome(), "Data de nascimento: ", this.cliente.getDataNascimento()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
