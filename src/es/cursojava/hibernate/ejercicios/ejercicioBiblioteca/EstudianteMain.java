package es.cursojava.hibernate.ejercicios.ejercicioBiblioteca;

import java.sql.Date;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import utils.UtilidadesHibernate;

public class EstudianteMain {

	public static void main(String[] args) {
		Session session = UtilidadesHibernate.getSessionFactory();
		
		Transaction tx = session.beginTransaction();
		
		Estudiante estudiante1 = new Estudiante("Estudiante Prueba",20,"estudiante1@asdad.es");
		CarnetBiblioteca carnet1 = new CarnetBiblioteca(Date.valueOf(LocalDate.now()), Date.valueOf(LocalDate.now().plusYears(1)));
		estudiante1.setcarnetBiblioteca(carnet1);
		
		session.persist(estudiante1);
		System.out.println("Consultado estudiante con id 1");
		
		Estudiante estu = session.get(Estudiante.class, 1);
		System.out.println("Estudiante consultado");
		System.out.println(estu);
		System.out.println(estu.getCarnetBiblioteca().getFechaDeEmision());
		
		tx.commit();
		session.close();
		
	}
}
