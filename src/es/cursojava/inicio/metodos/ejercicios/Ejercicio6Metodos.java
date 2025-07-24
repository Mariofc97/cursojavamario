package es.cursojava.inicio.metodos.ejercicios;

import java.util.Random;

public class Ejercicio6Metodos {

//	Ejercicio 6 - Ahorcado
//	====================================================================================
//	A partir de los siguientes 3 arrays
//
//	String[] sujetos = {
//	    "El gato", "La niña", "Mi amigo", "Un hombre", "La policía", "El perro",
//	    "La profesora", "Un payaso", "El médico", "La madre", "El robot", "Mi vecino"
//	};
//
//	String[] verbos = {
//	    "come", "pinta", "busca", "rompe", "salta", "canta",
//	    "lava", "lee", "mueve", "atrapa", "conduce", "enciende"
//	};
//
//	String[] complementos = {
//	    "una manzana", "la casa", "el coche", "una canción", "el jardín", "la calle",
//	    "el balón", "un sombrero", "la ventana", "la lámpara", "el periódico", "el fuego"
//	};
//
//	Generar una frase de manera aleatoria.
//	Solicitar el nombre del jugador, mostrar de manera inicial todos los caracteres 
//	de la frase con "_"
//	Ejemplo:
//		El gato come una manzana
//		__ ____ ____ ___ _______
//		  
//	Solicitar al usuario letras si acierta la letra se mostrará la letra acertada
//	Ejemplo: a
//		__ _a__ ____ __a _a__a_a
//
//	Ejemplo: i
//		Letra no encontrada. Intentos restantes: 5
//		__ _a__ ____ __a _a__a_a
//
//	 
//	Intentar adivinar la frase antes de fallar seis intentos.
//	Si no falla en 6 ocasioes el usuario pierde.

	public static void main(String[] args) {

		System.out.println("Juego Ahorcado");

		String[] sujetos = { "El gato", "La niña", "Mi amigo", "Un hombre", "La policía", "El perro", "La profesora",
				"Un payaso", "El médico", "La madre", "El robot", "Mi vecino" };

		String[] verbos = { "come", "pinta", "busca", "rompe", "salta", "canta", "lava", "lee", "mueve", "atrapa",
				"conduce", "enciende" };

		String[] complementos = { "una manzana", "la casa", "el coche", "una canción", "el jardín", "la calle",
				"el balón", "un sombrero", "la ventana", "la lámpara", "el periódico", "el fuego" };
		System.out.println(getSentence(sujetos, verbos, complementos));

	}

	public static String getSentence(String[] sujetos, String[] verbos, String[] complementos) {
		Random random = new Random();

		int indexAleatorioSujetos = random.nextInt(sujetos.length);
		String elementoSujetos = sujetos[indexAleatorioSujetos];

		int indexAleatorioVerbos = random.nextInt(sujetos.length);
		String elementoVerbos = verbos[indexAleatorioVerbos];

		int indexAleatorioComplementos = random.nextInt(sujetos.length);
		String elementoComplementos = complementos[indexAleatorioComplementos];

		String sentence = elementoSujetos + " " + elementoVerbos + " " + elementoComplementos;

		String spaces = hideChar(sentence);
		
		String resultado = sentence + "\n" + spaces;
		
		return resultado;

	}
	
	public static String hideChar(String sentence) {
		
		return sentence.toLowerCase().replaceAll("[a-záéíóúñ]", "_");
		
	}

}
