package es.cursojava.hibernate.ejercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;

import utils.UtilidadesHibernate;

public class MainCursos {

	public static void main(String[] args) {
		UtilidadesHibernate.crearConexion();
		insertarCursosEjemplo();
	}
	
	private static void insertarCursosEjemplo() {
		System.out.println();
		
		Curso c1 = new Curso("JAVA01","Java Básico","Curso Java",40,true,"Basico","Programacion",299.99,LocalDate.of(2025, 11, 20), LocalDate.of(2025, 10, 20),LocalDateTime.now());
		Curso c2 = new Curso("PYTHON01","Python Avanzado","Curso Python",40,true,"Avanzado","Programacion",399.99,LocalDate.of(2025, 11, 20), LocalDate.of(2025, 10, 20),LocalDateTime.now());
		Curso c3 = new Curso("SQL01","SQL Básico","Curso SQL",40,true,"Basico","Programacion",299.99,LocalDate.of(2025, 11, 20), LocalDate.of(2025, 10, 20),LocalDateTime.now());

		UtilidadesHibernate.insertar(c1);
		UtilidadesHibernate.insertar(c2);
		UtilidadesHibernate.insertar(c3);
		
	}
}
