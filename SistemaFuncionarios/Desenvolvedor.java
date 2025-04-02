/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemafuncionarios;

/**
 *
 * @author Admin
 */

    
    
    public class Desenvolvedor extends Funcionario {
    
    //Atributo adicional
    private String linguagemProgramacao;
    
    //Construtor
    public Desenvolvedor(String nome, int idade, double salario, String linguagemProgramacao){
           super(nome, idade, salario);
           this.linguagemProgramacao = linguagemProgramacao;
    }
//Método para exibir informacoes especificas do desenvolvedor
    public void exibirInformacoesDesenvolvedor() {
        exibirInformacoes(); //chama o método da classe pai
        System.out.println("Linguagem de Programacao: " + linguagemProgramacao);
        
    }
    
}
