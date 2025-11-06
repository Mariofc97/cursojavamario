package es.cursojava.excepciones;

import java.util.Arrays;
import java.util.Scanner;

public class PracticaExcepciones {

	public static void main(String[] args) {
		// En una clase
//		main ()-->
		
//		En tres métodos distintos
		
		try {
			
//		+Pedir tamaño de un array de números, con ese dato crear el array
			int [] numeros = PracticaExcepciones.pideTamañoArray("Introduce el tamaño deseado del array");
//		+solicitar los números a ingresar en el array
			PracticaExcepciones.numerosAingresar(numeros);
//		+solicitar la posición del array para mostrar su valor
			PracticaExcepciones.mostrarValorArray("Introduce el numero que deseas buscar en el array: ", numeros);
//		Si hay alguna excepción se indica al usuario un mensaje y se vuelve a pedir la información
			
		} catch (Exception e) {
			int[] numeros = new int[0];
			System.out.println("Error general: " + e.getMessage());
			PracticaExcepciones.controlarErrores("Introduce el tamaño deseado del array","Introduce el numero que deseas buscar en el array: ", numeros);
		}
	
	}
	
	public static int[] pideTamañoArray(String texto) {
		
		int numero = 0;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		numero = scan.nextInt();
		
		int [] numeros = new int [numero];
		System.out.println(Arrays.toString(numeros));
		
		return numeros;
	}
	
	public static void numerosAingresar(int[] numeros) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el numero de la posicion " + (i+1) + " del array");
			scan = new Scanner(System.in);
			int numero = scan.nextInt();
			numeros[i] = numero;
		}
		
		System.out.println(Arrays.toString(numeros));
	}
	
	public static void mostrarValorArray(String texto,int [] numeros) {
		int numeroBuscado = 0;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		numeroBuscado = scan.nextInt();
		for (int i : numeros) {
			if (i == numeroBuscado) {
				System.out.println("El numero buscado esta en la posicion " + (i));
				break;
			} else {
				System.out.println("NO encontrado en posicion " + (i));
			}
		}
		
	}
	
	public static void controlarErrores(String texto1, String texto2, int[] numeros) {
		PracticaExcepciones.pideTamañoArray(texto1);
		PracticaExcepciones.numerosAingresar(numeros);
		PracticaExcepciones.mostrarValorArray(texto2, numeros);
	}
	

}
