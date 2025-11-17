package es.cursojava.enums;

public enum Caballoenum {

	CABALLO1("Rayo", 250, 9.5, 5, 10), CABALLO2("Trueno", 260, 8.0, 3, 4), CABALLO3("Relámpago", 240, 10.0, 7, 15),
	CABALLO4("Tormenta", 270, 7.5, 2, 1);

	private String nombre;
	private double peso;
	private double velocidad;
	private int experiencia;
	private int victorias;

	Caballoenum(String nombre, double peso, double velocidad, int experiencia, int victorias) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.peso = peso;
		this.velocidad = velocidad;
		this.experiencia = experiencia;
		this.victorias = victorias;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public int getVictorias() {
		return victorias;
	}

	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}

	
}


