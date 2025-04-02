/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemafuncionarios;

/**
 *
 * @author Admin
 */
public class Funcionario {
    
  // Atributos
    private String nome;  // Usando "nome" consistentemente
    private int idade;
    private double salario;
    
    // Construtor
    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;  // Corrigido para "nome"
        this.idade = idade;
        this.salario = salario;
    }
    
    // Método para exibir informações (totalmente reformulado)
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);  // "System" com S maiúsculo
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$" + salario);  // Removido "85" fixo
    }
    
    // Getters (corrigidos para manter padrão)
    public String getNome() { 
        return nome; 
    }
    
    public int getIdade() { 
        return idade; 
    }
    
    public double getSalario() { 
        return salario; 
    }
}