/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.inventares.gerenciamentocontabancaria;

import javax.swing.JFrame;

/**
 *
 * @author manoelps
 */
public class GerenciamentoContaBancaria {
    
    // declaro atributos globais para ser acessado por toda a aplicação (entre os formularios)
    public static int contaCorrenteUsuario = 0;
    public static int contaPoupancaUsuario = 0;
    
    public static void main(String[] args) {
        
       // Criar uma instância do formulário de contas
        FormEntrarContas formularioContas = new FormEntrarContas ();
        
        //Centraliza o formulário no centro da tela
        formularioContas.setLocationRelativeTo(null);

        // Configurar o comportamento padrão quando o formulário é fechado
        formularioContas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tornar o formulário visível
        formularioContas.setVisible(true);
        
    }
}
