/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaob;

/**
 *
 * @author duvan
 */
public class CalcularIVA {
    
    public static void main(String[] args) {
        int resultado = calcularIva(20000);
        System.out.println("El precio con IVA es: " + resultado);
        
    }
    
    public static int calcularIva(int precio){
        
        int iva = (precio * 19) / 100; 
        int resultado = precio + iva;
        return resultado;
        
    }
    
}
