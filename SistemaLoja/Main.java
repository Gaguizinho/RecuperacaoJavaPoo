/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.merecuperando;

/**
 *
 * @author Admin
 */

    public class Main {

    public static void main(String[] args) {
        
        Produto produto1 = new Produto("Ovo de Pascoa", 99.00);
        
        ProdutoComDesconto produto2 = new ProdutoComDesconto("Coelho da Pascoa", 110.00, 10.0);
      
        System.out.println("--- Detalhes do Produto normal ---");
        produto1.exibirDetalhes();
        
        System.out.println("\n--- Detalhes do Produto com Desconto ---");
        produto2.exibirDetalhesComDesconto();
      }
    }