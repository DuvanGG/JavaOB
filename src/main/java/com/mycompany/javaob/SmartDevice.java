/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaob;

/**
 *
 * @author duvan
 */
public class SmartDevice {
    
    public static void main(String[] args) {
        
         //Crar objeto - SmartWatch
         SmartWatch miReloj = new SmartWatch("Huawei", "GT2", "Negro", "Redondo", "Cuero");
         System.out.println("SmartWatch: " + miReloj);
         
         //Crar objeto - SmartPhone
         SmartPhone miCelular = new SmartPhone("Tesla", "Pi", "Gris", 2000, 100);
         System.out.println("SmartPhone: " + miCelular);
         
        
    }
    
    // 1.Atributos SmartDevice
    
    String marca;
    String referencia;
    String color;
    
    
    // 2.Constructor SmartDevice
    
    public SmartDevice(){
        
    }
    
    public SmartDevice(String marca, String referencia, String color){
        this.marca = marca;
        this.referencia = referencia;
        this.color = color;
        
    }
    
    // 3.Metodos SmartDevice
    
    
    
    public static class SmartPhone extends SmartDevice {
        
        // 1.Atributos
        
        int almacenamiento;
        int camaraPixels;
        
        // 2.Constructor
        public SmartPhone(){
            
        }
        
        public SmartPhone(String marca, String referencia, String color, int almacenamiento, int camaraPixels){
            super(marca, referencia, color);
            this.almacenamiento = almacenamiento;
            this.camaraPixels = camaraPixels;
            
        }
        
        // 3.Metodos

        @Override
        public String toString() {
            return "SmartPhone{" + "marca=" + marca + ", referencia=" + referencia + ", color=" + color + ", almacenamiento=" + almacenamiento + ", camaraPixels=" + camaraPixels + '}';
        }
        
    
    }

    
    public static class SmartWatch extends SmartDevice {
        
        // 1.Atributos
        
        String forma;
        String materialCorrea;
        
        // 2.Constructor
        public SmartWatch(){
            
        }
        
        public SmartWatch(String marca, String referencia, String color,String forma, String materialCorrea){
            super(marca, referencia, color);
            this.forma = forma;
            this.materialCorrea = materialCorrea;
            
        }
        
        // 3.Metodos

        @Override
        public String toString() {
            return "SmartWatch{" + "marca=" + marca + ", referencia=" + referencia + ", color=" + color + ", forma=" + forma + ", materialCorrea=" + materialCorrea + '}';
        }
        
    
    }

    
}


