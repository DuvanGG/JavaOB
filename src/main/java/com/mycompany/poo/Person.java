package com.mycompany.poo;

/**
 * La Programación Orientada a Objetos (POO) es un paradigma de programación que 
 * se basa en el concepto de clases y objetos. En este paradigma, los programas se 
 * modelan en torno a objetos que aglutinan toda la funcionalidad relacionada con 
 * ellos. La POO se utiliza para estructurar un programa de software en piezas simples 
 * y reutilizables de planos de código (clases) para crear instancias individuales 
 * de objetos. 
 * 
 * @author duvan
 *
 */

public class Person {
	
	/**
	 * atributes
	 */
	String name;
	int edad;
	String gender;
	int yearBirth;
	
	
	/**
	 * constructors
	 */
	public Person() {
		
	}
	
	public Person(String name, int edad, String gender, int yearBirth) {
		// this.atributhe = param
		this.name = name;
		this.edad = edad;
		this.gender = gender;
		this.yearBirth = yearBirth;
	}
	
	
	
	/**
	 * methods
	 */
	public void printInfo() {
		System.out.println("Nombre: " + this.name);
		System.out.println("Edad: " + this.edad);
		System.out.println("Genero: " + this.gender);
		System.out.println("Año de nacimiento: " + yearBirth);
	}
	
	public int calcularEdadBisiesta() {
		
		int edadBisiesta = this.edad + (this.edad / 4);
		System.out.println("Edad en años bisiestos: " + edadBisiesta);		
		return edadBisiesta;
	}

}
