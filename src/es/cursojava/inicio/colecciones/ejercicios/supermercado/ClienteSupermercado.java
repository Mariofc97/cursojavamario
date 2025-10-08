package es.cursojava.inicio.colecciones.ejercicios.supermercado;

import java.util.ArrayList;
import java.util.List;

public class ClienteSupermercado {
	
	private String nombre;
	private List<Alimento> carritoCompra = new ArrayList<>();
	
	
	public ClienteSupermercado(String nombre, List<Alimento> carritoCompra) {
		super();
		this.nombre = nombre;
		this.carritoCompra = carritoCompra;
	}
	
	public ClienteSupermercado(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Alimento> getCarritoCompra() {
		return carritoCompra;
	}

	public void setCarritoCompra(List<Alimento> carritoCompra) {
		this.carritoCompra = carritoCompra;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nombre;
	}
	


	public void addAlimento(Alimento unidad) {
		// TODO Auto-generated method stub
		carritoCompra.add(unidad);
		
	}	
	
	

}
