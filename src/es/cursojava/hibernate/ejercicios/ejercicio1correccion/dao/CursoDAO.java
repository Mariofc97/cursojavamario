package es.cursojava.hibernate.ejercicios.ejercicio1correccion.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.hibernate.ejercicios.ejercicio1correccion.entites.Curso;
import utils.UtilidadesHibernate;


public class CursoDAO {
	
	private Session session;
	private Transaction transaction;
	
	public CursoDAO() {
		session = UtilidadesHibernate.getSessionFactory();
		transaction = session.beginTransaction();
	}
	
	public void guardarCurso(Curso curso) {
		session.persist(curso);
	}
	
	public void eliminarCurso() {
		
	}

	public void actualizarCurso() {
		
	}
	
	public Curso obtenerCursoPorId(Long id) {
		return session.get(Curso.class, id);
	}
	
	public List<Curso> obtenerTodosLosCursos() {
		
		return session.createQuery("from Curso", Curso.class).list();
		
	}

	public void commitTransaction() {
		transaction.commit();
	}
	
	
	
}
