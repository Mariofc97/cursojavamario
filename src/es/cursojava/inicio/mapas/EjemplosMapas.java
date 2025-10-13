package es.cursojava.inicio.mapas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import poo.Persona;
import utils.Utilidades;

public class EjemplosMapas {
	
	public static void main(String[] args) {
		
		Map<String,Persona> personas = new HashMap(); // guardaremos valores de clase que implementan el objeto mapa en otra clase
		// definimos los tipos de datos que funcionan como clave y/o valor.
		
		Persona p = new Persona("N1","A1","111A",18);
		personas.put(p.getDni() , p);
		Persona p2 = new Persona("N2","A2","111B",19); // con el metodo put se incorpora un nuevo valor en el mapa y nos retorna el antiguo valor por si lo necesitaramos para algo
		personas.put(p2.getDni() , p2);
		
		Persona p3 = personas.put(p2.getDni(),p2);
		System.out.println(p3.getNombre());
		
		Persona p4 = new Persona("N4","A4","444A",20);
		personas.put(p4.getDni(), p2); // (key , value)
		
		// Recupero los datos de una persona
		//String dni = Utilidades.pideDatoCadena("Introduce un dni");
		//Persona persona = personas.get(dni);
		//System.out.println(persona.getNombre());
		
		System.out.println(personas.values()); //NOS DEVUELVE UNA COLECCION, NO SABEMOS SI ES SET O LIST
		System.out.println(personas.keySet());
		
	
		System.out.println("--------Todas las claves----------");
		Set<String> dnis = personas.keySet();
		for (String dniPersona : dnis) {
			System.out.println(dniPersona);
		}
		
		System.out.println("--------Todas los valores a partir de las claves----------");
		// obtengo todos los valores a partir de las claves
		//for (String dniPersona : dnis) {
			//Persona personaValor = personas.get(dni);
			//System.out.println(personaValor.getNombre());
			
		//}
		
		System.out.println("--------Todas los valores de manera directa----------");
		// obtengo todos los valores a partir de las claves
		Collection<Persona> colPersonas = personas.values();
		for (Persona persona2 : colPersonas) {
			System.out.println(persona2.getNombre());
		}
		
		personas.entrySet();
		Set<Entry<String, Persona>> entries = personas.entrySet();
		for(Entry<String, Persona> entry : entries) {
			entry.getValue();
			System.out.println(entry.getKey() + " " + entry.getValue().getNombre());
		}
		
		personas.remove(entries);
		
		
		
		
		
	}

	
}
