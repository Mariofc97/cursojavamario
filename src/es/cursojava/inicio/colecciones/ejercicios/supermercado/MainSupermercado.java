package es.cursojava.inicio.colecciones.ejercicios.supermercado;

import java.util.Scanner;

public class MainSupermercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supermercado s = new Supermercado("Ahorramas");
		
		s.addStock(new Alimento("Plátanos", 2.80),5);
		s.addStock(new Alimento("Pimientos", 3.95),10);
		s.addStock(new Alimento("Leche", 1.10),6);
		
		
		ClienteSupermercado c1 = new ClienteSupermercado("Cliente1");
		ClienteSupermercado c2 = new ClienteSupermercado("Cliente2");
		s.addCliente(c1);
		s.addCliente(c2);
		
		try (Scanner sc = new Scanner(System.in)){
			for (ClienteSupermercado cliente : s.getClientes()) {
				System.out.println("\nAtendiendo a" + cliente.getNombre());
				s.atenderCliente(sc, cliente);
			}
		}
		
		s.cobrarTodos();
		
	}

}
