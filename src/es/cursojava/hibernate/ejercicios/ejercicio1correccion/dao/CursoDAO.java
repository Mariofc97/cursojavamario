package es.cursojava.hibernate.ejercicios.ejercicio1correccion.dao;

import java.util.List;

import es.cursojava.hibernate.ejercicios.ejercicio1correccion.entites.Curso;



public interface CursoDAO {

	public void guardarCurso(Curso curso);
	
	public void eliminarCurso(Long id); 
	
	Curso obtenerCursoPorCodigo(String codigo);
	
	public void actualizarCurso(Curso curso);
	
	public Curso obtenerCursoPorId(Long id);
	
	public List<Curso> obtenerTodosLosCursos();
	
	public List<Curso> obtenerCursosActivos();
	
	public List<Curso> obtenerCursosPorNombre(String nombre);

	public void asignarAula(Long cursoId, Long aulaId);
	
	public Curso obtenerCursoPorAulaId(Long aulaId);
	
	void commitTransaction();
}
