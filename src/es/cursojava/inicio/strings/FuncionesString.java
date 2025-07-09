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
		
//		EJERCICIO HALLAR LA SEGUNDA E, LA DE PRUEBA
		
//		1ER FORMA
		int posicion1 = cadena.indexOf("e"); // la primera e que encuentra en la frase empezando desde la izquierda
		int posicion2 = cadena.indexOf("e",posicion1+1); // la primera e que encuentra en la frase empezando desde la izquierda
		System.out.println(posicion2); // la primera e que encuentra en la frase empezando desde la izquierda
		
		System.out.println(cadena.lastIndexOf("e")); // la primera e que encuentra en la frase empezando desde la derecha

		//2A FORMA
		for (int i=0; i<cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			System.out.print(caracter);
			if (caracter=='e'&& i!=cadena.indexOf("e")) {
				System.out.print(" (Posicion"+i + ") ");
				break;
			}
		}
		
		//3A FORMA
		//Usando substrings
		int posicionPrimeraE = cadena.indexOf("e");
		String subcadena = cadena.substring(posicionPrimeraE+1);
		System.out.println(subcadena);
		int posicionSubcadenaSegundaE = subcadena.indexOf("e")+1;
		
		System.out.println("La segunda e está en "+ (posicionPrimeraE + posicionSubcadenaSegundaE));
		
		//Forma correcta
		System.out.println("La segunda e está en "+cadena.indexOf("e",cadena.indexOf("e")+1));
		
//		System.out.println("==========================");
//		cadena="  e  r t";
//		System.out.println(cadena.isBlank());
//		System.out.println(cadena.isEmpty());
//		
//		System.out.println("'"+cadena+ "'");
//		System.out.println("'"+cadena.strip()+ "'");
//		System.out.println("'"+cadena.replace(" ", "")+ "'");
//		
//		cadena = "Hola Mundo desde Getafe";
//		System.out.println(cadena.substring(5,12)); // crea otra string desde la posicion 5 hasta 12 sin incluir la ultima.
//		System.out.println(cadena.substring(5)); // crea otra string desde la posicion 5 hasta el final
//		System.out.println(cadena.substring(cadena.lastIndexOf(" ")));
	}

}
