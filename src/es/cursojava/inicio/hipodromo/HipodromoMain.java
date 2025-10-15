package es.cursojava.inicio.hipodromo;

import java.util.ArrayList;
import java.util.List;

public class HipodromoMain {

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
		
		Carrera carrera1 =new Carrera("La velada del año", participantes);
		carrera1.iniciarCarrera();
		
		descansarTodos(participantes);
		
		Carrera carrera2 =new Carrera("La velada del año 2", participantes);
		carrera2.iniciarCarrera();
		

	}
	
	public static void descansarTodos(List<Competidor> participantes) {
		for (Competidor p : participantes) {
			p.descansar();
		}
	}

}
