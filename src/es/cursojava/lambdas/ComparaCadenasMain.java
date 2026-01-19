package es.cursojava.lambdas;

import java.util.ArrayList;
import java.util.List;

public class ComparaCadenasMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparaCadenas comparaLongitud = s1 -> s1.length() > 5;
		ComparaCadenas comparaVocalA = s2 -> {
			s2.toLowerCase().contains("a");
			return s2.contains("a");
		};

		String cadena1 = "Hola Mundo";
		String cadena2 = "Java";

		System.out.println("¿La cadena \"" + cadena1 + "\" tiene más de 5 caracteres? "
				+ comparaLongitud.compararCadenas(cadena1));
		System.out.println(
				"¿La cadena \"" + cadena2 + "\" contiene la vocal 'a'? " + comparaVocalA.compararCadenas(cadena2));
	
		List<String> listaColores = new ArrayList<>();
		listaColores.add("Rojo");
		listaColores.add("Azul");
		listaColores.add("Verde");
		
		listaColores.forEach(color -> System.out.println("Color: " + color));
		
		listaColores.removeIf(color -> color.startsWith("A"));
		
		listaColores.stream()
			.filter(color -> color.length() > 3)
			.forEach(color -> System.out.println("Color con más de 3 letras: " + color));
	}
}
