package es.cursojava.inicio.metodos.ejercicios;

import java.util.Random;
import java.util.Scanner;

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
//	Si no falla en 6 ocasiones el usuario pierde.
	
////	Diferencia entre == y .equals() en String
////	==: compara si dos referencias apuntan al mismo objeto en memoria.
////
////	.equals(): compara el contenido de los objetos String.
////	POR ESO EN ESTE CASO LO CORRECTO ES USAR EQUALS.

	static String sentence;
	static String fraseOculta;

	public static void main(String[] args) {

		System.out.println("**********Juego Ahorcado**********");
		System.out.println("El usuario solo puede fallar 5 veces, debera de adivinar la frase antes para ganar");

		String[] sujetos = { "El gato", "La niña", "Mi amigo", "Un hombre", "La policía", "El perro", "La profesora",
				"Un payaso", "El médico", "La madre", "El robot", "Mi vecino" };

		String[] verbos = { "come", "pinta", "busca", "rompe", "salta", "canta", "lava", "lee", "mueve", "atrapa",
				"conduce", "enciende" };

		String[] complementos = { "una manzana", "la casa", "el coche", "una canción", "el jardín", "la calle",
				"el balón", "un sombrero", "la ventana", "la lámpara", "el periódico", "el fuego" };

		System.out.println(getSentence(sujetos, verbos, complementos));

		int intentos = 0;

		while (!fraseOculta.equals(sentence) && intentos < 6) {
			System.out.println("\n********************");
			System.out.println("\nNumero de intentos: " + intentos);
			System.out.println("\nIntroduce una letra en minúscula: ");
			Scanner scan = new Scanner(System.in);
			String letra = scan.nextLine();
			
			if (findChar(letra)) {
				System.out.println("Letra encontrada");

				String nuevaFrase = "";

				for (int i = 0; i < sentence.length(); i++) {
					char cOriginal = sentence.charAt(i);
					char cOculta = fraseOculta.charAt(i);

					if (Character.toLowerCase(cOriginal) == letra.toLowerCase().charAt(0)) {
						nuevaFrase += cOriginal;
					} else {
						nuevaFrase += cOculta;
					}
				}

				fraseOculta = nuevaFrase;
				System.out.println(fraseOculta);
			} else {
				System.out.println("\nUps! Letra no encontrada");
				intentos++;
				System.out.println("Numero de intentos: " + intentos);
			}

			if (intentos == 6) {
				System.out.println("Has perdido el juego, has llegado al número máximo de intentos");
				break;
			}

			if (intentos >= 4) {
				System.out.println("¿Sabes cual es la frase completa?");
				scan = new Scanner(System.in);
				String fraseCorrecta = scan.nextLine();
				if (fraseCorrecta.equalsIgnoreCase(sentence)) {
					System.out.println("\nHas ganado!");
					break;
				} else {
					System.out.println("La frase no es correcta, sigue intentandolo");
					continue;
				}
			}

			if (fraseOculta.equalsIgnoreCase(sentence)) {
				System.out.println("\nHas ganado!");
				break;
			}
		}

	}

	public static String getSentence(String[] sujetos, String[] verbos, String[] complementos) {
		Random random = new Random();

		int indexAleatorioSujetos = random.nextInt(sujetos.length);
		String elementoSujetos = sujetos[indexAleatorioSujetos];

		int indexAleatorioVerbos = random.nextInt(sujetos.length);
		String elementoVerbos = verbos[indexAleatorioVerbos];

		int indexAleatorioComplementos = random.nextInt(sujetos.length);
		String elementoComplementos = complementos[indexAleatorioComplementos];

		sentence = elementoSujetos + " " + elementoVerbos + " " + elementoComplementos;

		fraseOculta = hideSentence(sentence);

		return fraseOculta;

	}

	public static String hideSentence(String sentence) {

		return sentence.toLowerCase().replaceAll("[a-záéíóúñ]", "_");

	}

	public static boolean findChar(String letra) {
		return sentence.toLowerCase().contains(letra);

	}

}
