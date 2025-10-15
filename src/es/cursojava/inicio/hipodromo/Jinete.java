package es.cursojava.inicio.hipodromo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Jinete implements Competidor {
	
	protected static final Logger log = LoggerFactory.getLogger(Jinete.class);
	protected String nombre;
	protected int experiencia; // pongamos del 1 al 10
	protected Caballo caballo;
	
	public Jinete(String nombre, int experiencia, Caballo caballo) {
		super();
		this.nombre = nombre;
		this.experiencia = experiencia;
		if (experiencia < 0) experiencia = 0;
		if (experiencia > 10) experiencia = 10;
		this.caballo = caballo;
	}

	public Jinete(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void motivarCaballo() {
		int energiaAntes = caballo.getEnergia();
		int energiaAhora = energiaAntes + (2 + experiencia / 3);
		if (energiaAhora > 100) {
			energiaAhora = 100;
		}
		caballo.energia = energiaAhora;
		log.info(nombre + " motiva a " + caballo.getNombre() + " su energia era de " + energiaAntes + " y ahora es de " + energiaAhora + " sobre 100");
		
	}
	
	public Caballo getCaballo() {
		return caballo;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public double correr() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void descansar() {
		// TODO Auto-generated method stub
		caballo.descansar();
		
	}

	@Override
	public int getVictorias() {
		// TODO Auto-generated method stub
		return caballo.getVictorias();
	}

	@Override
	public void sumarVictoria() {
		// TODO Auto-generated method stub
		caballo.sumarVictoria();
		
	}

	@Override
	public String toString() {
		return "Jinete [nombre=" + nombre + ", experiencia=" + experiencia + ", caballo=" + caballo + "]";
	}
	
	
	
	
	
	
	
	

}
