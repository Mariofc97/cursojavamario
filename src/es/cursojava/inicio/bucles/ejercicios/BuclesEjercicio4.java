package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class BuclesEjercicio4 {
	
	public static void main(String[] args) {
		
//		4. Mostrar todas las tablas de multiplicar hasta el número que solicites al usuario, 
//		es decir, si el usuario me pide el 3
//		le sacamos la tabla del 1, del 2 y del 3.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numeroUsuario = scan.nextInt();
		
		
		for (int i=1 ; i<=numeroUsuario; i++) {
			System.out.println("****TABLA DE MULTIPLICAR DEL " + i + "****");

				for(int numeroTabla=1; numeroTabla<=10; numeroTabla++) {
					System.out.println(i + "x" + numeroTabla + "=" + (i*numeroTabla));
				}
				
				System.out.println();
		}
	}
	

}


