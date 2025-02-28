package org.example;

import org.example.entities.*;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(123, "João", 1000, 500);
        contaCorrente.exibirInformacoes();
        contaCorrente.depositar(200);
        contaCorrente.sacar(1700);
        contaCorrente.exibirInformacoes();
        System.out.println();

        ContaPoupanca contaPoupanca = new ContaPoupanca(124, "Maria", 1500);
        contaPoupanca.exibirInformacoes();
        contaPoupanca.sacar(1600);
        contaPoupanca.sacar(1000);
        contaPoupanca.exibirInformacoes();
        System.out.println();

        ContaInvestimento contaInvestimento = new ContaInvestimento(125, "Carlos", 2000);
        contaInvestimento.exibirInformacoes();
        contaInvestimento.sacar(1000);
        contaInvestimento.exibirInformacoes();
        System.out.println();

        ContaSalario contaSalario = new ContaSalario(126, "Ana", 1200, 500, 1);
        contaSalario.exibirInformacoes();
        contaSalario.sacar(500);
        contaSalario.sacar(500);
        contaSalario.exibirInformacoes();
        System.out.println();

        ContaInvestimentoAltoRisco contaInvestimentoAltoRisco = new ContaInvestimentoAltoRisco(127, "Pedro", 15000);
        contaInvestimentoAltoRisco.exibirInformacoes();
        contaInvestimentoAltoRisco.sacar(5000);
        contaInvestimentoAltoRisco.sacar(20000);
        contaInvestimentoAltoRisco.exibirInformacoes();
    }
}