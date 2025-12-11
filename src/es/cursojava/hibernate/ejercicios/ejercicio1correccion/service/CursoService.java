package es.cursojava.hibernate.ejercicios.ejercicio1correccion.service;

import es.cursojava.hibernate.ejercicios.ejercicio1correccion.dto.AulaDTO;
import es.cursojava.hibernate.ejercicios.ejercicio1correccion.dto.CursoDTOReq;

public interface CursoService {

	void altaCurso(CursoDTOReq cursoDTO);
	
//	public void altaCurso(CursoDTOReq cursoDTO) {
//		// Validar curso
//		if (cursoDTO.getCodigo() == null || cursoDTO.getCodigo().isEmpty() || cursoDTO.getCodigo().length() > 20) {
//			throw new IllegalArgumentException("El codigo del curso es obligatorio y es erroneo.");
//		}
//		// Insertar curso
//		CursoDAOImpl cursoDAO = new CursoDAOImpl();
//		Curso curso = new Curso(cursoDTO.getCodigo(), cursoDTO.getNombre(), cursoDTO.getDescripcion(),
//				cursoDTO.getHorasTotales(), cursoDTO.getActivo(), cursoDTO.getNivel(), cursoDTO.getCategoria(),
//				cursoDTO.getPrecio(), cursoDTO.getFechaInicio(), cursoDTO.getFechaFin());
//		// AQUI ESPERAMOS UN ENTITY
//		// Guardar curso
//		cursoDAO.guardarCurso(curso);
//		// ahora tenemos que pasar el objeto a la capa de datos en otra clase
//
//	}

	void altaAula();
	

    // Enunciado:
    void crearCursoConAula(CursoDTOReq cursoDTO, AulaDTO aulaDTO);

    void asignarAula(Long cursoId, Long aulaId);
}
