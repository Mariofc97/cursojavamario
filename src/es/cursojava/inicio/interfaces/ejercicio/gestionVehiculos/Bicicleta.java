package es.cursojava.inicio.interfaces.ejercicio.gestionVehiculos;

public abstract class Bicicleta extends Vehiculo implements Consultable, Deletable {

	private int numMarchas;
	
	public Bicicleta(String id, String nombre, String color, double Precio, int numMarchas) {
		super(id, nombre, color, Precio);
		this.numMarchas = numMarchas;
		// TODO Auto-generated constructor stub
	}
	
	public Bicicleta(String id, String nombre) {
		super(id, nombre);
		// TODO Auto-generated constructor stub
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}
	
	

}
