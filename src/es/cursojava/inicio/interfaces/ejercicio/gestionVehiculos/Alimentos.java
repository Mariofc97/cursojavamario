package es.cursojava.inicio.interfaces.ejercicio.gestionVehiculos;

public abstract class Alimentos extends Producto implements Consultable {

	private String fechaCaducidad;
	
	public Alimentos(String id, String nombre) {
		super(id, nombre);
		// TODO Auto-generated constructor stub
	}
	
	public Alimentos(String id, String nombre, String fechaCaducidad) {
		super(id, nombre);
		this.fechaCaducidad = fechaCaducidad;
		// TODO Auto-generated constructor stub
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	


}
