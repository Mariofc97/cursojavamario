package poo.ejercicioManiqui;

public class Maniqui {

	private int id;
	private Pantalon pantalon;
	private Camisa camisa;
	private Vestido vestido;
	
	public Maniqui(int id) {
		this.id = id;
	}
	
	public Maniqui(int id, Pantalon pantalon, Camisa camisa) {
		this.id = id;
		this.pantalon = pantalon;
		this.camisa = camisa;
	}
	
	public Maniqui(int id, Vestido vestido) {
		this.id = id;
		this.vestido = vestido;
	}
	
	public void vestir(Pantalon pantalon, Camisa camisa) {
		this.vestido = null;
		this.pantalon = pantalon;
		this.camisa = camisa;
	}
	
	public void vestir(Vestido vestido) {
		this.pantalon = null;
		this.camisa = null;
		this.vestido = vestido;
	}
	
	public boolean desvestir() {
		return pantalon == null && camisa == null && vestido == null ;
	}
	
	public double getPrecioRopa() {
		double precioTotal = 0;
		Ropa prendas[] = new Ropa[] {this.pantalon, this.camisa, this.vestido}
		
		for (Ropa r: prendas) {
			if (r != null) {
				precioTotal += r.getPrecio();				
			}
		return precioTotal;
		}
	}

	public int getId() {
		return id;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}
	
}
