package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class BuclesEjercicio3 {

	public static void main(String[] args) {
		
//		3. Pedir 10 numeros --> Indicar cuantos son multiplos de 3 y cuantos multiplos de 5
		
		Scanner scan = new Scanner(System.in);
		int contadorMultiplo3 = 0;
		int contadorMultiplo5 = 0;
				
		for (int i=0 ; i<10; i++) {
			System.out.println("Introduce un numero: ");
			int numero = scan.nextInt();
			if(numero % 3==0) {
				contadorMultiplo3++;
			}
			if(numero % 5==0) {
				contadorMultiplo5++;
			}
		}
		
		System.out.println("Se han introducido: " + contadorMultiplo3 + " numeros multiplo de 3 y " + contadorMultiplo5 + " numeros multiplo de 5");
		
		
	}
}