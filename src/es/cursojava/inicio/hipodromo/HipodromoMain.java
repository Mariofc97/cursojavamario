package es.cursojava.inicio.hipodromo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HipodromoMain {
	
	private static final Logger log = LoggerFactory.getLogger(HipodromoMain.class);

	public static void main(String[] args) {
		Caballo c1 = new Spirit("Trueno",18.0,90);
		Caballo c2 = new Spirit("Spirit",17.5,90);
		Caballo c3 = new Spirit("Volt",18.0,90);
		
		Competidor j1 = new JineteProfesional("Cabalgabuelas",8,c1);
		Competidor j2 = new JineteProfesional("Trotavergas",6,c2);
		Competidor j3 = new JineteProfesional("EldeLaTribuComanche",9,c3);
		
		List<Competidor> participantes = new ArrayList<>();
		participantes.add(j1);
		participantes.add(j2);
		participantes.add(j3);
		
		motivarTodos(participantes);
		Carrera carrera1 =new Carrera("La velada del año", participantes);
		carrera1.iniciarCarrera();
		
		descansarTodos(participantes);
		
		motivarTodos(participantes);
		Carrera carrera2 =new Carrera("La velada del año 2", participantes);
		carrera2.iniciarCarrera();
		
		mostrarEstadisticas(participantes);
		
		
		

	}
	
	public static void descansarTodos(List<Competidor> participantes) {
		for (Competidor p : participantes) {
			p.descansar();
		}
		System.out.println();
	}
	
	public static void motivarTodos(List<Competidor> participantes) {
		for (Competidor p : participantes) {
			if(p instanceof Jinete j) {
				j.motivarCaballo();
			}
			
		}
		System.out.println();
	}
	
	public static void mostrarEstadisticas(List<Competidor> participantes) {
		System.out.println();
		log.debug("-----Estadísticas caballos-----");
		for (Competidor p : participantes) {
			if (p instanceof Jinete j) {
				Caballo c = j.getCaballo();
				log.info(c.getNombre() + " -> " + c.getVictorias() + " victorias");
			}
		}
		System.out.println();
	}

}
