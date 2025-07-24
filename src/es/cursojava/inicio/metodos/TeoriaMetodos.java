package es.cursojava.inicio.metodos;

import utils.Utilidades;

public class TeoriaMetodos {

	public static void main(String[] args) {
		
		int edad = Utilidades.calculaEdad(1968);
		System.out.println(edad);
		System.out.println("Empieza");
		metodo1();
		
		String name = "Juan";
		System.out.println(name); //Juan
		metodo2(name);
		System.out.println(name); //Juan
		
		System.out.println("Terminas");
		
		double num = metodo4();
		ClaseMetodos1.saludo(name);
	}
	
	public static void metodo1 () {
		System.out.println("Llaamdo método1");
	}
	public static void metodo2 (String nombre) {
		System.out.println(nombre); //Juan
		nombre = "Maria";
		System.out.println(nombre); //Maria
	}
	public static void metodo3 (int numero) {
		System.out.println(numero);
		numero = 5;
		System.out.println(numero);
	}
	
	private static double metodo4 () {
		return Math.random();
	}
	
	
}
