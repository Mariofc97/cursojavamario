package es.cursojava.inicio.interfaces.ejercicios.uno;

public class Mesa extends Mueble {
	
	public Mesa(String color, String forma) {
		super(color);
		this.forma = forma;
		// TODO Auto-generated constructor stub
	}

	private String forma;

	@Override
	public void limpiar() {
		super.limpiar();
	}
	

}
