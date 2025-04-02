/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaestacionamento;

/**
 *
 * @author Admin
 */
public class Veiculo {
    
        
     // Atributos CORRETOS (verifique os tipos e nomes)
    private String modelo;
    private String placa;
    private int ano;
    
    // Construtor CORRETO
    public Veiculo(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }
    
    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    }
}
