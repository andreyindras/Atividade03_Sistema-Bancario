package org.example.entities;

public class ContaSalario extends ContaCorrente {

    private int saqueGratuito;

    public ContaSalario(int numeroConta, String titular, double saldo, double limiteChequeEspecial, int saqueGratuito) {
        super(numeroConta, titular, saldo, limiteChequeEspecial);
        this.saqueGratuito = 1;
    }

    @Override
    public void sacar(double valor) {
        if (saqueGratuito > 0) {
            super.sacar(valor);
            saqueGratuito--;
            System.out.println("Saque: R$" + String.format("%.2f", valor));
        } else {
            double taxa = 5.0;
            if (valor + taxa <= saldo + limiteChequeEspecial) {
                saldo -= (valor + taxa);
                System.out.println("Saque: R$" + String.format("%.2f", valor));
            } else {
                System.out.println("Saldo insuficiente");
            }
        }
    }
}
