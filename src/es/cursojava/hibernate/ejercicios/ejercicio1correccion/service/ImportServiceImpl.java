package es.cursojava.hibernate.ejercicios.ejercicio1correccion.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.cursojava.hibernate.ejercicios.ejercicio1correccion.ArchivoServicio;
import es.cursojava.hibernate.ejercicios.ejercicio1correccion.dao.CursoDAO;
import es.cursojava.hibernate.ejercicios.ejercicio1correccion.dao.CursoDAOImpl;
import es.cursojava.hibernate.ejercicios.ejercicio1correccion.entites.Alumno;
import es.cursojava.hibernate.ejercicios.ejercicio1correccion.entites.Aula;
import es.cursojava.hibernate.ejercicios.ejercicio1correccion.entites.Curso;

public class ImportServiceImpl implements ImportService{

	private final ArchivoServicio archivoServicio = new ArchivoServicio();
	private final CursoDAO cursoDAO = new CursoDAOImpl();
	
	@Override
	public void importarTodo(String rutaAulas, String rutaCursos, String rutaAlumnos){

		Map<String, Aula> mapaAulas = cargarAulas(rutaAulas);
		
		Map<String, Curso> mapaCursos = cargarCursos(rutaCursos, mapaAulas); 

		cargarAlumnos(rutaAlumnos,mapaCursos);
		
		// Persistir solo curso -> cascade ALL guarda tambien aulas y alumnos
		
		for (Curso curso : mapaCursos.values()) {
			cursoDAO.guardarCurso(curso);
		}
		
		((CursoDAOImpl) cursoDAO).commitTransaction();
		
		System.out.println("Importación completada correctamente.");
		
	}
	
	private Map<String, Aula> cargarAulas(String rutaAulas) {

	    Map<String, Aula> mapaAula = new HashMap<>();

	    try {
	        List<String> lineas = archivoServicio.leerArchivo3(rutaAulas);

	        boolean primera = true;
	        for (String linea : lineas) {
	            if (primera) { // para saltar la cabecera
	                primera = false;
	                continue;
	            }

	            if (linea == null || linea.trim().isEmpty()) {
	                continue;
	            }

	            String[] partes = linea.split(";");

	            Aula aula = new Aula();
	            aula.setCodigoAula(partes[0].trim());
	            aula.setCapacidad(Integer.parseInt(partes[1].trim()));
	            aula.setUbicacion(partes[2].trim());

	            mapaAula.put(aula.getCodigoAula(), aula);
	        }

	    } catch (IOException e) {
	        throw new RuntimeException("Error leyendo el fichero de aulas: " + rutaAulas, e);
	    }

	    return mapaAula;
	}
	private Map<String, Curso> cargarCursos(String rutaCursos, Map<String, Aula> mapaAulas) {
	    Map<String, Curso> mapaCursos = new HashMap<>();

	    try {
	        List<String> lineas = archivoServicio.leerArchivo3(rutaCursos);

	        boolean primera = true;
	        for (String linea : lineas) {
	            if (primera) { // saltar cabecera
	                primera = false;
	                continue;
	            }
	            if (linea == null || linea.trim().isEmpty()) {
	                continue;
	            }

	            // Formato esperado:
	            // codigo;nombre;descripcion;horasTotales;activo;nivel;categoria;precio;fechaInicio;fechaFin;codigoAula
	            String[] partes = linea.split(";");
	            if (partes.length < 11) {
	                System.out.println("Línea de cursos ignorada (faltan columnas): " + linea);
	                continue;
	            }

	            String codigo       = partes[0].trim();
	            String nombre       = partes[1].trim();
	            String descripcion  = partes[2].trim();
	            Integer horasTot    = Integer.parseInt(partes[3].trim());
	            Boolean activo      = Boolean.parseBoolean(partes[4].trim());
	            String nivel        = partes[5].trim();
	            String categoria    = partes[6].trim();
	            BigDecimal precio   = new BigDecimal(partes[7].trim());
	            LocalDate fInicio   = LocalDate.parse(partes[8].trim()); // formato yyyy-MM-dd
	            LocalDate fFin      = LocalDate.parse(partes[9].trim());
	            String codigoAula   = partes[10].trim();

	            Aula aula = mapaAulas.get(codigoAula);
	            if (aula == null) {
	                throw new RuntimeException("No se encontró Aula con código: " + codigoAula + " para el curso " + codigo);
	            }

	            Curso curso = new Curso();
	            curso.setCodigo(codigo);
	            curso.setNombre(nombre);
	            curso.setDescripcion(descripcion);
	            curso.setHorasTotales(horasTot);
	            curso.setActivo(activo);
	            curso.setNivel(nivel);
	            curso.setCategoria(categoria);
	            curso.setPrecio(precio);
	            curso.setFechaInicio(fInicio);
	            curso.setFechaFin(fFin);
	            curso.setFechaCreacion(LocalDateTime.now()); // o lo que quieras

	            // Relación OneToOne
	            curso.setAula(aula);

	            mapaCursos.put(codigo, curso);
	        }

	    } catch (IOException e) {
	        throw new RuntimeException("Error leyendo el fichero de cursos: " + rutaCursos, e);
	    }

	    return mapaCursos;
	}

	private void cargarAlumnos(String rutaAlumnos, Map<String, Curso> mapaCursos) {

	    try {
	        List<String> lineas = archivoServicio.leerArchivo3(rutaAlumnos);

	        boolean primera = true;
	        for (String linea : lineas) {
	            if (primera) { // saltar cabecera
	                primera = false;
	                continue;
	            }
	            if (linea == null || linea.trim().isEmpty()) {
	                continue;
	            }

	            // Formato esperado:
	            // nombre;email;edad;codigoCurso
	            String[] partes = linea.split(";");
	            if (partes.length < 4) {
	                System.out.println("Línea de alumnos ignorada (faltan columnas): " + linea);
	                continue;
	            }

	            String nombre      = partes[0].trim();
	            String email       = partes[1].trim();
	            int edad           = Integer.parseInt(partes[2].trim());
	            String codigoCurso = partes[3].trim();

	            Curso curso = mapaCursos.get(codigoCurso);
	            if (curso == null) {
	                throw new RuntimeException("No se encontró Curso con código: " + codigoCurso + " para el alumno " + nombre);
	            }

	            Alumno alumno = new Alumno(nombre, email, edad);

	            // Relación bidireccional Curso <-> Alumno
	            curso.addAlumno(alumno);
	        }

	    } catch (IOException e) {
	        throw new RuntimeException("Error leyendo el fichero de alumnos: " + rutaAlumnos, e);
	    }
	}


}
