package es.cursojava.inicio.mapas.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utils.Utilidades;

public class MainBiblioteca {

	public static void main(String[] args) {

		Libro libro1 = new Libro("Lololo", "ISB457", 2000);
		Libro libro2 = new Libro("Lelele", "ISB458", 2010);
		Libro libro3 = new Libro("lilili", "ISB459", 2011);
		Libro libro4 = new Libro("Lululu", "ISB450", 2005);
		Libro libro5 = new Libro("Tralari", "ISB456", 2007);
		Libro libro6 = new Libro("El mejor libro del mundo", "ISB454", 2009);
		Libro libro7 = new Libro("Phantom's opera", "ISB455", 2014);
		Libro libro8 = new Libro("Mimotoalpinaderrapante", "ISB453", 2015);
		Libro libro9 = new Libro("Bojack Horseman", "ISB452", 2015);

		List<Libro> librosTotales = Arrays.asList(libro1, libro2, libro3, libro4, libro5, libro6, libro7, libro8,
				libro9);
		List<Libro> libros1 = Arrays.asList(libro1, libro2);
		List<Libro> libros2 = Arrays.asList(libro3, libro4, libro5, libro6);
		List<Libro> libros3 = Arrays.asList(libro7, libro8, libro9);

		Autor autor1 = new Autor("Mario Ferron", "española");
		Autor autor2 = new Autor("Ayumu Miyamoto", "japonesa");
		Autor autor3 = new Autor("Josephine Smith", "canadiense");

		List<Autor> autores = Arrays.asList(autor1, autor2, autor3);

		Map<Autor, List<Libro>> biblioteca = new HashMap<>();
		biblioteca.put(autor1, libros1);
		biblioteca.put(autor2, libros2);
		biblioteca.put(autor3, libros3);

		mostrarDatosAutores(autores);
		mostrarTitulosMas2010(librosTotales);
		mostrarAutoresConMasDeDosLibros(biblioteca);
		pideDatosBiblioteca(biblioteca);

	}

	// + mostrar las nacionalidades de los autores
	private static void mostrarDatosAutores(List<Autor> autores) {

		System.out.println("Datos autores: ");
		for (Autor autor : autores) {
			System.out.println("Nombre: " + autor.getNombre());
			System.out.println("Nacionalidad: " + autor.getNacionalidad());
		}
	}

	// + mostrar el título de todos los libros publicados después del 2010
	private static void mostrarTitulosMas2010(List<Libro> libros) {
		System.out.println("Mostrar titulos publicados despues de 2010: ");
		for (Libro l : libros) {
			if (l.getAnio() > 2015) {
				System.out.println("Titulo: " + l.getTitulo());
				System.out.println("Año: " + l.getAnio());
			}
		}
	}

	// mostrar por cada autor que tenga más de dos libros su nombre y el nombre de
	// todos los libros que tiene publicados
	private static void mostrarAutoresConMasDeDosLibros(Map<Autor, List<Libro>> biblioteca) {
		System.out.println("---------------------------");
		for (Map.Entry<Autor, List<Libro>> entrada : biblioteca.entrySet()) {

			Autor autor = entrada.getKey();
			List<Libro> librosAutor = entrada.getValue();

			if (librosAutor.size() > 2) {
				System.out.println("Autor: " + autor.getNombre());
				System.out.println("Nacionalidad: " + autor.getNacionalidad());

				for (Libro libro : librosAutor) {
					System.out.println("	Titulo: " + libro.getTitulo());
				}

			}
			System.out.println("---------------------------");

		}
	}
	
	//+ Solicitar los datos de un libro, autor, titulo, isbn y año de publicación, 
	//- si el autor no está en la biblioteca, solicitar la nacionalidad del autor y meterlo en la biblioteca, 
	//- si el autor sí está ya, agregar el libro a su listado
	
	private static void pideDatosBiblioteca(Map<Autor, List<Libro>> biblioteca) {
		String autorDeseado = Utilidades.pideDatoCadena("Introduce el autor del libro buscado: ");
		String tituloDeseado = Utilidades.pideDatoCadena("Introduce el libro que buscas: ");
		String isbnLibroDeseado = Utilidades.pideDatoCadena("Introduce el ISBN del libro que buscas: ");
		int anioLibroDeseado = Integer.parseInt(Utilidades.pideDatoCadena("Introduce el ISBN del libro que buscas: "));
		
		Libro libroNuevo = new Libro(tituloDeseado,isbnLibroDeseado,anioLibroDeseado);
		
		Autor autorEncontrado = null;
		
		for(Autor a : biblioteca.keySet()) {
			if(a.getNombre().equalsIgnoreCase(autorDeseado)) {
				a = autorEncontrado;
				break;
			}
		}
		
		if (autorEncontrado != null){
			List <Libro>librosAutor = biblioteca.get(autorEncontrado);
			librosAutor.add(libroNuevo);
			System.out.println("Libro añadido al autor existente " + autorEncontrado.getNombre());
			
		} else {
			String nacionalidadAutor = Utilidades.pideDatoCadena("Autor no encontrado. Introduce la nacionalidad del autor " + autorDeseado + " :");
			
			Autor autorNuevo = new Autor(autorDeseado,nacionalidadAutor);
			
			List<Libro> nuevaListaLibros = new ArrayList<>();
			nuevaListaLibros.add(libroNuevo);
			
			biblioteca.put(autorNuevo, nuevaListaLibros);
			
			System.out.println("Autor y libro añadidos a la biblioteca: " + autorNuevo.getNombre());
		}
	}

}
