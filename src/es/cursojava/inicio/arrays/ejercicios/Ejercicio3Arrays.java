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

		Scanner scan = new Scanner(System.in);
		String[][] colegio = new String[2][3];
		int opcion;
		boolean salir = false;

		while (!salir) {

			System.out.println(
					"Colegio: \n1. Insertar Alumnos. \n2. Mostrar Alumnos. \n3. Buscar Alumno \n4. Borrar Alumno \n5. Salir");
			System.out.println("Introduzca unicamente el numero de la opción deseada: ");
			opcion = scan.nextInt();
			scan.nextLine();

			switch (opcion) {
			case 1:
//			1. Insertar Alumnos -> Va a solicitar el nombre de los alumnos para las aulas que tengan puestos disponibles

				while (true) {
					boolean hayHueco = false;

					for (int i = 0; i < colegio.length; i++) {
						for (int j = 0; j < colegio[i].length; j++) {
							if (colegio[i][j] == null) {
								hayHueco = true;
								break;
							}
						}
						if (hayHueco)
							break;

					}

					if (!hayHueco) {
						System.out.println("No hay mas huecos disponibles.");
						break;
					}

					boolean alumnoIngresado = false;
					
//					BUCLE FOR EACH
//					for (String [] aula: colegio) {
//						for (String alumno : aula) {
//							System.out.print(alumno);
//						}
//					}

					for (int i = 0; i < colegio.length && !alumnoIngresado; i++) {
						for (int j = 0; j < colegio[i].length; j++) {

							if (colegio[i][j] == null) {
								System.out.println("Introduce el nombre del alumno que quiera ingresar: ");
								String nombreAlumno = scan.nextLine();
								colegio[i][j] = nombreAlumno;
								System.out.println("Alumno ingresado en aula " + i + " en el puesto " + j);
								alumnoIngresado = true;
								break;
							}

						}
					}

					System.out.println("Desea insertar otro alumno? (s/n): ");
					String respuesta = scan.nextLine();
					if (!respuesta.equalsIgnoreCase("s")) {
						break;
					}
				}
				break;
			case 2:
//			2. Mostrar Alumnos -> Muestra los alumnos por aula, si un puesto no tiene alumno, mostrar (vacio o null)
				for (int i = 0; i < colegio.length; i++) {
					for (int j = 0; j < colegio[i].length; j++) {
						System.out.print("\t" + colegio[i][j]);

					}
					System.out.println();
				}
				break;

			case 3:
//			3. Buscar Alumno -> Solicitar texto, Ju, mostrar aula y puesto en el que se encuentra los alumnos encontrados que contengan esos caracteres
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

				break;
			case 4:
//			4. Borrar Alumno -> Solicitar nombre, y se borra a todos los alumnos que tengan ese nombre. HAY QUE PONERLO A NULL, QUE TENGAMOS EN CUENTA QUE EL VALOR POR DEFECTO ES NULL
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
				break;
			case 5:
				System.out.println("Saliendo del programa...");
				System.out.println("\n Adios!!");
				salir = true;
				break;

			default:
				System.out.println("La opcion elegida no existe");

			}
		}

	}
}
