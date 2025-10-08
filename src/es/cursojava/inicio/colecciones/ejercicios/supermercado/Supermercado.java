package es.cursojava.inicio.colecciones.ejercicios.supermercado;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Supermercado {
	
	private String nombre;
	private final List<List<Alimento>> stockAlimentos = new ArrayList<>();
	private final Set<ClienteSupermercado> clientes = new LinkedHashSet<>();
	
	
	public Supermercado(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<List<Alimento>> getStockAlimentos() {
		return stockAlimentos;
	}
	public Set<ClienteSupermercado> getClientes() {
		return clientes;
	}
	
	public void addCliente(ClienteSupermercado c) {
		clientes.add(c);
	}
	
	private List<Alimento> encontrarGrupoPorNombre(String nombre){
		for (List<Alimento> grupo: stockAlimentos) {
			if(!grupo.isEmpty() && grupo.get(0).getNombre().equalsIgnoreCase(nombre)) {
				return grupo;
			}
		}
		return null;
	}
	
	public void mostrarDisponiblesPara(String nombreCliente) {
		System.out.println("\n" + nombreCliente + " ->");
		for (List<Alimento> grupo : stockAlimentos) {
			if (!grupo.isEmpty()) {
				String n = grupo.get(0).getNombre();
				int cantidad = grupo.size();
				System.out.println("Producto:" + n + " Cantidad: " + cantidad + " uds en stock");
			}
		}
	}
	
	private boolean vender(String nombreProducto, int cantidad, ClienteSupermercado cliente) {
		List<Alimento> grupo = encontrarGrupoPorNombre(nombreProducto);
		if(grupo == null || grupo.size() < cantidad) {
			return false;
		}
		for (int i = 0 ;i< cantidad; i++) {
			Alimento unidad = grupo.remove(grupo.size()-1);
			cliente.addAlimento(unidad);
		}
		return true;
	}
	
	public void atenderCliente(Scanner sc, ClienteSupermercado cliente) {
		while (true) {
			mostrarDisponiblesPara(cliente.getNombre());
			System.out.print("¿Qué producto desea? ");
			String producto = sc.nextLine();
			if (producto.isEmpty()) {
				break;
			}
			
			System.out.print("¿Cuanto quieres del producto " + producto + "? ");
			int cantidad = sc.nextInt();
			sc.nextLine();
			if (cantidad <= 0) {
				System.out.println("El numero debe de ser positivo");
			}
			
			boolean ok = vender(producto, cantidad, cliente);
			if(!ok) {
				System.out.println("No hay suficiente stock del producto" + producto);
			} else {
				System.out.println("Añadido al carrito de: " + cliente.getNombre() + " el producto: " + producto + " || " + cantidad + "unidades");
			}
			
			System.out.println("¿Quiere seguir comprando? (s/n):");
			String seguir = sc.nextLine().trim();
			if (!seguir.equalsIgnoreCase("s")) {
				break;
			}
			
		}
	}
	
	public void addStock (Alimento modelo,int unidades) {
		List<Alimento> grupo = encontrarGrupoPorNombre(modelo.getNombre());
		if (grupo == null) {
			grupo = new ArrayList<>();
			stockAlimentos.add(grupo);
		}
		
		for (int i = 0; i < unidades; i++) {
			grupo.add(new Alimento(modelo.getNombre(), modelo.getPrecio()));
		}
	}
	
	public void cobrarTodos()  {
		System.out.println("\n-------Tickects--------");
		for (ClienteSupermercado c : clientes) {
			System.out.println("\nCliente: " + c.getNombre());
			double total = 0.0;
			for (Alimento a : c.getCarritoCompra()) {
				System.out.printf(a.getNombre(),a.getPrecio());
				total += a.getPrecio();
			}
			System.out.printf("TOTAL: ", total);
		}
	}

}
