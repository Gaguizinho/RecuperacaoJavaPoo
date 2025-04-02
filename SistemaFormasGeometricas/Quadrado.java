/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaformasgeometricas;

/**
 *
 * @author Admin
 */
public class Quadrado extends Retangulo {
    
    private double lado;
    
    public Quadrado(String nome, double lado) {
        super(nome, lado, lado); // Largura = altura = lado
        this.lado = lado;
    }
    
    // Método específico para quadrado
    public double calcularAreaQuadrado() {
        return lado * lado;
    }
}
