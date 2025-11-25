package es.cursojava.hibernate.ejercicios.ejercicio1;

import java.util.List;

import org.hibernate.Session;

public class CursoDAO {
	
	private Session session;

	public void guardarCurso(Curso curso) {
		session.persist(curso);
	}
	
	public void eliminarCurso(Curso curso) {
		
	}
	
	public void actualizarCurso(Curso curso) {
		
	}
	
	public void obtenerCursoPorId(long id) {
		
	}
	
	public List<Curso> obtenerTodosLosCursos() {
		return session.createQuery("from Curso", Curso.class).list();
	}
	
	
	
}
