package es.cursojava.excepciones.ejercicioComensales;

public class TazaCafe {
	
	private String tipo;
	private double temperatura;
	
	public TazaCafe(String tipo, double temperatura) {
		super();
		this.tipo = tipo;
		this.temperatura = Math.random()*100;
	}
	
	public TazaCafe(String tipo) {
		super();
		this.tipo = tipo;
	}
	
	
//	public TazaCafe(String tipo) {
//		this(Math.random()*100, tipo);
//	}

	public String getTipoCafe() {
		return tipo;
	}

	public void setTipoCafe(String tipo) {
		this.tipo = tipo;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	
	
	

}
