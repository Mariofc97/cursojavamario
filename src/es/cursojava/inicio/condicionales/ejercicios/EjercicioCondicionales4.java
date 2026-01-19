package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class EjercicioCondicionales4 {

	public static void main(String[] args) {

//		EJERCICIO 4
//		===============================================
//		Pintar menu
//		1. Pintar Cuadrado
//		2. Validar email
//		3. Añadir Alumno
//		4. Salir
//
//		Elige una opción
//
//		Se pide la opción por teclado, dependiendo de la opción introducida le indicamos la que ha seleccionado, si selecciona la 4 le decimos "Adios!" y si no es ninguna de las que existe que se ha equivocado

		System.out.println("Pintar menu: \n1. Pintar Cuadrado. \n2. Validar email. \n3. Añadir Alumno \n4. Salir");

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca unicamente el numero de la opción deseada: ");
		int opcion = scan.nextInt();

//		 if(opcion == 1) {
//			 System.out.println("Has elegido Pintar Cuadrado");
//		 } else if(opcion == 2) {
//			 System.out.println("Has elegido Validar email");
//		 } else if(opcion == 3) {
//			 System.out.println("Has elegido Añadir Alumno");
//		 } else if(opcion == 4) {
//			 System.out.println("Adios!");
//		 } else {
//			 System.out.println("La opcion elegida NO aparece en la lista");
//		 }
//		 		
		switch (opcion) {
		case 1:
			System.out.println("Has elegido Pintar Cuadrado");
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
		
//		Ejemplo1 switch nuevo
//		switch (opcion) {
//			case 1,3,5 -> System.out.println("Pintar Cuadrado");
//			case 2 -> System.out.println("Validar email");
//		Ejemplo 2 switch nuevo
//		String letra = "a";
//		String tipo = switch(letra) {
//			case "a", "e","i","o","u"-> "Vocal";
//			default -> "Consonante";
//		};
//		
//		System.out.println(letra + "es una " + tipo);
			
//			NO HACE FALTA break Y PUEDES INCLUIR VARIOS case A LA VEZ
		}

	}

