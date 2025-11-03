package es.cursojava.inicio.inicio.examenModulo2.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import es.cursojava.inicio.inicio.examenModulo2.clases.Apostante;
import es.cursojava.inicio.inicio.examenModulo2.clases.Caballo;
import es.cursojava.inicio.inicio.examenModulo2.clases.Jinete;

public class UtilsCaballos {

	public static Caballo crearCaballoAleatorio(String nombreBase, Jinete jinete) {
		Random random = new Random();

		double peso = random.nextDouble(200, 300);
		int velocidad = random.nextInt(0, 80);
		int experiencia = random.nextInt(1, 10);

		Caballo caballo = new Caballo(nombreBase, peso, velocidad, experiencia, jinete);

		return caballo;
	}
	
	public static List<Apostante> crearApostantes(){
		Apostante apostante1 = new Apostante("ludopata1",34,1000);
		Apostante apostante2 = new Apostante("ludopata2",14,1200);
	
		List<Apostante> apostantes = new ArrayList<>();
		apostantes.add(apostante1);
		apostantes.add(apostante2);
		return apostantes;
	}
}
