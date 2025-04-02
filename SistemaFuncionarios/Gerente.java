/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemafuncionarios;

/**
 *
 * @author Admin
 */
public class Gerente extends Funcionario{
    
    //Atributo adicional
    private String departamento;
    
//Construtor
    public Gerente(String nome, int idade, double salario, String departamento) {
           super(nome, idade, salario);
           this.departamento = departamento;
    }

    //Método para exibir informações específicas do gerente
    public void exibirInformacoesGerente() {
        exibirInformacoes(); //chama o método da classe pai
        System.out.println("Departamento: " + departamento);
        }    
    
    }