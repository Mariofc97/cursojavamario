package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class EjercicioCondicionales2 {
	
	public static void main(String[] args) {
		
//		EJERCICIO 2
//		===============================================
//		+ Declarar la variables asignatura de tipo String, nombreAlumno de tipo String y nota de tipo int 
//		+ Inicializar las variables con valores inventados
//		+ El resultado a mostrar sería: El alumno Juan en la asignatura Matemáticas tiene un Notable
//
//		0 <5 suspenso
//		5 <7 aprobado
//		7 <9 notable
//		9-10 sobresaliente
		
		String nombreAlumno = "Juan";
		String asignatura = "Matematicas";
		
		int nota = (int) (Math.random()*10);
		
		System.out.println("El alumno" + nombreAlumno + "tiene el siguiente resultado en "+ asignatura+ "tiene un: "  + nota);
		
		if (nota < 5) {
			System.out.println("Suspenso");
		} else if (nota >= 5 && nota <7) {
			System.out.println("Aprobado");
		} else if (nota >= 7 && nota <9) {
			System.out.println("Notable");
		}else {
			System.out.println("Sobresaliente");
		}
		
//		String notaFinal = "";
//		if (nota < 5) {
//			notaFinal = "suspenso";
//		} else if (nota >= 5 && nota <7) {
//			notaFinal = "aprobado";
//		} else if (nota >= 7 && nota <9) {
//			notaFinal = "notable";
//		}else {
//			notaFinal = "sobresaliente";
//		}
//		
//		System.out.println("El alumno" + nombreAlumno + "tiene un" + notaFinal+ " el siguiente resultado en "+ asignatura);
		
		
	}

}
