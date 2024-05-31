package org.BancoDigital;

public interface OperacoesBancarias {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(Conta contaDestino, double valor);
    void imprimirExtrato();
}
