package es.cursojava.hibernate.ejercicios.ejercicio1correcion.service;

import es.cursojava.hibernate.ejercicios.ejercicio1correccion.dao.CursoDAOImpl;
import es.cursojava.hibernate.ejercicios.ejercicio1correccion.entites.Curso;
import es.cursojava.hibernate.ejercicios.ejercicio1correcion.dto.CursoDTOReq;

public class CursoService {

	public void altaCurso(CursoDTOReq cursoDTO) {
		// Validar curso
		if (cursoDTO.getCodigo() == null || cursoDTO.getCodigo().isEmpty() || cursoDTO.getCodigo().length() > 20) {
			throw new IllegalArgumentException("El codigo del curso es obligatorio y es erroneo.");
		}
		// Insertar curso
		CursoDAOImpl cursoDAO = new CursoDAOImpl();
		Curso curso = new Curso(cursoDTO.getCodigo(), cursoDTO.getNombre(), cursoDTO.getDescripcion(),
				cursoDTO.getHorasTotales(), cursoDTO.getActivo(), cursoDTO.getNivel(), cursoDTO.getCategoria(),
				cursoDTO.getPrecio(), cursoDTO.getFechaInicio(), cursoDTO.getFechaFin());
		// AQUI ESPERAMOS UN ENTITY
		// Guardar curso
		cursoDAO.guardarCurso(curso);
		// ahora tenemos que pasar el objeto a la capa de datos en otra clase

	}
}
