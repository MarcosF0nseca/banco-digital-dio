package com.company;

import java.sql.SQLOutput;

public abstract class Conta<saldo> implements IConta {

    private static int SEQUENCIAL =1;
    private static final int AGENCIA_PADRAO = 0001;


    protected int agencia;
    protected int numero;
    protected double saldo;


    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;

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

    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
         saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino){
        if (saldo > valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else{
            System.out.println("");
            System.out.println("Não será possivel fazer sua transferencia");
        }
    }

    protected void imprimirInfo() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}




