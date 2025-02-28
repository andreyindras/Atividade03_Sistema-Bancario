package org.example.entities;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque: R$" + String.format("%.2f", valor));
        } else{
            System.out.println("Saldo insuficiente");
        }
    }
}
