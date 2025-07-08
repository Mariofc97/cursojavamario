package es.cursojava.inicio.strings;

public class FuncionesString {

	public static void main(String[] args) {
		
		String nombre = "Marta"; //variable con objeto
		String nombre2 = "Eva"; //variable con objeto
		String nombre3 = null; //variable SIN objeto
		
//		System.out.println(nombre3.toUpperCase());
		
		nombre3 = nombre2;
		nombre2 = nombre;
		nombre2.toUpperCase(); //aqui se crea un nuevo objeto, UN TERCER OBJETO
		System.out.println(nombre3.toUpperCase()); //EVA
		System.out.println(nombre); //Marta
		
		System.out.println(nombre.charAt(nombre.length()-1));
		nombre.length();
		
		System.out.println("Tenerife".toLowerCase().contains("te"));
		
		System.out.println(nombre2.endsWith("va"));
		
		System.out.println(nombre2.startsWith("Ma"));
		
		String cadena = "Esto es una prueba de Strings";
		System.out.println(cadena.indexOf("e")); // la primera e que encuentra en la frase empezando desde la izquierda
		System.out.println(cadena.lastIndexOf("e")); // la primera e que encuentra en la frase empezando desde la derecha
		
		System.out.println("==========================");
		cadena="  e  r t";
		System.out.println(cadena.isBlank());
		System.out.println(cadena.isEmpty());
		
		System.out.println("'"+cadena+ "'");
		System.out.println("'"+cadena.strip()+ "'");
		System.out.println("'"+cadena.replace(" ", "")+ "'");
		
		cadena = "Hola Mundo desde Getafe";
		System.out.println(cadena.substring(5,12)); // crea otra string desde la posicion 5 hasta 12 sin incluir la ultima.
		System.out.println(cadena.substring(5)); // crea otra string desde la posicion 5 hasta el final
		System.out.println(cadena.substring(cadena.lastIndexOf(" ")));
	}

}
