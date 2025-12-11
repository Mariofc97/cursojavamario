package es.cursojava.hibernate.ejercicios.ejercicio1correccion;

import es.cursojava.hibernate.ejercicios.ejercicio1correccion.dao.CursoDAO;
import es.cursojava.hibernate.ejercicios.ejercicio1correccion.dao.CursoDAOImpl;
import es.cursojava.hibernate.ejercicios.ejercicio1correccion.entites.Alumno;
import es.cursojava.hibernate.ejercicios.ejercicio1correccion.entites.Aula;
import es.cursojava.hibernate.ejercicios.ejercicio1correccion.entites.Curso;
import utils.UtilidadesHibernate;

public class CapaPresentacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CursoDAO cursoDAO = new CursoDAOImpl();
		
		UtilidadesHibernate.getSessionFactory();
		
		Aula aula = new Aula();
		aula.setCodigoAula("A-101");
		aula.setCapacidad(20);
		aula.setUbicacion("Planta 1");
		
        Curso curso = new Curso();
        curso.setCodigo("CURS1");
        curso.setNombre("Curso Hibernate");
        curso.setDescripcion("Curso de ejemplo con alumnos y aula");
        curso.setHorasTotales(40);
        curso.setActivo(true);
        curso.setCategoria("Programación");
        
        curso.setAula(aula);
        
        Alumno alumno1 = new Alumno("Mario","mario@example.com",28);
        Alumno alumno2 = new Alumno("Lore","lore@example.com",24);
        Alumno alumno3 = new Alumno("Elia","elia@example.com",22);
        Alumno alumno4 = new Alumno("Manu","manu@example.com",40);

        curso.addAlumno(alumno1);
        curso.addAlumno(alumno2);
        curso.addAlumno(alumno3);
        curso.addAlumno(alumno4);
        
        // Guardar todo basta con hacer persist del curso.
        cursoDAO.guardarCurso(curso);
        ((CursoDAOImpl) cursoDAO).commitTransaction();
        
        // recuperar el curso y mostrar su aula
        
        System.out.println("Curso: " + curso.getNombre());
        System.out.println("Aula del curso: " + curso.getAula().getCodigoAula() + " (" + curso.getAula().getUbicacion() + ")");

	}
	
//	public static void insertarCursos() {
//		CursoService cursoService = new CursoService();
//		CursoDTOReq cursoDTO = new CursoDTOReq("JAVA02","Java Avanzado","Curso Java",40,true,"Basico","Programacion",299.99,LocalDate.of(2025, 11, 20), LocalDate.of(2025, 10, 20),LocalDateTime.now())
//		cursoService.altaCurso(cursoDTO);
//	
//	}

}

