package es.cursojava.inicio.metodos.ejercicios;

import java.util.Scanner;

public class Ejercicio1Metodos {

//	Ejercicio 1
//	====================================================================================
//	En una clase 
//	+ Escribe un método que pinte la tabla de multiplicar de un numero que le pases
//	+ Escribe un método que pinte las tablas de multiplicar de los números que estén entre dos números que le pases
//	+ Desde el main llamar a los dos métodos

	public static void main(String[] args) {

		tablaMultiplicar(8);
		tablasMultiplicar(8, 10);
	}

	public static void tablaMultiplicar(int numero) {

		System.out.println("****TABLA DE MULTIPLICAR DEL " + numero + "****");
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + "x" + i + "=" + (i * numero));
		}
	
	}

	public static void tablasMultiplicar(int inicial, int fin) {
		System.out.println("\n Segunda parte del ejercicio\n");
		
		for (int i = inicial; i <= fin; i++) {
			tablaMultiplicar(i);
		}
	
	}
		
}
