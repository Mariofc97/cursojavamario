package es.cursojava.inicio.interfaces.ejercicio.gestionVehiculos;

public abstract class Producto {

	private String nombre;
	private double precio;
	private String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Producto(String id, String nombre) {
		super();
		this.nombre = nombre;
		this.id = id;
	}
	
	public Producto( String id, String nombre, double precio) {
		super();
		this.id = id;
		this.precio = precio;
		this.nombre = nombre;
	}
	
	
}
