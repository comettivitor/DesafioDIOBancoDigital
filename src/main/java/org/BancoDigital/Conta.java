package org.BancoDigital;

public abstract class Conta implements  OperacoesBancarias{

    private static int AGENCIA = 0001;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numConta;
    protected double saldo;
    protected Cliente cliente;

    public int getAgencia() {
        return agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA;
        this.numConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimeInformacoes() {
        System.out.println(String.format("Titular: " + this.cliente.getNome()));
        System.out.println(String.format("Agencia: " + this.agencia));
        System.out.println(String.format("Numero da Conta: " + this.numConta));
        System.out.println(String.format("Saldo: " + this.saldo));
    }
}
