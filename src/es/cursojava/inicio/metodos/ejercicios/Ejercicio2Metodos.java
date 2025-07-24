package es.cursojava.inicio.metodos.ejercicios;

public class Ejercicio2Metodos {

//	Ejercicio 2
//	====================================================================================
//	En una clase 
//	+ Escribe un método que reciba un array de Strings con nombres y 
//	devuelva el número de nombres que empiecen por A y contengan una t
//	+ Desde el main generar el array con los nombres y llamar al método anterior,
//	indicar cuantos nombres cumplen esa condición.

	public static void main(String[] args) {

		String[] nombres = new String[] { "Jorge", "Ana", "Anita" };

		int resultado = numeroNombres(nombres);

		System.out.println("El numero de nombres que empiezan por A y contienen t son: " + resultado);
	}

	public static int numeroNombres(String[] nombres) {

		int contador = 0;

		for (int i = 0; i < nombres.length; i++) {
			String nombre = nombres[i];
			if (nombre.startsWith("A") || nombre.contains("t")) {
				contador++;
			}
		}

		return contador;
	}

}
