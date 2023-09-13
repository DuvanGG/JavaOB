package com.mycompany.poo;

public class Main {

	public static void main(String[] args) {
		
		//Clase identificador = new Clase()
		
		//Objeto con el constructor vacio
		Person myPerson = new Person();
		
		//objeto con parametros
		Person myPersonTwo = new Person("Pantaleon", 30, "M", 1980);
		
		System.out.println(myPersonTwo.name);
		
		
		myPersonTwo.calcularEdadBisiesta();
		System.out.println("La información de la persona 2 es: ");
		myPersonTwo.printInfo();
		System.out.println("La información de la persona 1 es: ");
		myPerson.printInfo();

	}

}
