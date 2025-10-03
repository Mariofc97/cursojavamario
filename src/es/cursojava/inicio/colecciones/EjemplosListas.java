package es.cursojava.inicio.colecciones;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.oo.herencia.ejercicios.hospital.Persona;

public class EjemplosListas {

	public static void main(String[] args) {

		 ArrayList lista = new ArrayList();

		//List<Persona> lista = new ArrayList(); // con esto le decimos que tipo de objeto metemos en la lista, ahora la
												// lista solo sera de objetos tipo persona, con lo cual Azul y 100.5 no
												// se pueden añadir
		lista.add("Azul");
		lista.add(100.5);
		for (int i = 0; i < 1000; i++) {

			lista.add(new Persona(null, i));
		}

		System.out.println(lista.size());

		lista.get(2);
		for (Object object : lista) {
			if (object instanceof Persona) {
				Persona p = (Persona) object;
				p.getNombre();
			}
		}
	}
}
