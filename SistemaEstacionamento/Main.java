/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaestacionamento;

/**
 *
 * @author Admin
 */
public class Main {
    
    
    public static void main(String[] args) {
       
        //criando um carro
        Carro carro1 = new Carro("JETTA", "COS 5823", 1999, 4);
        
        //criando uma moto
        Moto moto1 = new Moto("DUCATI", "DU 321", 1989, 999);
        
             carro1.exibirInformacoesCarro();
        
       
        moto1.exibirInformacoesMoto();
    }
}

    
    
