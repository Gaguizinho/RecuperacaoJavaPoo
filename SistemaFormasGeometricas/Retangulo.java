/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaformasgeometricas;

/**
 *
 * @author Admin
 */
public class Retangulo extends Forma {
    
    private double largura;
    private double altura;
    
    public Retangulo(String nome, double largura, double altura) {
        super(nome);
        this.largura = largura;
        this.altura = altura;
    }
    
    // Método específico para retângulo
    public double calcularAreaRetangulo() {
        return largura * altura;
    }
}