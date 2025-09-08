package poo.ejercicioManiqui;

public class Boton {
	private String color;
	private String tamano;
	private String forma;
	
	public Boton(String color, String tamano, String forma) {
		this.color = color;
		this.tamano = tamano;
		this.forma = forma;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}
	
	
}
