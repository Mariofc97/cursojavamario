package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class BuclesEjercicio5 {
	
	public static void main(String[] args) {
		
		//5. Solicitar por consola el numero de alumnos de un aula. 
		//Pedir para cada alumno su nota
		//Indicar la nota media de todos los alumnos del aula.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el numero de alumnos en el aula: ");
		int numeroAlumnos = scan.nextInt();
		
		double sumaNotas = 0;
		for (int i = 1; i<=numeroAlumnos; i++) {
			System.out.println("Introduce la nota del alumno: ");
			double nota = scan.nextDouble();
			sumaNotas += nota;
		}
		double notaMedia = sumaNotas / numeroAlumnos;
		
		System.out.println("La nota media de la clase es: " + notaMedia);
	}

}
