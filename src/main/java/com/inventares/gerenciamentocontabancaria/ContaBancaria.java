/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventares.gerenciamentocontabancaria;
/**
 * Representar uma conta bancária com funcionalidades básicas de deposito, saque e consulta saldo e conta. 
 * @author manoelps
 */
public class ContaBancaria {
    
    //declaração dos atributos
    private int numeroConta;
    protected double saldo;
    
    public ContaBancaria(int numeroConta){
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }
    
    // Método para depositar um valor na conta
    public void depositar(double valor) {
        saldo += valor;
    }
    
    // Método para sacar um valor na conta
    public boolean sacar(double valor) {
        if(valor <= saldo){
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    
    // Método para obter o saldo da conta
    public double obterSaldo() {
       return saldo;
    }
    
    // Método para obter o número da conta
    public Integer obterConta() {
       return numeroConta;
    }
}
