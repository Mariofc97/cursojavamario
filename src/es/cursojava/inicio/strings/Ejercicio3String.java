package es.cursojava.inicio.strings;

import java.util.Scanner;

public class Ejercicio3String {

	public static void main(String[] args) {
//		Ejercicio 3
//		==============================
//		Crea un programa que cuente cuántas vocales (a, e, i, o, u) tiene un String. Ignora las mayúsculas y minúsculas.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la frase que desees: ");
		String fraseUsuario = scan.nextLine();
		
		
		int countVowel=0;
		for (int i=0;i<fraseUsuario.length();i++) {
			char letra = fraseUsuario.charAt(i);
			if(letra == 'a' ||letra == 'e' ||letra == 'i' ||letra == 'o' ||letra == 'u') {
				countVowel++;
			}
		}
		System.out.println(fraseUsuario + " tiene " + countVowel+ " vocales");
	}
}
