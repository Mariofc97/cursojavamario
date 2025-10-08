package es.cursojava.inicio.colecciones.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

import java.util.Arrays;

import poo.Alumno2;

public class Ejercicio1Listas {
	
	public static void main(String[] args) {
		
		//==================== Ejercicio 1: Listas ====================
		
		//1. Creamos 6 alumnos
		
		
		//2. Los metemos todos en una lista
		
		
		Alumno2 alumno1 = new Alumno2("N1","111A",8);
		Alumno2 alumno2 = new Alumno2("N2","111A",3);
		Alumno2 alumno3 = new Alumno2("N3","111A",4);
		Alumno2 alumno4 = new Alumno2("N4","111A",5);
		Alumno2 alumno5 = new Alumno2("N5","111A",9.5);
		Alumno2 alumno6 = new Alumno2("N6","111A",9.6);
		
		List<Alumno2> listaAlumnos = new CopyOnWriteArrayList<Alumno2>();
		
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		
		
		showInfo(listaAlumnos);
		
		showNameGrade(listaAlumnos);
		findByName(listaAlumnos);
		removeFails(listaAlumnos);
		
		
	}
	
	//3. Creamos un método para mostrar la info de todos los alumnos
	private static void showInfo(List<Alumno2> lista) {
		
		for(Alumno2 a:lista) {
		System.out.println(a);
		}
	}
	


			

    // 4. Mostrar nombre y nota de alumnos con notaMedia > 9
    private static void showNameGrade(List<Alumno2> lista) {
        System.out.println("\n=== Alumnos con nota > 9 ===");
        for (Alumno2 a : lista) {
            if (a.getNotaMedia() > 9) {
                System.out.println("Nombre" + a.getNombre() + " Nota media: " + a.getNotaMedia());
            }
        }
    }

    // 5. Pedir un nombre y mostrar la notaMedia de todos los que se llamen igual
    private static void findByName(List<Alumno2> lista) {
        System.out.println("\n=== Buscar por nombre ===");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduce un nombre: ");
            String buscado = sc.nextLine();
            boolean encontrado = false;
            for (Alumno2 a : lista) {
                if (a.getNombre().equalsIgnoreCase(buscado)) {
                    System.out.println(a.getNombre() + " -> " + a.getNotaMedia());
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("No se encontraron alumnos con el nombre: " + buscado);
            }
        }
    }

    // 6. Eliminar alumnos suspensos (<5)
	private static void removeFails(List<Alumno2> listaAlumnos) {
//		for (int i = 0; i < listaAlumnos.size(); i++) {
//			Alumno alumno = listaAlumnos.get(i);
//			if(alumno.getNotaMedia()<5) {
//				System.out.println("Alumno eliminado "+alumno.getNombre());
//				listaAlumnos.remove(alumno);
//			}
//		}
		
		
		for (Alumno2 alumno : listaAlumnos) {
			if(alumno.getNotaMedia()<5) {
				listaAlumnos.remove(alumno);
			}
			
		}
		
	}	

}
