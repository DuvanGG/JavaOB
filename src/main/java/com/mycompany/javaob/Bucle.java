/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaob;

/**
 *
 * @author duvan
 */
public class Bucle {
    
    public static void main(String[] args) {
        
        // Array tipo string con los nombres
        String[] nombres = {"Hola ", "mundo ", "concatenado ", "..."};
        String resultado = "";
        
        //Recorrer array y concatenar los nombres
        for (int i = 0; i < nombres.length; i++) {
            resultado += nombres[i];
        }
        System.out.println(resultado);
    }
    
}
