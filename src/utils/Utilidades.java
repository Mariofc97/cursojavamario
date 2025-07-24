package utils;

public class Utilidades {
//	public static int calculaEdad(int año) {
//		
//		int edad = 2025 - año;
//		System.out.println("El usuario tiene " + edad + " años");
//		
//		return edad;
//	}

//	Ejercicio 4
//	====================================================================================
//	EN la clase Utilidades crear métodos:
//
//	+ pintaMenu le vamos a pasar un array de Strings y nos va a mostrar 
//	todas las opciones que vengan en el array 
//	y al final va a pintar "Introduce una opción"
//
//	+ pintaMenu le vamos a pasar un array de Strings y un String texto. 
//	Nos va a mostrar todas las opciones que vengan en el array 
//	y al final nos va pintar el contenido de la variable texto
//
//	+ pideDatoNumerico al que le pasamos un String denominado Texto. 
//	El método tiene que pintar el texto que le pasamos, recoger un dato numérico (int) 
//	por la consola y devolver el dato que se ha introducido
//
//	+ pideDatoCadena al que le pasamos un String denominado Texto. 
//	El método tiene que pintar el texto que le pasamos, recoger un dato (String)  
//	por la consola y devolver el dato que se ha introducido

	public static void main(String[] args) {

		String[] opciones = new String[] { "Opcion uno", "Opcion dos", "Opcion tres" };
		pintaMenu(opciones);

		String texto = "Este es el dato solicitado";
		pintaMenu(opciones, texto);

		int numero = (int) (Math.random() * 101);

		pideDatoNumerico(texto + numero);

		pideDatoCadena(texto + texto);
	}

	public static void pintaMenu(String[] opciones) {

		for (int i = 0; i < opciones.length; i++) {
			System.out.println((i + 1) + ". " + opciones[i]);
		}
		System.out.println("Introduce una opción: ");
	}

	public static void pintaMenu(String[] opciones, String texto) {

		pintaMenu(opciones);
		System.out.println(texto);
	}

	public static int pideDatoNumerico(String texto) {
		int numero = (int) (Math.random() * 101);
		System.out.println(texto);
		return numero;
	}

	public static String pideDatoCadena(String texto) {
		String prueba = "prueba de return en pideDatoCadena()";
		System.out.println(texto);
		return prueba;

	}

}
