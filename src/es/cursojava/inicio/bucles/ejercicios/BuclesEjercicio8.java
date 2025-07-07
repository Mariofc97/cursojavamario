package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class BuclesEjercicio8 {
//	8. Numero tenistas en el top 10 --> 
//	+ Pedir por teclado la cantidad de tenistas que se apuntan a un torneo, 
//	+ por cada uno de ellos preguntar en que puesto de la ATP se encuentran. 
//	+ Indicar cuantos tenistas estarían entre los diez primeros.
	
	public static void main(String[] args) {
		
		System.out.println("¿Cuantos tenistas se apuntan al torneo? ");
		Scanner scan = new Scanner(System.in);
		int numeroTenistas = scan.nextInt();
		
		int contadorTop10 = 0;
		int fueraTop10 = 0;
		
		for (int i = 0; i < numeroTenistas;i++) {
			System.out.println("¿En que puesto de la ATP se encuentra el tenista?");
			int ranking = scan.nextInt();

			if (ranking>10) {
				fueraTop10++;
			}
			if (ranking <= 10) {
				contadorTop10++;
			}
			
			
			
			
		}
		System.out.println("Hay " +contadorTop10 + " tenistas en el top 10 de la ATP y " + fueraTop10 + " tenistas fuera del top 10" );
		
	}
	
	
}
