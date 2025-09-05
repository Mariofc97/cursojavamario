package poo.ejercicio3;

public class Biblioteca {
	
	public static void main(String[] args) {
		Direccion dir1 = new Direccion ("Calle Islas Aleutianas","Madrid", 28035);
		Biblioteca biblio1 = new Biblioteca ("Biblioteca Marioland",dir1, 10);
		
		Libro l1 = new Libro("El Quijote","Miguel de Cervantes",45645645);
		Libro l2 = new Libro("Harry Potter","J.K. Rowling",4562321);
		Libro l3 = new Libro("Pereza Maxima","Mario Ferron",78978789);
		Libro l4 = new Libro("Locurote","Maximo Berilio",99645645);
		Libro l5 = new Libro("K pasa??","Estopa",7851321);
		Libro l6 = new Libro("IT","Anderson Bosanova",826378789);
		
		biblio1.agregarLibro(l1);
		biblio1.agregarLibro(l2);
		biblio1.agregarLibro(l3);
		
		biblio1.mostrarInfoBiblioteca();
		
		Direccion dir2 = new Direccion ("Calle Islas Bikini","Madrid", 28840);
		Biblioteca biblio2 = new Biblioteca ("Biblioteca Waluigi",dir2, 10);
		

		
		biblio2.agregarLibro(l1);
		biblio2.agregarLibro(l2);
		biblio2.agregarLibro(l4);
		biblio2.agregarLibro(l5);
		
		
		biblio2.mostrarInfoBiblioteca();
		
	}
	
	private String nombre;
	private Direccion direccion;
	private Libro[] libros;
	private int numLibros;
	
	
	public Biblioteca(String nombre, Direccion direccion, int numLibros) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.libros = new Libro[numLibros];
	}
	
	public void agregarLibro(Libro libro) {
		if (numLibros < libros.length) {
			libros[numLibros] = libro;
			numLibros++;
		} else {
			System.out.println("La biblioteca esta llena");
		}
	}
	
	public void mostrarLibros() {
		System.out.println("Libros en la biblioteca");
		for (Libro libro : libros) {
			if(libro!=null) {
				libro.mostrarInfo();				
			}
		}
		for (int i = 0;i<numLibros; i++) {
			libros[i].mostrarInfo();
		}
	}
	
	public void mostrarInfoBiblioteca() {
		System.out.println("Biblioteca: "+ nombre);
		direccion.mostrarDireccion();
		mostrarLibros();
	}
	
	
	

}
