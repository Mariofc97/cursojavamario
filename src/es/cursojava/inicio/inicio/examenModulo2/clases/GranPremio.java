package es.cursojava.inicio.inicio.examenModulo2.clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.cursojava.inicio.inicio.examenModulo2.utils.UtilsCaballos;
import utils.Utilidades;

public class GranPremio {
	
	private String nombre;
	private List<Carrera> carreras;
	private List<Apostante> apostantes;
	
	public GranPremio(String nombre) {
		super();
		this.nombre = nombre;
	}

	public GranPremio(String nombre, List<Carrera> carreras, List<Apostante> apostantes) {
		super();
		this.nombre = nombre;
		this.carreras = carreras;
		this.apostantes = apostantes;
	}



	public GranPremio(String nombre, List<Carrera> carreras) {
		super();
		this.nombre = nombre;
		this.carreras = carreras;
		this.apostantes = new ArrayList<Apostante>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(List<Carrera> carreras) {
		this.carreras = carreras;
	}

	public List<Apostante> getApostantes() {
		return apostantes;
	}

	public void setApostantes(List<Apostante> apostantes) {
		this.apostantes = apostantes;
	}

	@Override
	public String toString() {
		return "GranPremio [nombre=" + nombre + ", carreras=" + carreras + ", apostantes=" + apostantes + "]";
	}
	
	private void crearCarreras() {
		//Crear carreras
		Carrera carrera1 = new Carrera("Carrera1",500);
		Carrera carrera2 = new Carrera("Carrera2",700);
		
		Jinete jinete = new Jinete("Manueee",22,4);
		Caballo caballo1 = UtilsCaballos.crearCaballoAleatorio("Pitufo", jinete);
		Jinete jinete2 = new Jinete("Lore",25,1);
		Caballo caballo2 = UtilsCaballos.crearCaballoAleatorio("Perdigón", jinete2);
		Jinete jinete3 = new Jinete("Macu",27,2);
		Caballo caballo3 = UtilsCaballos.crearCaballoAleatorio("Lightning", jinete3);
	
		List<Caballo> participantes = new ArrayList<>();
		participantes.add(caballo1);
		participantes.add(caballo2);
		
		Carrera carrera3 = new Carrera("Carrera3",800,participantes);
	
		carrera3.getCaballosParticipantes().add(caballo3);
		// carrera3.addCaballo(caballo3);
		
		this.carreras = Arrays.asList(carrera1, carrera2, carrera3);
	
		
	}
	
	public void init() {
		crearCarreras();
		this.apostantes = UtilsCaballos.crearApostantes();
	}
	
	public void empezarGranPremio() {
		System.out.println("Empezando Gran Premio " + this.nombre);
		for (Carrera c : carreras) {
			System.out.println("\n Empezando la carrera: " + c.getNombre());
			Map<String,Caballo> mapaCaballos = new HashMap<>();
			//Muestro informacion de los caballos
			for (Caballo caballo : c.getCaballosParticipantes()) {
				System.out.println(caballo.getNombre() + " con jinete: " + caballo.getJinete().getNombre());
				mapaCaballos.put(caballo.getNombre(), caballo);
			}
			
			// para realizar apuestas por parte de los apostantes
			for(Apostante apostante : this.apostantes) {
				System.out.println(apostante.getNombre() + "tienes: " + apostante.getSaldo() + " euros.");
				String nombreCaballo = Utilidades.pideDatoCadena("Caballo por el que apuesta :");
				Caballo caballoApostado = mapaCaballos.get(nombreCaballo);
				double cantidad = Utilidades.pideDatoNumerico("Cantidad a apostar :");
				
				Apuesta apuesta = new Apuesta(apostante, caballoApostado, cantidad);
				c.addApuesta(apuesta);
			//iniciar carrera con el avance de los caballos
				
			//recoger el caballo ganador
				
			//comprobar si los apostantes han acertado con el caballo ganador
			
			}
		}
	}
	
	public void mostrarResumen() {
		
	}
	
	
	
	
	
	
	

}
