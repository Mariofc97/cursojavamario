package es.cursojava.inicio.metodos.ejercicios;

import java.util.Scanner;

public class Ejericicio5Metodos {

	static Scanner scan = new Scanner(System.in);
	static String[][] colegio = new String[2][3];
	static boolean salir = false;

	public static void main(String[] args) {

//		Ejercicio 5
//		====================================================================================
//		Rehacer el ejercicio del menú con (1. Pintar cuadrado; 2.Validar email....) 
//		usando los métodos del ejercicio anterior y por cada opción del menú generar 
//		un método para ejecutarlo.

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

		int opcion;

		while (!salir) {

			System.out.println(
					"Colegio: \n1. Insertar Alumnos. \n2. Mostrar Alumnos. \n3. Buscar Alumno \n4. Borrar Alumno \n5. Salir");
			System.out.println("Introduzca unicamente el numero de la opción deseada: ");
			opcion = scan.nextInt();
			scan.nextLine();

			switch (opcion) {
			case 1:
				opcion1();
				break;
			case 2:
				opcion2();
				break;
			case 3:
				opcion3();
				break;
			case 4:
				opcion4();
				break;
			case 5:
				opcion5();
				break;
			default:
				System.out.println("La opción elegida no existe");
			}
		}

	}

	public static void opcion1() {
		boolean hayHueco = false;

		for (int i = 0; i < colegio.length; i++) {
			for (int j = 0; j < colegio[i].length; j++) {
				if (colegio[i][j] == null) {
					hayHueco = true;
					break;
				}
			}
		}

		if (!hayHueco) {
			System.out.println("No hay más huecos disponibles.");
			return;
		}

		boolean insertarOtro = true;

		while (insertarOtro) {
			boolean alumnoIngresado = false;

			for (int i = 0; i < colegio.length && !alumnoIngresado; i++) {
				for (int j = 0; j < colegio[i].length; j++) {
					if (colegio[i][j] == null) {
						System.out.println("Introduce el nombre del alumno que quiere ingresar: ");
						String nombreAlumno = scan.nextLine();
						colegio[i][j] = nombreAlumno;
						System.out.println("Alumno ingresado en aula " + i + " en el puesto " + j);
						alumnoIngresado = true;
						break;
					}
				}
			}

			System.out.print("¿Deseas insertar otro alumno? (s/n): ");
			String respuesta = scan.nextLine();
			if (!respuesta.equalsIgnoreCase("s")) {
				insertarOtro = false;
			}
		}
	}

	public static void opcion2() {
		for (int i = 0; i < colegio.length; i++) {
			for (int j = 0; j < colegio[i].length; j++) {
				System.out.print("\t" + colegio[i][j]);

			}
			System.out.println();
		}
	}

	public static void opcion3() {

		System.out.println("Has elegido Buscar Alumno");
		System.out.println("Introduce tecto para buscar el/los alumnos deseados: ");
		String busquedaAlumno = scan.nextLine().toLowerCase();
		boolean encontrado = false;
		for (int i = 0; i < colegio.length; i++) {
			for (int j = 0; j < colegio[i].length; j++) {
				if (colegio[i][j] != null && colegio[i][j].toLowerCase().contains(busquedaAlumno)) {
					System.out.println("\nEncontrado: " + colegio[i][j] + " en aula " + i + " , puesto " + j);
					encontrado = true;
					break;
				}

			}
		}

		if (!encontrado) {
			System.out.println("No se encontro ningun alumno con ese texto");
		}

	}

	public static void opcion4() {

		System.out.println("Has elegido Borrar Alumno");
		System.out.println("Introduce el alumno que deseas eliminar: ");
		String alumnoEliminado = scan.nextLine().toLowerCase();
		boolean eliminado = false;
		for (int i = 0; i < colegio.length; i++) {
			for (int j = 0; j < colegio[i].length; j++) {
				if (colegio[i][j] != null && colegio[i][j].toLowerCase().contains(alumnoEliminado)) {
					colegio[i][j] = null;
					System.out.println("\nEl alumno " + alumnoEliminado + " se ha eliminado correctamente");
					eliminado = true;
					break;
				}
			}
		}

		if (!eliminado) {
			System.out.println("No se ha encontrado ningun alumno con ese texto");
		}
	}

	public static void opcion5() {

		System.out.println("Saliendo del programa...");
		System.out.println("\n Adios!!");
		salir = true;
	}
}
