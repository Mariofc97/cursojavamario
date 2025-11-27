package es.cursojava.hibernate.ejercicios.ejercicio1correccion.dao;

import java.util.List;

import es.cursojava.hibernate.ejercicios.ejercicio1correccion.entites.Curso;



public interface CursoDAO {

	public void guardarCurso(Curso curso);
	
	public void eliminarCurso(Long id); 
	
	public void actualizarCurso(Curso curso);
	
	public Curso obtenerCursoPorId(Long id);
	
	public List<Curso> obtenerTodosLosCursos();
	
	public List<Curso> obtenerCursosActivos();
	
	public List<Curso> obtenerCursosPorNombre(String nombre);
}
