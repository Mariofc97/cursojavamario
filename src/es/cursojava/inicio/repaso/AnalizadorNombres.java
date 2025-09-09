package es.cursojava.inicio.repaso;

import java.util.Scanner;

public class AnalizadorNombres {

	public static void main(String[] args) {
		
		String [][] nombres = {
			    {"Ana", "Luis", "Esteban"},
			    {"Isabel", "Omar", "Raul"},
			    {"Eva", "Antonio", "Ian"},
			    {"Ursula", "Elena", "Noa"}
		};
		
//		String [][]nombres =new String [4][3];
//		
//		Scanner scan =new Scanner(System.in);
//		
//		for (int i = 0; i < nombres.length; i++) {
//			for (int j = 0; j < nombres[i].length; j++) {
//				System.out.println("Introduzca el valor para la matriz [" + i + "][" + j + "]");
//				nombres[i][j]=scan.nextLine();
//			}
//		}
//		
		System.out.println("Mostrar valores de la diagonal: ");
		for (int i = 0; i < nombres.length; i++) {
			for (int j = 0; j < nombres[i].length; j++) {
				System.out.println(nombres[i][j] + "\t");
			}
		}
		
		contadorNombres(nombres);
		
	}
	
	public static void contadorNombres(String[][] nombres) {
		
		int masDeCinco = 0;
		int comienzaVocal = 0;
		int contienenA = 0;
		for (int i = 0; i < nombres.length; i++) {
			for (int j = 0; j < nombres[i].length; j++) {
				String nombre = nombres[i][j];
				if (nombre.length()>5) {
					masDeCinco++;
				}
				
				char primeraLetra = Character.toLowerCase(nombre.charAt(0));
				if (esVocal(primeraLetra)) {
					comienzaVocal++;
				}
				
				if (nombre.contains("a")) {
					contienenA++;
				}
			}
		}
		
		System.out.println("Numero de nombres con mas de cinco letras: " + masDeCinco);
		System.out.println("Numero de nombres con mas de cinco letras: " + comienzaVocal);
		System.out.println("Numero de nombres con mas de cinco letras: " + contienenA);
		
	}
	
	public static boolean esVocal(char letra) {
		return letra == 'a' || letra == 'e' || letra == 'i'|| letra =='o'|| letra =='u';
	}

}
