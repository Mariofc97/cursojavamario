package es.cursojava.excepciones.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class main {
	
	// AQUI ES DONDE DEBO DE LANZAR LAS EXCEPCIONES

	public static void main(String[] args) throws IllegalArgumentException, NotaInvalidaException {
		try {
			
			solicitarDatosAlumno();
		} catch (IllegalArgumentException iea) {
			System.out.println("Error " + iea.getMessage());
		} catch (NotaInvalidaException nie) {
			System.out.println("Error " + nie.getMessage());
		}

	}
	
	public static Alumno[] solicitarDatosAlumno() throws IllegalArgumentException, NotaInvalidaException {
		Alumno[] alumnos = new Alumno[5];
		Scanner scan = new Scanner(System.in);
		
		try {
			for (int i=0; i<alumnos.length; i++) {
				System.out.println();
				System.out.println("Introduzca el nombre del alumno: ");
				String nombreAlumno = scan.nextLine();
				System.out.println();
				System.out.println("Introduzca la nota del alumno: ");
				double notaAlumno = scan.nextDouble();
				System.out.println();
				int edad = scan.nextInt();
				
				
				Alumno alumnoNuevo = new Alumno(nombreAlumno,edad, notaAlumno);
				alumnos[i]=alumnoNuevo;
				System.out.println("Alumno introducido en posicion " + (i+1) + " y tiene " + alumnoNuevo.getEdad() + " años generados de manera aleatoria");
			}
		} catch (IllegalArgumentException iea) {
			System.out.println("Error " + iea.getMessage());
		} catch (NotaInvalidaException nie) {
			System.out.println("Error " + nie.getMessage());
		}
		
		System.out.println(Arrays.toString(alumnos));
		return alumnos;
	}

}
