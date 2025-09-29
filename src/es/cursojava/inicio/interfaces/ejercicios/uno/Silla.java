package es.cursojava.inicio.interfaces.ejercicios.uno;

public class Silla extends Mueble {
	
	private String material;

	@Override
	public void limpiar() {
		// TODO Auto-generated method stub
		super.limpiar();
	}

	public Silla(String color, String material) {
		super(color);
		this.material = material;
	}
	

}
