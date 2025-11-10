package es.cursojava.excepciones.ejercicioComensales;

import java.util.ArrayList;
import java.util.List;

public class Bar {

	private String nombre;
	
	
	public Bar(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bar bar1 = new Bar("Bar Moe's");
		System.out.println(bar1.nombre);
		bar1.abrirBar();
	}
	
	private void abrirBar() {
		List<Cliente> clientes = crearClientes();
		for (Cliente cliente: clientes) {
			if (cliente instanceof ClienteAdicto) {
				TazaCafe taza = new TazaCafe("Cafe colombiano");
				try {
					((ClienteAdicto) cliente).tomarCafe(taza);
					
				}catch(TooHotTemperatureException | TooColdTemperatureException e) {
					System.out.println("El cliente no esta contento, le pongo otro cafe " + e.getMessage());
				}
			} else {
				System.out.println("El cliente " + cliente.getNombre() + " no puede tomar café");
			}
		}
		
	}
	
	private List<Cliente> crearClientes(){
		Comensal comensal1 = new Comensal("Mario",true);
		
		ClienteAsiduo asiduo1 = new ClienteAsiduo("Francisco","Kiko");
		
		Huesped huesped = new Huesped("Manuel","000000X");
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(huesped);
		clientes.add(asiduo1);
		clientes.add(comensal1);
		
		return clientes;
	}

}
