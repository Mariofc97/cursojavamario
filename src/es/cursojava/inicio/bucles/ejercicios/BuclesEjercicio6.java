package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class BuclesEjercicio6 {

	public static void main(String[] args) {
//		6. Conjetura Collatz
//		Solicitar un numero:
//		+Si el numero es par, se divide entre dos
//		+Si es impar se multiplicar por 3 y se le suma 1
//		se repite hasta que el valor del numero es 1
		
		int numero = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el numero deseado:");
		numero = scan.nextInt();
		do {

			if (numero %2==0) {
				numero=numero/2;
			} else {
				numero = (numero * 3)+1;
			}
			
			System.out.println("->"+numero);
				
		} while(numero !=1);
	
	}
}
			

			

