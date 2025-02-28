package org.example.entities;

public class ContaCorrente extends ContaBancaria {

    protected double limiteChequeEspecial;

    public ContaCorrente(int numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;
            System.out.println("Saque: R$" + String.format("%.2f", valor));
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
