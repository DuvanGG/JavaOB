/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.javaob;

/**
 *
 * @author duvan
 */
public interface CocheCRUD {
    
    //Creacion de la interfaz
    //metodos de CocheCRUD
    
    String save();
    String findAll();
    String delete();
    
    //Creacion de implementacion
    
    public static class CocheCRUDImpl implements CocheCRUD{
        
        // Implementacion de la interfaz CocheCRUD

        @Override
        public String save() {
            String mensaje = "Soy el metodo para guardar - Guardando...";
            return mensaje;
        }

        @Override
        public String findAll() {
            String mensaje = "Soy el metodo para buscar - Buscando...";
            return mensaje;
        }

        @Override
        public String delete() {
            String mensaje = "Soy el metodo para borrar - Borrando...";
            return mensaje;
        }
        
    } 
    
    // Clase main
    public static void main(String[] args){
        
        CocheCRUD cocheCrud = new CocheCRUDImpl();
        
        System.out.println(cocheCrud.save());
        System.out.println(cocheCrud.findAll());
        System.out.println(cocheCrud.delete());

        
    }
    
    
}
