package es.cursojava.hibernate.ejercicios.ejercicio1correccion.dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import es.cursojava.hibernate.ejercicios.ejercicio1correccion.entites.Curso;
import utils.UtilidadesHibernate;

public class CursoDAOImpl implements CursoDAO {

	private Session session;
	private Transaction transaction;

	public CursoDAOImpl() {
		session = UtilidadesHibernate.getSessionFactory();
		transaction = session.beginTransaction();
	}

	public void guardarCurso(Curso curso) {
		session.persist(curso);
	}

	public void eliminarCurso(Long id) {

	}

	public void actualizarCurso(Curso curso) {

	}

	public Curso obtenerCursoPorId(Long id) {
		return session.get(Curso.class, id);
	}

	public List<Curso> obtenerTodosLosCursos() {

		return session.createQuery("from Curso", Curso.class).list();

	}

	public void commitTransaction() {
		transaction.commit();
	}

	@Override
	public List<Curso> obtenerCursosActivos() {

		Query<Curso> query = session.createQuery("from Curso where activo = true", Curso.class);

		return query.list();
	}

	@Override
	public List<Curso> obtenerCursosPorNombre(String nombre) {
		// Si no se proporciona nombre, devolvemos todos los cursos
		if (nombre == null || nombre.trim().isEmpty()) {
			return obtenerTodosLosCursos();
		}

		// En HQL no se deben poner los comodines (%) dentro de la cadena de la consulta
		// junto al placeholder.
		// Uso correcto: '... where nombre like :nombreParam' y paso '%valor%' al
		// parámetro.
		Query<Curso> query = session.createQuery("from Curso where nombre like :nombreParam", Curso.class);
		query.setParameter("nombreParam", "%" + nombre.trim() + "%");

		return query.list();
	}
	
	public static void filtrarCampos() {
		CursoDAOImpl dao = new CursoDAOImpl();
		List<Curso> 
		//PENDIENTE REVISAR COSAS DEL PROFESOR
	}

	public Curso obtenerCursoPorCodigo(String codigo) {
		return session.get(Curso.class, codigo);
	}

	// la fecha de inicio debe de ser 01/02/2025
	public List<Curso> obtenerCursoPorCategoria(String categoria) {
		if (categoria == null || categoria.trim().isEmpty()) {
			System.out.println("Hay algun problema con la categoria");
		}

		LocalDate fechaFiltro = LocalDate.of(2025, 2, 1);
		Query<Curso> query = session.createQuery(
				"from Curso where categoria like :categoriaParam and fechaInicio = :fechaParam", Curso.class);

		query.setParameter("categoriaParam", "%" + categoria.trim() + "%");
		query.setParameter("fechaParam", fechaFiltro);

		return query.list();
	}

	public List<Curso> obtenerNombreDescripcionCursos() {

		// tenemos que ir a los atributos, nunca debemos de hacer referencia a los
		// campos de la base de datos, si no a los atributos de la clase
		// lo que devuelve es un listado de arrays de tipo Object, donde cada array es una posicion que tenemos en la tabla
		// si tenemos 6 registros en una tabla, vamos a tener un listado con 6 arrays
		String hqlQuery = "select new es.cursojava.hibernate.ejercicios.ejercicio1correccion.entites.Curso (c.nombre, c.descripcion) " + "from Curso c";
		
		List<Curso> cursos = session.createQuery(hqlQuery,Curso.class).setMaxResults(3).list(); // setMaxResults te devuelve los tres primeros elementos ordenados por nombre
		// Seria lo mismo que hacer todo esto:
//		List<Object[]> datos = session.createQuery("select c.nombre, c.descripcion from Curso c").list();
//		List<Curso> cursos = new ArrayList<>();
//		for (Object[] fila : datos) {
//			String nombre = (String) fila[0];
//			String descripcion = (String) fila[1];
//			Curso curso = new Curso(nombre, descripcion);
//			cursos.add(curso);
//			System.out.println("Nombre" + nombre + ", Descripcion: " + descripcion);
//		}
	return null;
}

}
