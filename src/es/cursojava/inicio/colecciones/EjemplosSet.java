package es.cursojava.inicio.colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import es.cursojava.oo.herencia.ejercicios.hospital.Persona;

public class EjemplosSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Las 2 diferencias clave:

			//Duplicados

			//Set: no permite elementos repetidos.

			//List: sí permite repetidos.

			//Orden e índice

			//Set: no garantiza orden ni tiene índice (no accedes por posición).

			//List: mantiene un orden (normalmente el de inserción) y permite acceso por índice.

			//(Consecuencia práctica: los Set suelen usarse para pruebas de pertenencia rápidas; las List, para secuencias ordenadas y acceso posicional.)

		//Set: no aplica
		Set<Persona> conjunto = new HashSet();
		
		Persona p = new Persona();
		for (int i = 0; i<10;i++) {
			boolean aniadido = conjunto.add(new Persona(i+"A"));  // para añadir en un set, solo tenemos este metodo qeu lo añade al final
			System.out.println(aniadido);
		}
		
		
		
		for (Persona persona: conjunto) {
			System.out.println(persona.getDni());
		}
		
		//conjunto.iterator();
		
		//hasNext nos dice si hay objeto siguiente, y con el Next se posiciona en el siguiente objeto.
		
		Iterator<Persona> ite = conjunto.iterator();
		
		while(ite.hasNext()) {
			Persona persona = ite.next();
			System.out.println(persona.getDni());
		}
		
		//En Java, un Iterator se usa para recorrer colecciones como List o Set. Sus métodos principales son:

			//hasNext() → devuelve true si hay otro elemento disponible.

			//next() → devuelve el siguiente elemento y avanza el cursor.
			// solo puede haber un Next dentro de un bucle, si no acaba apuntando a un objeto que no existe.
		

	}

}
