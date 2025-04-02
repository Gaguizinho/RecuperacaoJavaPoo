/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.merecuperando;

/**
 *
 * @author Admin
 */
    
    
    public class Produto {
    //Atributos
    private String nome;
    private double preco;  
    
    //Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public void exibirDetalhes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preco: R$ " + preco);
    }
    
    //Getters
    public String getNome() {
        return nome;
        
    }
        
    public double getPreco(){
        return preco;
        
    }
    
}
