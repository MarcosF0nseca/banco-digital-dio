package com.company;

public class Main {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        cc.depositar(400);
        Conta pc = new ContaPoupanca();

        cc.transferir(450,pc);


        cc.imprimirExtrato();
        pc.imprimirExtrato();

        Conta
    }
}
