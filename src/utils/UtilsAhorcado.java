package utils;

import es.cursojava.inicio.metodos.ejercicios.AhorcadoProfe;

public class UtilsAhorcado {

	public static void main(String[] args) {
		
		AhorcadoProfe.hangMan();
		String frase = AhorcadoProfe.generateRandomPhrase();
		System.out.println(frase);
	}
}
