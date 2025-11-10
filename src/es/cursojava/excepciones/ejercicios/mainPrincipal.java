package es.cursojava.excepciones.ejercicios;

import java.util.ArrayList;
import java.util.List;

import utils.Utilidades;

public class mainPrincipal {
	
	public static void main(String[] args) {
		
		List<Alumno> alumnos = crearAlumnos();
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}

	}
	
	private static List<Alumno> crearAlumnos () {
		List<Alumno> alumnos = new ArrayList();
		for (int i = 0; i < 5; i++) {
			System.out.println("Pidiendo datos alumno "+ (i+1));
			try {
				Alumno alumno = new Alumno(Utilidades.pideDatoCadena("Nombre"),
						Utilidades.pideDatoCadena("DNI"),Utilidades.pideDatoDecimal("Notamedia")
						,null,Utilidades.pideDatoNumerico("Edad"));
				
				alumnos.add(alumno);
				
				System.out.println("Alumno "+ (i+1) +" creado correctamente");
			} catch (NotaInvalidaException nive) {
				System.err.println(nive.getClass().getSimpleName() + nive.getMessage());
				//System.out.println();

			} catch (Exception e) {
				System.out.println("Exception "+e.getMessage());
			}
		}
		
		return alumnos;
	}

}
