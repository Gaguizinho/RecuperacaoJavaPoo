/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemafuncionarios;

/**
 *
 * @author Admin
 */
 
    public class Main {

    public static void main(String[] args) {
        
       Gerente gerente1 = new Gerente("Jose", 36, 9600.00, "Ti");
        Desenvolvedor dev1 = new Desenvolvedor("Jacira", 48, 6600.00, "JS");
        
        
        gerente1.exibirInformacoesGerente();
        
        
        dev1.exibirInformacoesDesenvolvedor();
    }
}
