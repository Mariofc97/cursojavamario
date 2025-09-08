package poo.ejercicioManiqui;

public class Ropa {

	protected String color;
	protected double precio;
	protected String talla;
	
	public Ropa (String color, double precio, String talla){
		this.color = color;
		this.precio = precio;
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}
	
	

}
