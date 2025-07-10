package es.cursojava.inicio.strings;

import java.util.Scanner;

public class Ejercicio4String {

	public static void main(String[] args) {
//		Ejercicio 4
//		==============================
//		Escribe un programa que reciba un String con varias palabras separadas por espacios y determine cuál es la palabra más larga.
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Introduce la frase que desees: ");
//		String fraseUsuario = scan.nextLine();
//		
//		String[] palabras = fraseUsuario.split(" ");
//		String palabraMasLarga = "";
//		
//		for(int i=0;i<palabras.length;i++){
//			if (palabras[i].length() > palabraMasLarga.length()) {
//				palabraMasLarga = palabras[i];
//			}
//		}
//		
//		System.out.println("La palabra mas larga es: " + palabraMasLarga);
		
		String frase = "Hola soy Mario sou un paquete";
		
		while (frase.strip().contains(" ")) {	
			int posicionBlanco = frase.indexOf(" ");
			String palabra = frase.substring(0,posicionBlanco);
			System.out.println(palabra);
			frase = frase.substring(posicionBlanco+1);
			System.out.println(frase);
		}
		
	}
}
