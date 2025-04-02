/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.merecuperando;

/**
 *
 * @author Admin
 */
public class ProdutoComDesconto extends Produto {
    
    //atributo adicional
    private double desconto;
    
    //construtor
public ProdutoComDesconto(String nome, double preco, double desconto) {    
    super(nome, preco); //chama o construtor da classe pai
    this.desconto = desconto;
}

//Metodo para exibir detalhes com desconto
public void exibirDetalhesComDesconto() {
    double precoComDesconto = getPreco() * (1 - desconto/100);

    System.out.println("Produto com Desconto: " + getNome());
    System.out.println("Preco Real: R$ " + getPreco());
    System.out.println("Desconto: " + desconto + "%");
    System.out.println("Preco com Desconto: R$ " + precoComDesconto);
}
}
