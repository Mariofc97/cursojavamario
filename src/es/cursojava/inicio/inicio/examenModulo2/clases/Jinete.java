package es.cursojava.inicio.inicio.examenModulo2.clases;

import es.cursojava.inicio.inicio.examenModulo2.interfaces.Participable;

public class Jinete extends Persona implements Participable {
	
	private int aniosExperiencia;
	
	
	public Jinete(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}


	public Jinete(String nombre, int edad, int aniosExperiencia) {
		super(nombre, edad);
		this.aniosExperiencia = aniosExperiencia;
	}


	public int getAniosExperiencia() {
		return aniosExperiencia;
	}


	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}


	@Override
	public String toString() {
		return "Jinete [aniosExperiencia=" + aniosExperiencia + ", getNombre()=" + getNombre() + "]";
	}


	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

	
	

}
