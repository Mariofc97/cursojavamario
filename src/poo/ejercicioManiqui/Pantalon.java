package poo.ejercicioManiqui;

public class Pantalon extends Ropa {

	private Boton[] botones;
	
	public Pantalon (String color, double precio, String talla, Boton[] botones) {
		super(color,precio,talla);
		this.botones = botones;
	}

	public Boton[] getBotones() {
		return botones;
	}

	public void setBotones(Boton[] botones) {
		this.botones = botones;
	}

}
