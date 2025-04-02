/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaestacionamento;

/**
 *
 * @author Admin
 */

    
    public class Carro extends Veiculo{
    
    //Atributo adicional
    private int numeroPortas;
    
    
    //Construtor
    public Carro(String modelo, String placa, int ano, int numeroPortas) {
        super(modelo, placa, ano);
        this.numeroPortas = numeroPortas;
    }

    //Metodo para exibir as informações
    public void exibirInformacoesCarro () {
        exibirInformacoes();
        System.out.println("Numero de portas: " + numeroPortas);
    }
    }