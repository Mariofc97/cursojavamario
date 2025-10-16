package es.cursojava.inicio.hipodromo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Carrera {
	private static final Logger log = LoggerFactory.getLogger(Carrera.class);
	
	private String nombreCarrera;
	private List<Competidor> participantes;
	private Competidor ganador;
	
	public Carrera(String nombreCarrera, List<Competidor> participantes, Competidor ganador) {
		super();
		this.nombreCarrera = nombreCarrera;
		this.participantes = participantes;
		this.ganador = ganador;
	}

	public Carrera(String nombreCarrera, List<Competidor> participantes) {
		super();
		this.nombreCarrera = nombreCarrera;
		this.participantes = participantes;
	}
	
	public void inscribirCompetidor(Competidor c) {
		participantes.add(c);
	}
	
	public void iniciarCarrera() {
		System.out.println();
		log.debug("Comienza la carrera " + nombreCarrera);
		
		double mejorVelocidad = 0;
		Competidor mejorCompetidor = null;
		
		for (Competidor p : participantes) {
			double velocidad = p.correr();
			velocidad = Math.round(velocidad * 100.0) / 100.0;
			log.info(p.getNombre() + " alcanza velocidad " + velocidad);
			if(velocidad > mejorVelocidad) {
				mejorVelocidad = velocidad;
				mejorCompetidor = p;
			}
		}
		
		if ( mejorCompetidor != null) {
			ganador = mejorCompetidor;
			ganador.sumarVictoria();
			log.info("Ganador " + ganador.getNombre());
			System.out.println();
		}
	}
	
	

}
