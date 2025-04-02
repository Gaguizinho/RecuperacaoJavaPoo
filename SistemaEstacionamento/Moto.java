/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaestacionamento;

/**
 *
 * @author Admin
 */
    
    public class Moto extends Veiculo {
    
    //Atributo adicional
    private int cilindrada;
    
    //Construtor
    public Moto(String modelo, String placa, int ano, int cilindrada) {
        super(modelo, placa, ano);
        this.cilindrada = cilindrada;
    }
    
    //Método para exibir as informações específicas de moto
    public void exibirInformacoesMoto() {
        exibirInformacoes(); //chama método da classe pai
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
    
    
}
