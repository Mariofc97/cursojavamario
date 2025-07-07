package es.cursojava.inicio.ejercicios;

import java.util.Scanner;

public class EjercicioRuleta {

	static int saldo = 500;

	public static void main(String[] args) {
		boolean seguirJugando = true;

		Scanner scan = new Scanner(System.in);

		while (seguirJugando && saldo > 0) {
			System.out.println(
					"1. Juego apuesta a numero\n2. Juego Par/Impar\n3.Bloques de 12\n\n¿A que juego quiere jugar?");
			int opcion = scan.nextInt();
			switch (opcion) {
			case 1:
				JuegoNumero();
			case 2:
				JuegoParImpar();
			case 3:
				JuegoBloques();
			}
		}
	}

//				============================
//				Ruleta
//				============================
//
//				Facil
//				============================
//				saldo = 500
//
//				¿Por qué numero quieres apostar? (0-36) 
//				Si es otro numero numero se vuelve a formular la pregunta
//
//				¿Cuánto dinero quieres apostar? 
//				Si el importe de la apuesta es > que el saldo disponible por el usuario,
//				se notifica y se vuelve a formular la pregunta
//
//				De manera aleatoria generar un nº entre 0 y 36
//
//				Si el numero apostado es = al nº aleatorio, se multiplica lo apostado *36 y se suma al saldo no apostado
//				Si no lo es le restamos del saldo la cantidad apostada
//
//				Si tiene saldo le perguntamos ¿Quieres seguir jugando? si dice que no le indicamos el saldo con el que se va y si no tiene saldo le indicamos que se ha quedado sin dinero.
//

	public static void JuegoNumero() {

		System.out.println("\n************ RULETA: JUEGO NUMERO ************");

		System.out.println("¿Por qué número quieres apostar?");
		Scanner scan = new Scanner(System.in);
		int numeroUsuario = scan.nextInt();

		for (int i = 0; i < numeroUsuario; i++) {
			if (numeroUsuario > 36) {
				System.out.println("Numero incorrecto, el numero debe de estar entre 0-36");
				System.out.println("¿Por qué número quieres apostar?");
				numeroUsuario = scan.nextInt();
			}
		}

		System.out.println("Cuánto dinero quieres apostar?");
		scan = new Scanner(System.in);
		int apuesta = scan.nextInt();

		for (int i = 0; i < apuesta; i++) {
			if (apuesta > saldo) {
				System.out.println("No tienes suficiente dinero para apostar");
				System.out.println("Cuánto dinero quieres apostar?");
				apuesta = scan.nextInt();
			}
		}

		int numeroPremiado = (int) (Math.random() * 36) + 1;
		System.out.println("============================\nEl número premiado es " + numeroPremiado);

		if (numeroUsuario == numeroPremiado) {
			saldo = saldo + (apuesta * 36);
			System.out.println("============================\nHas ganado! Su saldo actual pasa a ser: " + saldo + " €");
		} else {
			saldo = saldo - apuesta;
			System.out.println(
					"============================\nOtra vez sera... su saldo actual pasa a ser: " + saldo + " €");
		}

		if (saldo <= 0) {
			System.out.println(
					"============================\nHa perdido usted todo su dinero, ya no puede seguir jugando.\nEste es su saldo actual: "
							+ saldo + " €");
		} else {
			System.out.println("¿Quieres seguir jugando?");
			scan = new Scanner(System.in);
			String decision = scan.nextLine();
			if (decision.equalsIgnoreCase("si")) {
				System.out.println("Perfecto! Continuemos");
				return;
			} else if (decision.equalsIgnoreCase("no")) {
				System.out.println("Te vas con un saldo de: " + saldo + "€, mucho ánimo con tu ludopatía.\nAdios!");
				System.exit(0);
			}
		}
	}

//				Dificil
//				============================
//				Preguntar a qué juego quiere jugar (Número,Par/Impar,Bloques)
//
//				+ Si la apuesta es par/impar y se gana, se multiplica lo apostado *2

