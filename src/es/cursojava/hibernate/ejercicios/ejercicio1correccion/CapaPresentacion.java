package es.cursojava.hibernate.ejercicios.ejercicio1correccion;

import es.cursojava.hibernate.ejercicios.ejercicio1correccion.service.ImportService;
import es.cursojava.hibernate.ejercicios.ejercicio1correccion.service.ImportServiceImpl;

public class CapaPresentacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        ImportService importService = new ImportServiceImpl();

		        importService.importarTodo(
		            "./resources/aulas.txt",
		            "./resources/cursos_aula.txt",
		            "./resources/alumnos_curso.txt"
		        );

		        System.out.println("Proceso finalizado desde la capa de presentación");
		    }
		
//		CursoDAO cursoDAO = new CursoDAOImpl();
//		
//		UtilidadesHibernate.getSessionFactory();
//		
//		Aula aula = new Aula();
//		aula.setCodigoAula("A-101");
//		aula.setCapacidad(20);
//		aula.setUbicacion("Planta 1");
//		
//        Curso curso = new Curso();
//        curso.setCodigo("CURS1");
//        curso.setNombre("Curso Hibernate");
//        curso.setDescripcion("Curso de ejemplo con alumnos y aula");
//        curso.setHorasTotales(40);
//        curso.setActivo(true);
//        curso.setCategoria("Programación");
//        
//        curso.setAula(aula);
//        
//        Alumno alumno1 = new Alumno("Mario","mario@example.com",28);
//        Alumno alumno2 = new Alumno("Lore","lore@example.com",24);
//        Alumno alumno3 = new Alumno("Elia","elia@example.com",22);
//        Alumno alumno4 = new Alumno("Manu","manu@example.com",40);
//
//        curso.addAlumno(alumno1);
//        curso.addAlumno(alumno2);
//        curso.addAlumno(alumno3);
//        curso.addAlumno(alumno4);
//        
//        // Guardar todo basta con hacer persist del curso.
//        cursoDAO.guardarCurso(curso);
//        ((CursoDAOImpl) cursoDAO).commitTransaction();
//        
//        // recuperar el curso y mostrar su aula
//        
//        System.out.println("Curso: " + curso.getNombre());
//        System.out.println("Aula del curso: " + curso.getAula().getCodigoAula() + " (" + curso.getAula().getUbicacion() + ")");

	}
	
//	public static void insertarCursos() {
//		CursoService cursoService = new CursoService();
//		CursoDTOReq cursoDTO = new CursoDTOReq("JAVA02","Java Avanzado","Curso Java",40,true,"Basico","Programacion",299.99,LocalDate.of(2025, 11, 20), LocalDate.of(2025, 10, 20),LocalDateTime.now())
//		cursoService.altaCurso(cursoDTO);
//	
//	}
