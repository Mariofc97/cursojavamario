package es.cursojava.hibernate.ejercicios.ejercicio1correccion.service;

import es.cursojava.hibernate.ejercicios.ejercicio1correccion.dao.AulaDAO;
import es.cursojava.hibernate.ejercicios.ejercicio1correccion.dao.AulaDAOImpl;
import es.cursojava.hibernate.ejercicios.ejercicio1correccion.dao.CursoDAO;
import es.cursojava.hibernate.ejercicios.ejercicio1correccion.dao.CursoDAOImpl;
import es.cursojava.hibernate.ejercicios.ejercicio1correccion.dto.AulaDTO;
import es.cursojava.hibernate.ejercicios.ejercicio1correccion.dto.CursoDTOReq;
import es.cursojava.hibernate.ejercicios.ejercicio1correccion.entites.Aula;
import es.cursojava.hibernate.ejercicios.ejercicio1correccion.entites.Curso;

public class CursoServiceImpl implements CursoService {

    private final CursoDAO cursoDAO;
    private final AulaDAO aulaDAO;

    public CursoServiceImpl() {
        this.cursoDAO = new CursoDAOImpl();
        this.aulaDAO = new AulaDAOImpl();
    }

    // ========= MÉTODOS BÁSICOS =========

    @Override
    public void altaCurso(CursoDTOReq cursoDTO) {
        Curso curso = new Curso();
        curso.setCodigo(cursoDTO.getCodigo());
        curso.setNombre(cursoDTO.getNombre());
        curso.setDescripcion(cursoDTO.getDescripcion());
        curso.setHorasTotales(cursoDTO.getHorasTotales());
        curso.setActivo(true);

        cursoDAO.guardarCurso(curso);
        ((CursoDAOImpl)cursoDAO).commitTransaction();
    }

    @Override
    public void altaAula(AulaDTO aulaDTO) {
        if (aulaDTO.getCapacidad() == null || aulaDTO.getCapacidad() <= 0) {
            throw new IllegalArgumentException("La capacidad del aula debe ser mayor que 0");
        }

        Aula aula = new Aula();
        aula.setCodigoAula(aulaDTO.getCodigoAula());
        aula.setCapacidad(aulaDTO.getCapacidad());
        aula.setUbicacion(aulaDTO.getUbicacion());

        aulaDAO.guardarAula(aula);
        ((AulaDAOImpl)aulaDAO).commitTransaction();
    }

    // ========= ENUNCIADO =========

    @Override
    public void crearCursoConAula(CursoDTOReq cursoDTO, AulaDTO aulaDTO) {

        // 1) Validar capacidad de aula
        if (aulaDTO.getCapacidad() == null || aulaDTO.getCapacidad() <= 0) {
            throw new IllegalArgumentException("La capacidad del aula debe ser mayor que 0");
        }

        // 2) Crear entidades
        Aula aula = new Aula(
            aulaDTO.getCodigoAula(),
            aulaDTO.getCapacidad(),
            aulaDTO.getUbicacion()
        );

        Curso curso = new Curso();
        curso.setCodigo(cursoDTO.getCodigo());
        curso.setNombre(cursoDTO.getNombre());
        curso.setDescripcion(cursoDTO.getDescripcion());
        curso.setHorasTotales(cursoDTO.getHorasTotales());
        curso.setActivo(true);
        curso.setAula(aula); // relación OneToOne

        // 3) Guardar solo curso; por cascade = CascadeType.ALL se persiste también el aula
        cursoDAO.guardarCurso(curso);
        ((CursoDAOImpl)cursoDAO).commitTransaction();
    }

    @Override
    public void asignarAula(Long cursoId, Long aulaId) {

        // 1) Validar que el aula no esté ya asignada a otro curso
        // (Necesitas un método en AulaDAO o CursoDAO, por ej: cursoDAO.obtenerCursoPorAula(aulaId))
        Curso cursoQueYaUsaEsaAula = aulaDAO.obtenerCursoPorAulaId(aulaId);
        if (cursoQueYaUsaEsaAula != null) {
            throw new IllegalStateException("El aula ya está asignada a otro curso");
        }

        // 2) Usar el DAO para hacer la asignación física (punto 4 que ya hiciste)
        cursoDAO.asignarAula(cursoId, aulaId);
        ((CursoDAOImpl)cursoDAO).commitTransaction();
    }

	@Override
	public void altaAula() {
		// TODO Auto-generated method stub
		
	}
}
