package es.cursojava.inicio.colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import es.cursojava.oo.herencia.ejercicios.hospital.Persona;

public class EjemplosSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//1)//List permite duplicados (y varios null).

		// no permite duplicados; como mucho un null (en HashSet/LinkedHashSet; TreeSet no admite null).

		//2) //Set.add(e) devuelve false si el elemento ya existía; en List.add(e) suele devolver true.
		
		//Set no tiene índice. El orden depende de la implementación:

			//HashSet: sin orden garantizado.

			//LinkedHashSet: mantiene orden de inserción.
		
		//3) Igualdad (equals) y semántica

		//Dos List son iguales si tienen mismos elementos en el mismo orden.

		//Dos Set son iguales si contienen los mismos elementos, sin importar el orden.

		//4) Complejidad y rendimiento (típico)

		//Búsqueda contains(e):

		//: O(n)

		//LinkedList: O(n)

		//HashSet: O(1) promedio

		//TreeSet: O(log n)

		//Acceso por índice:

		//ArrayList: O(1) promedio

		//LinkedList: O(n)

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
