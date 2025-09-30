package es.cursojava.inicio.interfaces.ejercicio.gestionVehiculos;

public abstract class Vehiculo {

	private String nombre;
	private double precio;
	private String color;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Vehiculo(String id, String nombre) {
		super();
		this.nombre = nombre;
		this.id = id;
	}

	public Vehiculo(String id, String nombre, String color, double Precio) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.id = id;
		this.precio = precio;
	}

}
