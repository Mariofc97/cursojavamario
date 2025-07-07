package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class BuclesEjercicio9 {

	public static void main(String[] args) {

//		9. Pintar el menu hasta que se puse la opción de salir. 
//
//		1. Pintar Cuadrado
//		2. Validar email
//		3. Añadir Alumno
//		4. Salir
//
//		Elige una opción
//
//	Si se pulsa la opción 1, solicitar el tamaño de los lados de un cuadrado y pintar el cuadrado de la siguiente manera:
//	Por ejemplo si el tamaño es 4:
//
//			****
//			*  *
//			*  *
//			****

		System.out.println("Pintar menu: \n1. Pintar Cuadrado. \n2. Validar email. \n3. Añadir Alumno \n4. Salir");

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca unicamente el numero de la opción deseada: ");
		int opcion = scan.nextInt();

		switch (opcion) {
		case 1:
			System.out.print("Introduce el tamaño del cuadrado: ");
			int tam = scan.nextInt();
			for (int fila = 0; fila < tam; fila++) {
				for (int col = 0; col < tam; col++) {
					if (fila == 0 || fila == tam - 1 || col == 0 || col == tam - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 2:
			System.out.println("Has elegido Validar email");
			break;
		case 3:
			System.out.println("Has elegido Añadir Alumno");
			break;
		case 4:
			System.out.println("Adios!");
			break;
		default:
			System.out.println("La opcion elegida no existe");

		}
	}

}
