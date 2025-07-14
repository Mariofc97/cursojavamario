package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class Ejercicio3Arrays {

	public static void main(String[] args) {

//		Pintar el menu . Colegio con 2 aulas y 3 puestos en cada aula
//
//		1. Insertar Alumnos -> Va a solicitar el nombre de los alumnos para las aulas que tengan puestos disponibles
//		2. Mostrar Alumnos -> Muestra los alumnos por aula, si un puesto no tiene alumno, mostrar (vacio o null)
//		3. Buscar Alumno -> Solicitar texto, Ju, mostrar aula y puesto en el que se encuentra los alumnos encontrados que contengan esos caracteres
//		4. Borrar Alumno -> Solicitar nombre, y se borra a todos los alumnos que tengan ese nombre. HAY QUE PONERLO A NULL, QUE TENGAMOS EN CUENTA QUE EL VALOR POR DEFECTO ES NULL
//		5. Salir
//
//		Elige una opción
//

		System.out.println("Colegio: \n1. Insertar Alumnos. \n2. Mostrar Alumnos. \n3. Buscar Alumno \n4. Borrar Alumno \n5. Salir");

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca unicamente el numero de la opción deseada: ");
		int opcion = scan.nextInt();
		scan.nextLine();
		
		
		
		String [][] colegio = new String [2][3];

		switch (opcion) {
		case 1:
			boolean AlumnoIngresado = false;
			
			for (int i = 0; i < colegio.length; i++) {
				for (int j = 0; j < colegio[i].length; j++) {
					
					if (colegio [i][j]==null) {
						System.out.println("Introduce el nombre del alumno que quiera ingresar: ");
						String nombreAlumno = scan.nextLine();
						colegio[i][j]=nombreAlumno;
						System.out.println("Alumno ingresado en aula " + i + " en el puesto " + j);
						AlumnoIngresado = true;
						break;
					} 
				
				}
			}
		case 2:
			for (int i = 0; i < colegio.length; i++) {
				for (int j = 0; j < colegio[i].length; j++) {
					System.out.println("\t" + colegio[i][j]);
				
				}
				System.out.println();
			}
			
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
