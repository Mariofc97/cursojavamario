package es.cursojava.excepciones.ejercicios;

public class Alumno {

	private String nombre;
	private int edad;
	private double nota;
	
	public Alumno(String nombre, int edad, double nota) throws IllegalArgumentException,NotaInvalidaException {
		super();
		this.nombre = nombre;
		this.edad = edad;
		comprobadorEdad();
		this.nota = nota;
		comprobadorNota();
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	// TODO: DEBO DE HACER EL THROW, NO AQUI, SI NO DIRECTAMENTE LUEGO EN EL MAIN DONDE LLAME AL METODO
	
	private void comprobadorEdad() throws IllegalArgumentException{
			if(this.edad<0) {
				IllegalArgumentException iae = new IllegalArgumentException("La edad debe ser mayor de 0");
				try {
					throw iae;
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
			} else {
				this.edad = edad;
			}
	}
	
	// TODO: DEBO DE HACER EL THROW, NO AQUI, SI NO DIRECTAMENTE LUEGO EN EL MAIN DONDE LLAME AL METODO
	
	private void comprobadorNota() throws NotaInvalidaException{
		if(this.nota < 0.0 || this.nota>10.0) {
			NotaInvalidaException nie = new NotaInvalidaException("La nota debe ser un valor entre 0 y 10");
			try {
				throw nie;
			} catch (NotaInvalidaException e) {
				System.out.println(e.getMessage());
			}
		} else {
			this.nota = nota;
		}
	}
	
	
	
	
	
	
}
