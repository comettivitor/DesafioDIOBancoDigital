package org.BancoDigital;

public class Main {
    public static void main(String[] args) {
        Cliente vitor = new Cliente();
        vitor.setNome("Vitor");

        Conta cc = new ContaCorrente(vitor);
        Conta cp = new ContaPoupanca(vitor);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}