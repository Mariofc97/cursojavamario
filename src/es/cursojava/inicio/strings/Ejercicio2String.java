package es.cursojava.inicio.strings;

import java.util.Scanner;

public class Ejercicio2String {

	public static void main(String[] args) {
		
//		Ejercicio 2
//		==============================
//		Escribe un programa que determine si un String ingresado por el usuario es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda, ignorando mayúsculas y espacios).
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la palabra que desees: ");
		String palabraUsuario = scan.nextLine();
		String palabraInvertida = "";
		for (int i=palabraUsuario.length()-1; i >= 0;i--) {
			palabraInvertida = palabraInvertida + palabraUsuario.charAt(i);
		}
		
		
		System.out.println(palabraInvertida);
		
		if(palabraInvertida.equals(palabraUsuario)) {
			System.out.println(palabraUsuario + " es palindromo");
		} else {
			System.out.println(palabraUsuario + " no es palindromo");
		}

		

	}
}
