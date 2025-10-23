package es.cursojava.inicio.mapas.ejercicios;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainBiblioteca {

	public static void main(String[] args) {
		
		Map<Autor,List<Libro>> biblioteca = new HashMap<>();
		
		Libro libro1 = new Libro("Lololo","ISB457",2000);
		Libro libro2 = new Libro("Lelele","ISB458",2010);
		Libro libro3 = new Libro("lilili","ISB459",2011);
		Libro libro4 = new Libro("Lululu","ISB450",2005);
		Libro libro5 = new Libro("Tralari","ISB456",2007);
		Libro libro6 = new Libro("El mejor libro del mundo","ISB454",2009);
		Libro libro7 = new Libro("Phantom's opera","ISB455",2014);
		Libro libro8 = new Libro("Mimotoalpinaderrapante","ISB453",2015);
		Libro libro9 = new Libro("Bojack Horseman","ISB452",2015);
		
		List<Libro> libros = Arrays.asList(libro1,libro2,libro3,libro4,libro5,libro6,libro7,libro8,libro9);
		
		Autor autor1 = new Autor("Mario Ferron","española");
		Autor autor2 = new Autor("Ayumu Miyamoto","japonesa");
		Autor autor3 = new Autor("Josephine Smith","canadiense");
		
		List<Autor> autores = Arrays.asList(autor1, autor2, autor3);
		
		mostrarDatosAutores(autores);
		mostrarTitulosMas2010(libros);
		

	}
	
	private static void mostrarDatosAutores(List<Autor> autores) {
		
		System.out.println("Datos autores: ");
		for (Autor autor : autores) {
			System.out.println("Nombre: " + autor.getNombre());
			System.out.println("Nacionalidad: " + autor.getNacionalidad());
		}
	}
	
	private static void mostrarTitulosMas2010(List<Libro> libros) {
		System.out.println("Mostrar titulos publicados despues de 2010: ");
		for (Libro l : libros) {
			if (l.getAnio()>2015) {
				System.out.println("Titulo: " + l.getTitulo());
				System.out.println("Año: " + l.getAnio());
			}
		}
	}
	
	

}
