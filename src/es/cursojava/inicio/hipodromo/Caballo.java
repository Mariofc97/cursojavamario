package es.cursojava.inicio.hipodromo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Caballo {

	protected String nombre;
	protected double velocidadBase; // pongamos de 0 a 100
	protected int energia; // pongamos de 0 a 100
	protected int victorias;

	protected static final Logger log = LoggerFactory.getLogger(Caballo.class);
	
	public Caballo(String nombre, double velocidadBase, int energia, int victorias) {
		
		super();
		this.nombre = nombre;
		this.velocidadBase = velocidadBase;
		if (energia < 0) energia = 0;
		if (energia > 100) energia = 100;
		this.energia = energia;
		this.victorias = victorias;
	}

	public Caballo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getVelocidadBase() {
		return velocidadBase;
	}

	public void setVelocidadBase(double velocidadBase) {
		this.velocidadBase = velocidadBase;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public int getVictorias() {
		return victorias;
	}

	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}
	
	public void sumarVictoria() {
		victorias++;
	}
	
	public abstract double correr();
	
	public void descansar () {
		int antes = energia;
		energia += 25;
		if (energia > 100) {
			energia = 100;
		}
		log.info(nombre + " descansa : energia " + antes + " -> " + energia);
	}
	
	@Override
	public String toString() {
		return "Caballo [nombre=" + nombre + ", velocidadBase=" + velocidadBase + ", energia=" + energia
				+ ", victorias=" + victorias + "]";
	}

}
