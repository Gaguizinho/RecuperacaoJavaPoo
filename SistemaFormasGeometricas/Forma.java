/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaformasgeometricas;

/**
 *
 * @author Admin
 */
public class Forma {
    
    private String nome;
    
    public Forma(String nome) {
        this.nome = nome;
    }
    
    public void exibirNome() {
        System.out.println("Forma: " + nome);
    }
    
    // Método padrão (será substituído nas subclasses)
    public double calcularArea() {
        System.out.println("Área não definida para forma genérica");
        return 0.0;
    }
}