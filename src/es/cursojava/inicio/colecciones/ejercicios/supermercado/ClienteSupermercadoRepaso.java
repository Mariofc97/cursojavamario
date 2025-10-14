package es.cursojava.inicio.colecciones.ejercicios.supermercado;

import java.util.List;

import es.cursojava.inicio.interfaces.ejercicio.gestionVehiculos.Alimentos;

public class ClienteSupermercadoRepaso {

	private String nombre;
	List<Alimentos> carritoCompra;
	
	public ClienteSupermercadoRepaso(String nombre, List<Alimentos> carritoCompra) {
		super();
		this.nombre = nombre;
		this.carritoCompra = carritoCompra;
	}
	
	public ClienteSupermercadoRepaso(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Alimentos> getCarritoCompra() {
		return carritoCompra;
	}

	public void setCarritoCompra(List<Alimentos> carritoCompra) {
		this.carritoCompra = carritoCompra;
	}
	
	public void addAlimento (Alimentos alimento) {
		this.carritoCompra.add(alimento);
	}

	@Override
	public String toString() {
		return "ClienteSupermercadoRepaso [nombre=" + nombre + ", carritoCompra=" + carritoCompra + "]";
	}


	
	
	
}
