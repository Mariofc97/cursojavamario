package es.cursojava.inicio.colecciones.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import poo.Alumno;
import utils.Utilidades;

public class Ejercicio1ListasRepaso {

	public static void main(String[] args) {
		
		// Crear los diferentes objetos Alumno
		Alumno alumno1 = new Alumno("N1","111A",8.5);
		Alumno alumno2 = new Alumno("N1","111B",9.5);
		Alumno alumno3 = new Alumno("N3","111C",7.5);
		Alumno alumno4 = new Alumno("N4","111D",7.0);
		Alumno alumno5 = new Alumno("N5","111E",3.0);
		Alumno alumno6 = new Alumno("N6","111F",4.5);
		
		//List<Alumno> colegio = new ArrayList();
		List<Alumno> colegio = new CopyOnWriteArrayList<Alumno>();
		
		// Añadir los alumnos a la lista colegio
		colegio.add(alumno1);
		colegio.add(alumno2);
		colegio.add(alumno3);
		colegio.add(alumno4);
		colegio.add(alumno5);
		colegio.add(alumno6);
		
		System.out.println("Mostrar informacion de cada alumno: ");
		showInfo(colegio);
		bestStudents(colegio);
		mostrarNotaMediaPorNombre(colegio);
		
		eliminarSuspensos(colegio);
		System.out.println();
		System.out.println("Mostrar informacion de los alumnos despues de eliminar los alumnos suspensos de la lista");
		System.out.println();
		showInfo(colegio);
		
		
		

	}
	
	private static void showInfo(List<Alumno> colegio) {
		for (Alumno a : colegio) {
			System.out.println("Nombre: " + a.getNombre() + " DNI: " + a.getDni() + " Nota media: " + a.getNotaMedia());
		}
	}
	
	private static void bestStudents(List<Alumno> colegio) {
		List<Alumno> mejoresAlumnos = new ArrayList();
		
		for (Alumno a : colegio) {
			if (a.getNotaMedia()>9) {
				mejoresAlumnos.add(a);
			}
		}
		
		System.out.println("Estos son los alumnos con nota media mayor a 9: ");
		for (Alumno student : mejoresAlumnos) {
			System.out.println("Nombre " + student.getNombre()+ " DNI: " + student.getDni() + " Nota media: " + student.getNotaMedia());
		}
		
	}
	
	private static void mostrarNotaMediaPorNombre(List<Alumno> colegio) {
		String nombreAconsultar=Utilidades.pideDatoCadena("Introduce un nombre");
		double notasAlumnos = 0;
		int contador = 0;
		for (Alumno a : colegio) {
			if(a!=null && a.getNombre()!=null && nombreAconsultar!=null && a.getNombre().equals(nombreAconsultar)) {
				notasAlumnos += a.getNotaMedia();
				contador++;
			} 
		}
		System.out.println("La nota media de todos los alumnos llamados " + nombreAconsultar + " es igual a: " + notasAlumnos/contador);
	}
	
	private static void eliminarSuspensos(List<Alumno> colegio) {
		for (Alumno a : colegio) {
			if(a.getNotaMedia()<5) {
				colegio.remove(a);
			}
		}
	}
	
	
	
	

}
