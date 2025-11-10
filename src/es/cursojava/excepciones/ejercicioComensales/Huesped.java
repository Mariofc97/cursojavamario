package es.cursojava.excepciones.ejercicioComensales;

public class Huesped extends Cliente {
	
	private String dni;

	public Huesped(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public Huesped(String nombre, String dni) {
		super(nombre);
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Huesped [dni=" + dni + "]";
	}

	
	
	

}
