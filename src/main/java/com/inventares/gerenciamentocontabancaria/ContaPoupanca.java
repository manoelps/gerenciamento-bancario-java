/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventares.gerenciamentocontabancaria;

/**
 * A classe ContaPoupanca extende da classe ContaBancaria que representa uma conta poupança, adicionando a funcionalidade de aplicar uma taxa de juros sobre o saldo.
 * @author manoelps
 */

// Classe ContaPoupanca que herda de ContaBancaria
class ContaPoupanca extends ContaBancaria {
    
    private double taxaJuros;

    // Construtor da classe ContaCorrente    
    public ContaPoupanca(int numeroConta, double taxaJuros) {
        super(numeroConta);
        this.taxaJuros = taxaJuros;
    }

    // Método para calcular os juros na conta poupança
    public void calcularJuros() {
        saldo += (saldo * taxaJuros) / 100;
    }
    
}
