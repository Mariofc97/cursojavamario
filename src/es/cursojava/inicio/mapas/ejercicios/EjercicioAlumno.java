package es.cursojava.inicio.mapas.ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import poo.Alumno;
import utils.Utilidades;

public class EjercicioAlumno {

	public static void main(String[] args) {
		
		/*Creamos 7 alumnos

		Vamos a separar a los alumnos por aulas,

		aula1 -> 2 alumnos
		aula2 -> 1 alumnos
		aula3 -> 4 alumnos

		- Indicar cuantas aulas tiene el colegio.
		- Mostrar por cada aula los datos de los alumnos.
		- Mostrar por cada aula cuantos alumnos hay.
		- Solicitar el nombre de 1 aula y mostrar
		   todos los alumnos del aula si el aula existe.
		- Indicar cual es el aula que tiene el alumno con la nota media más alta. */
		
		Alumno alumno1 = new Alumno("N1","111A",8);
		Alumno alumno2 = new Alumno("N2","222B",3);
		Alumno alumno3 = new Alumno("N3","333C",4);
		Alumno alumno4 = new Alumno("N4","444D",5);
		Alumno alumno5 = new Alumno("N5","555E",9.5);
		Alumno alumno6 = new Alumno("N6","666F",9.6);
		Alumno alumno7 = new Alumno("N7","777G",9.9);
		
		List<Alumno> listaAula1 = new ArrayList<>();
		listaAula1.add(alumno1);
		listaAula1.add(alumno2);
		
		List<Alumno> listaAula2 = new ArrayList<>();
		listaAula2.add(alumno3);
		
		List<Alumno> listaAula3 = new ArrayList<>();
		listaAula3.add(alumno4);
		listaAula3.add(alumno5);
		listaAula3.add(alumno6);
		listaAula3.add(alumno7);
		
		Map<String, List<Alumno>> aulas = new HashMap();
		aulas.put("aula1",listaAula1);
		aulas.put("aula2",listaAula2);
		aulas.put("aula3",listaAula3);
		

		// Numero de aulas
		System.out.println("Numero de aulas: " + aulas.size());
		
		// Mostrar por cada aula los datos de los alumnos.
		for(Map.Entry<String, List<Alumno>> entry : aulas.entrySet()) {
			String aula = entry.getKey();
			List<Alumno> alumnos = entry.getValue();
			System.out.println(aula);
			for (Alumno a: alumnos) {
				System.out.println("Nombre: " + a.getNombre() + " Dni: " + a.getDni() +  " Nota media: " + a.getNotaMedia());
			}
		}
		System.out.println();
		
		// Mostrar por cada aula cuantos alumnos hay
		
		System.out.println("Datos de los alumnos por aula: ");
		
		for(Map.Entry<String, List<Alumno>> entry : aulas.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue().size() + " alumnos");
		}
		System.out.println();
		
		// - Solicitar el nombre de 1 aula y mostrar
		
		String input = Utilidades.pideDatoCadena("Introduce el aula: (aula1, aula2, aula3)");
		String aula = input.toLowerCase().trim().replace(" ", "");
		List<Alumno> alumnosAula = aulas.get(aula);
		
		if (alumnosAula.toString() != null) {
			System.out.println("Alumnos de aula " + aula);
			for (Alumno a : alumnosAula) {
				System.out.println("Nombre: " + a.getNombre() + " Dni: " + a.getDni() + " Nota media: " + a.getNotaMedia());
			}
			System.out.println();
		} else {
			System.out.println("El aula seleccionada no existe");
		}
		
		// Indicar cual es el aula que tiene el alumno con la nota media más alta
		
		Alumno mejorAlumno = null;
		String aulaTop = null;
		for(Map.Entry<String, List<Alumno>> entry : aulas.entrySet()) {
			List<Alumno> alumnos = entry.getValue();
			System.out.println(aula);
			for (Alumno a: alumnos) {
				if (mejorAlumno ==null || a.getNotaMedia()>mejorAlumno.getNotaMedia() ) {
					mejorAlumno = a;
					aulaTop = aula;					
				}
				
			}
		}
		System.out.println();
		
		if (mejorAlumno != null) {
			System.out.println("El alumno con la nota media mas alta es: " + mejorAlumno.getNombre() + " con nota: " + mejorAlumno.getNotaMedia() + " en el " + aulaTop);
			
		}
		
		
	}

}
