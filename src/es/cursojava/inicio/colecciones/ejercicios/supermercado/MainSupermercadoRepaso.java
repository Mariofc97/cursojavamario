package es.cursojava.inicio.colecciones.ejercicios.supermercado;

import java.util.Set;

public class MainSupermercadoRepaso {

	public static void main(String[] args) {
		
		SupermercadoRepaso supermercado = new SupermercadoRepaso("Ahorramas");
		SupermercadoRepaso.abrirSupermercado(supermercado);

	}
	
	
	private void iniciarCompras (SupermercadoRepaso supermercado) {
		Set<ClienteSupermercadoRepaso> clientes =  supermercado.getClientes();
		
		for(ClienteSupermercadoRepaso c : clientes) {
			System.out.println("\nBienvenido " + c.getNombre());
			System.out.println("Tienes los siguiente productos disponibles: ");
			
			String repuesta = "";
			
			
			
		}
	}

}
