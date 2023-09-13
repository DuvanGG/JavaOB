/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaob;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 *
 * @author duvan
 */
public class TiposAvanzados {
    
    
    public static void main(String[] args) {
        
        System.out.println("El texto al revés es: " + reverse("Hola mundo"));
        
        System.out.println("");
       
        arrayUnidimensional();
        
        System.out.println("");
        
        arrayBidimensional();
        
        System.out.println("");
         
        vector();
        
        System.out.println("");
        
        arrayList();
        
        System.out.println("");
        
        arrayListLlenado();
        
        System.out.println("");
        
        try {
            dividePorCero(3,0);
        } catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }
        
        System.out.println("");
        
        String fileIn = "/home/duvan/Documentos/JavaOB/src/main/java/com/mycompany/javaob/file";
        String fileOut = "/home/duvan/Documentos/JavaOB/src/main/java/com/mycompany/javaob/fileCopia";
        
        copiaFile(fileIn, fileOut);
             
       
             
        
       
  
        
    }
    
    //-------1. Dada una cadena devolverla al revés------- 
    
    /**
     * Dada una cadena de texto, se devuelve al revés
     * @param texto
     * @return texto al revés
     */
    public static String reverse(String texto) { 
        
        String textoReves = "";
        
        for (int i=texto.length()-1; i>=0; i--) {
            textoReves += texto.charAt(i);
        }
        
        return textoReves;
    }
    
    
    //-------2. Recorrer Array de strings mostrando solo los valores-------
    public static void arrayUnidimensional(){
        
        String array[] = {"TextoUno", "TextoDos", "TextoTres", "TextoCuatro", "TextoCinco"};
    
        for (String texto : array){
            System.out.println(texto);
         
        }
        
    }
    
    //-------3. Recorrer Array bidimencional de enteros-------
    public static void arrayBidimensional(){
        
        int[][] numeros = new int[3][3];
        
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        
        numeros[1][0] = 5;
        numeros[1][1] = 6;
        numeros[1][2] = 7;
        
        numeros[2][0] = 9;
        numeros[2][1] = 10;
        numeros[2][2] = 11;
        
        for(int i = 0; i < numeros.length; i++){
            
            //System.out.println("Valor de la fila es: " + i);
            
            for(int j = 0; j < numeros[i].length; j++){
            
                System.out.println("fila: " + i + " Columna: " + j + " valor: " + numeros[i][j]);
            
            }
            
        }
        
    }
    
    //-------4. Crear vector añadir 5 elementos, eliminar el 2do y 3er y mostrar resultado-------
    public static void vector(){
        
        Vector<Integer> vector = new Vector();
        
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        
        System.out.println("Los datos completos del vector son: " + vector);
        
        vector.remove(2);
        vector.remove(3);
        
        System.out.println("Los nuevos datos del vector son: " + vector);
        
        /*
            El vector copia los datos en otro vector, y esto es 
            una operacion muy costosa.
            por lo que se recomienda crearlo inicialmente con el espacio
            que se cree se va a utilizar.
        */ 
    }
    
    //-------5. Crear ArrayList string 4 elementos. Cópiarlo-------
    //-------en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.-------
    public static void arrayList(){
        ArrayList<String> lista = new ArrayList<String>();
               
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");
        lista.add("ElementoD");
        
        
        LinkedList<String> listaLinked = new LinkedList<String>();
        
        for (int i = 0; i < lista.size(); i++) {
            // Se añade con el metodo add() y se obtiene de la lista con el metodo get()
            listaLinked.add(i, lista.get(i));
            
            
        }
        
        // ---Copia operacion muy demandante para un computador---
        
        LinkedList<String> otraCopiaLinked = new LinkedList<String>(lista);

        System.out.println("ArrayList: " + lista);
        System.out.println("LinkedList: " + listaLinked);
        System.out.println("OtraCopia" + otraCopiaLinked);
        
       
        
    }
    
    /*
    Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. 
    A continuación, con otro bucle, recórrelo y elimina los numeros pares. 
    Por último, vuelve a recorrerlo y muestra el ArrayList final. 
    Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
    */
    
    public static void arrayListLlenado(){
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
            
            for (int j = 0; j < numeros.size(); j++) {
                if (numeros.get(j) % 2 == 0) {
                    numeros.remove(j);
                }
            }
        }
        System.out.println(numeros);
        
 
    }
    
    
    /*
    Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
    que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, 
    mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
    */
    public static void dividePorCero(int num1, int num2) throws ArithmeticException{
        
        try{
            int resultado = num1 / num2;
            System.out.println(resultado);
            System.out.println("");
            
        } catch (ArithmeticException e){
            throw new ArithmeticException();
        } finally{
            System.out.println("Demo de codigo");
        }
        
    }
    
    /*
    Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". 
    La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
    */
    
    
    
    public static void copiaFile(String fileIn, String fileOut){
        
        try {
            InputStream fichero = new FileInputStream(fileIn);
            byte []datos = fichero.readAllBytes(); //Fichero pequeño

            PrintStream ficheroCopia = new PrintStream(fileOut);
            ficheroCopia.write(datos);
            System.out.println("Se ha realizado la copia correctamente");
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e.getMessage());
        } catch (IOException e){
            System.out.println("No se puede leer el fichero: " + e.getMessage());
        }

    }
}
