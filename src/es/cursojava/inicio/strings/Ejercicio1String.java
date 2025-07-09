package es.cursojava.inicio.strings;

import java.util.Scanner;

public class Ejercicio1String {
	
	public static void main(String[] args) {
//		Ejercicio 1
//		==============================
//		Escribe un programa que reciba un String y devuelva el texto invertido.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la frase que desees: ");
		String fraseUsuario = scan.nextLine();
		String fraseInvertida = "";
		
		for (int i=fraseUsuario.length()-1; i >= 0;i--) {
			fraseInvertida = fraseInvertida + fraseUsuario.charAt(i);
		}
		

		System.out.println("El texto invertido es: " + fraseInvertida);
		
		//Utilizando StringBuilder
		String texto = "Hola";
		StringBuilder sb1 = new StringBuilder(texto);
		System.out.println("Reverse: "+sb1.reverse());

	}

}
