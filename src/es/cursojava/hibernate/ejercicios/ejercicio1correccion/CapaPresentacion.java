package es.cursojava.hibernate.ejercicios.ejercicio1correccion;

import java.time.LocalDate;
import java.time.LocalDateTime;

import es.cursojava.hibernate.ejercicios.ejercicio1correcion.dto.CursoDTOReq;
import es.cursojava.hibernate.ejercicios.ejercicio1correcion.service.CursoService;

public class CapaPresentacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void insertarCursos() {
		CursoService cursoService = new CursoService();
		CursoDTOReq cursoDTO = new CursoDTOReq("JAVA02","Java Avanzado","Curso Java",40,true,"Basico","Programacion",299.99,LocalDate.of(2025, 11, 20), LocalDate.of(2025, 10, 20),LocalDateTime.now())
		cursoService.altaCurso(cursoDTO);
	
	}

}

