package es.cursojava.inicio.interfaces.ejercicio.gestionVehiculos;

public abstract class Alimentos extends Producto implements Consultable {

	private String fechaCaducidad;
	private double precio;
	
	public Alimentos(String id, String nombre) {
		super(id, nombre);
		// TODO Auto-generated constructor stub
	}
	
	public Alimentos(String id, String nombre, String fechaCaducidad) {
		super(id, nombre);
		this.fechaCaducidad = fechaCaducidad;
		// TODO Auto-generated constructor stub
	}
	
	public Alimentos(String id, String nombre, double precio) {
		super(id, nombre);
		this.precio = precio;
		// TODO Auto-generated constructor stub
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	


}
