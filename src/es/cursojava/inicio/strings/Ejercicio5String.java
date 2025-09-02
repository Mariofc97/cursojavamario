

package es.cursojava.inicio.strings;

import java.util.Scanner;

public class Ejercicio5String {

//	Ejercicio 5 - Validar un email
//	==============================
//	Preguntar al usuario por un email
//	Le diremos si es valido o no y si no lo es le diremos el motivo
//
//	Validaciones: 
//	+ Que no tenga espacios en blanco x
//	+ Que tenga @, solo 1 x
//	+ Que después de la @ tenga al menos un punto x
//	+ Que entre la @ y el punto a su derecha haya una separación de dos caracateres x
//	+ Que despues del último punto haya entre 2 y 6 caracteres x

	public static void main(String[] args) {
		while (!validarEmail()) {
			System.out.println("Inténtalo de nuevo.\n");
		}
	}

	public static boolean validarEmail() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu email: ");
		String email = scan.nextLine();
		
		email = email.trim();

		if (email.contains(" ")) {
			System.out.println("El email no puede tener espacios en blanco");
			return false;
		}

		int counterArroba = 0;
		int counterChar = 0;

		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				counterArroba++;
			}
		}

		if (counterArroba == 0) {
			System.out.println("Debe de haber al menos un @");
			return false;
		} else if (counterArroba > 1) {
			System.out.println("Solo puede haber un @");
			return false;
		}

		int posArroba = email.indexOf("@");
		int afterArroba = email.indexOf(".", posArroba);
		int posUltimoPunto = email.lastIndexOf(".");

		int charAfterPunto = email.length() - posUltimoPunto - 1;

		if (afterArroba <= 0) {
			System.out.println("Despues del @ debe de haber al menos un punto");
			return false;
		} else if (afterArroba == posArroba + 1 || afterArroba == posArroba + 2) {
			System.out.println("Entre el @ y el punto debe de haber una separacion de dos caracteres");
			return false;
		} else if (charAfterPunto < 2 || charAfterPunto > 6) {
			System.out.println("Despues del ultimo punto debe de haber entre 2 y 6 caracteres");
			return false;
		} else {
			System.out.println("el email proporcionado se ha validado correctamente");
			return true;
		}
	}
}
