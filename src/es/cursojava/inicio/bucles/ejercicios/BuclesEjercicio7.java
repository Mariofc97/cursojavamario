package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class BuclesEjercicio7 {

//	7. Solicitar por consola el numero de números de la serie 
//	de Fibonacci que se quieren mostrar
//	Serie de Fibonacci: 0,1,1,2,3,5,8,13,21,34,55,....
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el numero de numeros que quieres visualizar de la serie de Fibonacci: ");
		int numeroUsuario = scan.nextInt();
		
		int a= 0;
		int b= 1;
		
		for (int i=0; i<numeroUsuario; i++) {
			System.out.println("valor: "+ a);
			int nextNumber = a + b;
			a = b;
			b = nextNumber;
		}
		
	}
}

