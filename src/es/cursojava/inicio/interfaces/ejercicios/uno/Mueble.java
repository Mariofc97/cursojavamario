package es.cursojava.inicio.interfaces.ejercicios.uno;

public class Mueble implements Limpiable {
	
	private String color;

	@Override
	public void limpiar() {
		System.out.println("Limpiando mueble");
	}

	public Mueble(String color) {
		super();
		this.color = color;
	}

}
