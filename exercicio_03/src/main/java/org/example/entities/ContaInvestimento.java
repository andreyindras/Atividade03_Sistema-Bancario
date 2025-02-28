package org.example.entities;

public class ContaInvestimento extends ContaBancaria {

    public ContaInvestimento(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double taxa = valor * 0.02;
        double valorTotal = valor + taxa;

        if (valorTotal <= saldo) {
            saldo -= valorTotal;
            System.out.println("Saque: R$" + String.format("%.2f", valor));
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
