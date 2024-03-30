/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventares.gerenciamentocontabancaria;

/**
 * A classe ContaCorrente extende da classe ContaBancaria que representa uma conta corrente, adicionando a funcionalidade de aplicar uma taxa de manutenção.
 * 
 * @author manoelps
 */

// Classe ContaCorrente que herda de ContaBancaria
public class ContaCorrente extends ContaBancaria {
    
    private double taxaManutencao;
    
    // Construtor da classe ContaCorrente    
    public ContaCorrente(int numeroConta, double taxaManutencao) {
        super(numeroConta);
        this.taxaManutencao = taxaManutencao;
    }
    
    // Método para aplicar uma taxa de manutenção no saldo da conta corrente
    public void aplicarTaxaManutencao(){
        saldo -= taxaManutencao;
    }
    
}
