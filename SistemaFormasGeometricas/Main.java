/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaformasgeometricas;

/**
 *
 * @author Admin
 */
public class Main {

     public static void main(String[] args) {
         
        Circulo circulo = new Circulo("Circo", 2.0);
        Retangulo retangulo = new Retangulo("Bloco", 3.0, 6.0);
        Quadrado quadrado = new Quadrado("Pipa", 4.0);
        
        
        circulo.exibirNome();
        System.out.println("Área: " + circulo.calcularAreaCirculo());
        
        
        retangulo.exibirNome();
        System.out.println("Área: " + retangulo.calcularAreaRetangulo());
        
        
        quadrado.exibirNome();
        System.out.println("Área: " + quadrado.calcularAreaQuadrado());
    }
}