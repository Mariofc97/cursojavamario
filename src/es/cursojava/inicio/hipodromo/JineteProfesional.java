package es.cursojava.inicio.hipodromo;

public class JineteProfesional extends Jinete {

	public JineteProfesional(String nombre, int experiencia, Caballo caballo) {
		super(nombre, experiencia, caballo);
		// TODO Auto-generated constructor stub
	}
	
	public JineteProfesional(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double correr() {
		double bonusExperiencia = 1.0 + (experiencia / 100.0);
		double velocidad = caballo.correr() * bonusExperiencia;
		log.debug(nombre + " corre con " + caballo.getNombre() + " a velocidad " + velocidad );
		return velocidad;
	}
	
}
