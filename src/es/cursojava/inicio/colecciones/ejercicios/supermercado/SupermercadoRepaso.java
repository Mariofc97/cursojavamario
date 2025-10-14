package es.cursojava.inicio.colecciones.ejercicios.supermercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import es.cursojava.inicio.interfaces.ejercicio.gestionVehiculos.Aguacate;
import es.cursojava.inicio.interfaces.ejercicio.gestionVehiculos.Alimentos;
import es.cursojava.inicio.interfaces.ejercicio.gestionVehiculos.Platano;

public class SupermercadoRepaso {

	private String nombre;
	List<List<Alimentos>> stockAlimentos; 
	Set<ClienteSupermercadoRepaso> clientes;
	
	public SupermercadoRepaso(String nombre, List<List<Alimentos>> stockAlimentos,
			Set<ClienteSupermercadoRepaso> clientes) {
		super();
		this.nombre = nombre;
		this.stockAlimentos = stockAlimentos;
		this.clientes = clientes;
	}
	
	public SupermercadoRepaso(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<List<Alimentos>> getStockAlimentos() {
		return stockAlimentos;
	}

	public void setStockAlimentos(List<List<Alimentos>> stockAlimentos) {
		this.stockAlimentos = stockAlimentos;
	}

	public Set<ClienteSupermercadoRepaso> getClientes() {
		return clientes;
	}

	public void setClientes(Set<ClienteSupermercadoRepaso> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "SupermercadoRepaso [nombre=" + nombre + ", stockAlimentos=" + stockAlimentos + ", clientes=" + clientes
				+ "]";
	}
	
	public static SupermercadoRepaso abrirSupermercado (SupermercadoRepaso supermercado) {
		ClienteSupermercadoRepaso cliente1 = new ClienteSupermercadoRepaso("Cliente1");
		ClienteSupermercadoRepaso cliente2 = new ClienteSupermercadoRepaso("Cliente2");
		
		supermercado.importarProductos();
		
		supermercado.addCliente(cliente1);
		supermercado.addCliente(cliente2);
		
		return supermercado;
		
	}
	
	public void addCliente(ClienteSupermercadoRepaso cliente) {
		this.clientes.add(cliente);
	}
	
	public void importarProductos() {
		List<List<Alimentos>> alimentos = new ArrayList<List<Alimentos>>();
		
		Platano platano1 = new Platano("1","Platano Canario");
		Platano platano2 = new Platano("2","Platano Amarillo");
		Platano platano3 = new Platano("3","Platano Rojo");
		Platano platano4 = new Platano("4","Platano Maduro");
		
		List<Alimentos> platanos = new CopyOnWriteArrayList<>();
		
		platanos.add(platano1);
		platanos.add(platano2);
		platanos.add(platano3);
		platanos.add(platano4);
		
		Aguacate aguacate1 = new Aguacate("1", "Aguacate");
		Aguacate aguacate2 = new Aguacate("2", "Aguacate");
		Aguacate aguacate3 = new Aguacate("3", "Aguacate");
		Aguacate aguacate4 = new Aguacate("4", "Aguacate");
		Aguacate aguacate5 = new Aguacate("5", "Aguacate");

		List<Alimentos> aguacates = new CopyOnWriteArrayList<>();
		
		aguacates.add(aguacate1);
		aguacates.add(aguacate2);
		aguacates.add(aguacate3);
		aguacates.add(aguacate4);
		aguacates.add(aguacate5);
		
		alimentos.add(platanos);
		alimentos.add(aguacates);
		
		this.stockAlimentos = alimentos;
		
	}
	
}
