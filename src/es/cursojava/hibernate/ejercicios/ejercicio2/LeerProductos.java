package es.cursojava.hibernate.ejercicios.ejercicio2;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.hibernate.ejercicios.ejercicio1.CursoMario;
import utils.Utilidades;
import utils.UtilidadesHibernate;

public class LeerProductos {

	protected static final Logger log = LoggerFactory.getLogger(LeerProductos.class);

	public static void main(String[] args) {
		String nombreArchivo = ".\\recursos\\cursos.txt";
		ArchivoServicio servicio = new ArchivoServicio();

		try {
			log.debug(servicio.leerArchivo3(nombreArchivo));
			insertarProductosDesdeArchivo(nombreArchivo);
			List<CursoMario> cursos = obtenerTodosLosCursos();
			for (CursoMario curso : cursos) {
				System.out.println(curso);
			}
			
			eliminarCursoPorId();
			for (CursoMario curso : cursos) {
				System.out.println(curso);
			}
			

		} catch (IOException e) {
			log.error("Error al recuperar informacion del archivo {}", nombreArchivo);
			e.printStackTrace();
		}
	}

	private static void insertarProductosDesdeArchivo(String nombreArchivo) {

		System.out.println("Insertando productos desde archivo");
		ArchivoServicio servicio = new ArchivoServicio();

		List<CursoMario> cursos = new ArrayList<>();

		try {

			UtilidadesHibernate.crearConexion();
			Session session = UtilidadesHibernate.getSessionFactory();
			Transaction tx = session.beginTransaction();

			List<String> lineas = servicio.leerLineas(nombreArchivo);

			for (String linea : lineas) {

				String[] partes = linea.split("\\|");

				String codigo = partes[0];
				String nombre = partes[1];
				String descripcion = partes[2];
				int duracion = Integer.parseInt(partes[3]);
				boolean activo = Boolean.parseBoolean(partes[4]);
				String nivel = partes[5];
				String categoria = partes[6];
				double precio = Double.parseDouble(partes[7]);
				LocalDate fechaInicio = LocalDate.parse(partes[8]);
				LocalDate fechaFin = LocalDate.parse(partes[9]);

				CursoMario curso = new CursoMario(codigo, nombre, descripcion, duracion, activo, nivel, categoria, precio,
						fechaInicio, fechaFin);
				session.persist(curso);
				cursos.add(curso);
			}
			// el commit tiene que ir fuera del bucle, porque si no te cierra la sesion sin
			// acabar la primera trasaccion en la primera vuelta del bucle
			tx.commit();

		} catch (IOException e) {
			System.err.println("Error al insertar productos desde archivos: " + e.getMessage());
		}

	}

	public static List<CursoMario> obtenerTodosLosCursos() {

		return UtilidadesHibernate.getSessionFactory().createQuery("from Curso", CursoMario.class).list();

	}
	
	public static void eliminarCursoPorId(){
		long id = Utilidades.pideDatoNumerico("Introduce el id del curso que deseas eliminar: ");
		
		UtilidadesHibernate.crearConexion();
		
		try(Session session = UtilidadesHibernate.getSessionFactory()){
			
			Transaction tx = session.beginTransaction();
			
			try {
				CursoMario curso = session.get(CursoMario.class, id);
				if (curso != null) {
					session.remove(curso);
					tx.commit();
					System.out.println("Curso " + id + " eliminado");
				} else {
					System.out.println("No existe ningún curso con id" + id);
				}
			} catch (Exception e) {
				if(tx != null && tx.isActive()) {
					tx.rollback();
				}
				e.printStackTrace();
			}
		}
		
	}

//	public String leerArchivo3(String nombre) throws IOException{
//		Path path = Paths.get(nombre);
//		StringBuilder sb = new StringBuilder();
//
//		List<String> lines = Files.readAllLines(path);
//    
//    public static Map<Integer,String> mapeoApp(){
//    	
//    }
}
