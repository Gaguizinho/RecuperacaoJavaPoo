/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaformasgeometricas;

/**
 *
 * @author Admin
 */
public class Circulo extends Forma {
    
    private double raio;
    
    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }
    
    // Método específico para círculo (sem @Override)
    public double calcularAreaCirculo() {
        return 3.1416 * raio * raio; // π × raio²
    }
}