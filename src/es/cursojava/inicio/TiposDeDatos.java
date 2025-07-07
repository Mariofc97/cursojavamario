package es.cursojava.inicio;

import java.util.Scanner;

public class TiposDeDatos {

	public static void main(String[] args) {
		// **********************************
		// Tipos primitivos
		// **********************************

		// La diferencia esta en el rango de datos que almacena, y el espacio que ocupa
		int numero = 2300;
		// int ocupa 32bt entre -2.147.483.648 y 2.147.483.647
		byte edad = 10;
		// Byte ocupa 8bt entre -128 y 127
		short numero2 = 123;
		// short ocupa 16 entre -32.768 y 32.767
		long numero3 = 22156265;
		// long ocupa 64 UN NUMERO ENORME
		
		// Decimales

		double decimal1 = 9.7;
		float decimal2 = 100.9f;

		// caracteres
		char caracter = 'a'; // un solo caracter

		// Booleanos
		boolean esMayorEdad = true;

		// syso + Control + espacio para hacer print
		System.out.println("10" + edad + numero2);

		// **********************************
		// Tipos objeto
		// **********************************
		
		String nombre = "Mario";
		String nombreConvertido = nombre.toUpperCase();
		System.out.println(nombreConvertido);
		
		System.out.println(Math.random());
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce tus apellidos: ");
		String apellidos = scan.nextLine();
		
		System.out.println("Introduce tu altura: ");
		double altura = scan.nextDouble();
		
		System.out.println(nombre + " "+apellidos + " " + "y mi altura es " + altura + "cm");
		
		// Crea el paquete ejercicios dentro del paquete inicio
		// Dentro del paquete ejercicios crear la clase PideDatos con el método main
		

	}
}
