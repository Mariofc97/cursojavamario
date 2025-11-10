package es.cursojava.excepciones.ejercicioComensales;

public class Comensal extends ClienteAdicto {

	private boolean tieneReserva;

	public Comensal(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public Comensal(String nombre, boolean tieneReserva) {
		super(nombre);
		this.tieneReserva = tieneReserva;
	}

	public boolean isTieneReserva() {
		return tieneReserva;
	}

	public void setTieneReserva(boolean tieneReserva) {
		this.tieneReserva = tieneReserva;
	}

	@Override
	public String toString() {
		return "Comensal [tieneReserva=" + tieneReserva + "]";
	}

}