	public static void JuegoParImpar() {

		System.out.println("\n************ RULETA: JUEGO PAR/IMPAR ************");

		System.out.println("¿Apuesta por un numero par o un numero impar?"
				+ "\nEscriba el numero de una de las opciones:\n1. Par\n2. Impar");
		Scanner scan = new Scanner(System.in);
		int numeroUsuario = scan.nextInt();

		for (int i = 0; i < numeroUsuario; i++) {
			if (numeroUsuario != 1 && numeroUsuario != 2) {
				System.out.println("Numero incorrecto, solo puedes elegir opcion 1 o 2");
				System.out.println(
						"¿Apuesta por un numero par o un numero impar?\nEscriba el numero de una de las opciones:\n1. Par\n2. Impar");
				numeroUsuario = scan.nextInt();
			}
		}

		System.out.println("Cuánto dinero quieres apostar?");
		scan = new Scanner(System.in);
		int apuesta = scan.nextInt();

		for (int i = 0; i < apuesta; i++) {
			if (apuesta > saldo) {
				System.out.println("No tienes suficiente dinero para apostar");
				System.out.println("Cuánto dinero quieres apostar?");
				apuesta = scan.nextInt();
			}
		}

		int numeroPremiado = (int) (Math.random() * 36) + 1;
		System.out.println("============================\nEl número premiado es " + numeroPremiado);

		if (numeroUsuario == 1 && numeroPremiado % 2 == 0 || numeroUsuario == 2 && numeroPremiado % 2 != 0) {
			saldo = saldo + (apuesta * 2);
			System.out.println("============================\nHas ganado! Su saldo actual pasa a ser: " + saldo + " €");
		} else {
			saldo = saldo - apuesta;
			System.out.println(
					"============================\nOtra vez sera... su saldo actual pasa a ser: " + saldo + " €");
		}

		if (saldo <= 0) {
			System.out.println(
					"============================\nHa perdido usted todo su dinero, ya no puede seguir jugando.\nEste es su saldo actual: "
							+ saldo + " €");
		} else {
			System.out.println("¿Quieres seguir jugando?");
			scan = new Scanner(System.in);
			String decision = scan.nextLine();
			if (decision.equalsIgnoreCase("si")) {
				System.out.println("Perfecto! Continuemos");
				return;
			} else if (decision.equalsIgnoreCase("no")) {
				System.out.println("Te vas con un saldo de: " + saldo + "€, mucho ánimo con tu ludopatía.\nAdios!");
				System.exit(0);
			}
		}
	}
//				Si la apuesta es Bloques y se gana, se multiplica lo apostado *5 (1-12,13-24,25-36)

	public static void JuegoBloques() {

		System.out.println("\n************ RULETA: JUEGO BLOQUES ************");

		System.out.println("Apuesta por uno de los tres bloques"
				+ "\nEscriba el numero de una de las opciones:\n1. Bloque 1 (1-12)\n2. Bloque 2 (13-24)\n3. Bloque 3 (25-36)");
		Scanner scan = new Scanner(System.in);
		int numeroUsuario = scan.nextInt();

		for (int i = 0; i < numeroUsuario; i++) {
			if (numeroUsuario != 1 && numeroUsuario != 2 && numeroUsuario != 3) {
				System.out.println("Numero incorrecto, solo puedes elegir opcion 1 o 2 o 3");
				System.out.println("Apuesta por uno de los tres bloques"
						+ "\nEscriba el numero de una de las opciones:\n1. Bloque 1 (1-12)\n2. Bloque 2 (13-24)\n3. Bloque 3 (25-36)");
				numeroUsuario = scan.nextInt();
			}
		}

		System.out.println("Cuánto dinero quieres apostar?");
		scan = new Scanner(System.in);
		int apuesta = scan.nextInt();

		for (int i = 0; i < apuesta; i++) {
			if (apuesta > saldo) {
				System.out.println("No tienes suficiente dinero para apostar");
				System.out.println("Cuánto dinero quieres apostar?");
				apuesta = scan.nextInt();
			}
		}

		int numeroPremiado = (int) (Math.random() * 36) + 1;
		System.out.println("============================\nEl número premiado es " + numeroPremiado);

		if (numeroUsuario == 1 && numeroPremiado >= 1 && numeroPremiado <= 12
				|| numeroUsuario == 2 && numeroPremiado >= 13 && numeroPremiado <= 24
				|| numeroUsuario == 2 && numeroPremiado >= 24 && numeroPremiado <= 36) {
			saldo = saldo + (apuesta * 5);
			System.out.println("============================\nHas ganado! Su saldo actual pasa a ser: " + saldo + " €");
		} else {
			saldo = saldo - apuesta;
			System.out.println(
					"============================\nOtra vez sera... su saldo actual pasa a ser: " + saldo + " €");
		}

		if (saldo <= 0) {
			System.out.println(
					"============================\nHa perdido usted todo su dinero, ya no puede seguir jugando.\nEste es su saldo actual: "
							+ saldo + " €");
		} else {
			System.out.println("¿Quieres seguir jugando?");
			scan = new Scanner(System.in);
			String decision = scan.nextLine();
			if (decision.equalsIgnoreCase("si")) {
				System.out.println("Perfecto! Continuemos");
				return;
			} else if (decision.equalsIgnoreCase("no")) {
				System.out.println("Te vas con un saldo de: " + saldo + "€, mucho ánimo con tu ludopatía.\nAdios!");
				System.exit(0);
			}
		}

	}
}
