package es.cursojava.inicio.metodos.ejercicios;

import utils.Utilidades;

public class Ejercicio4Metodos {

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
		Utilidades.pintaMenu(opciones);

		System.out.println("\nSegunda parte");
		String texto = "Ejemplo de texto a imprimir";
		Utilidades.pintaMenu(opciones, texto);

		int numero = (int) (Math.random() * 101);
		System.out.println("\nTercera parte");
		Utilidades.pideDatoNumerico(texto + numero);

		System.out.println("\nCuarta parte");
		Utilidades.pideDatoCadena(texto + texto);

	}
}
