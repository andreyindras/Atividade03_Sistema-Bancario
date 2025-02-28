package org.example.entities;

public class ContaInvestimentoAltoRisco extends ContaInvestimento {

    public ContaInvestimentoAltoRisco(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (saldo < 10000) {
            System.out.println("Saque invalido");
        }

        double taxa = valor * 0.05;
        double valorTotal = valor + taxa;

        if (valorTotal <= saldo) {
            saldo -= valorTotal;
            System.out.println("Saque: R$" + String.format("%.2f", valor));
        } else {
            System.out.println("Saldo insuficiente");
        }

    }
}
