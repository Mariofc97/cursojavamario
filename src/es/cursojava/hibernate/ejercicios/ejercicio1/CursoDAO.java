package es.cursojava.hibernate.ejercicios.ejercicio1;

import java.util.List;

import org.hibernate.Session;

public class CursoDAO {
	
	private Session session;

	public void guardarCurso(CursoMario curso) {
		session.persist(curso);
	}
	
	public void eliminarCurso(CursoMario curso) {
		
	}
	
	public void actualizarCurso(CursoMario curso) {
		
	}
	
	public void obtenerCursoPorId(long id) {
		
	}
	
	public List<CursoMario> obtenerTodosLosCursos() {
		return session.createQuery("from Curso", CursoMario.class).list();
	}
	
	
	
}
