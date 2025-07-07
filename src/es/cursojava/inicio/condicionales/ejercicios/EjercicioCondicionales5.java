package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class EjercicioCondicionales5 {

	public static void main(String[] args) {
//		EJERCICIO 5
//		===============================================
//		Herramienta para calcular el precio de una llamada
//		Cuando se realiza una llamada, el cobro es por el tiempo que esta dura, 
//		de tal forma que:
//
//		+ los primeros cinco minutos cuestan 1€, 
//		+ los siguientes 3 minutos, 80 céntimos, 
//		+ los siguientes dos minutos a 70 céntimos 
//		+ y a partir del décimo minuto, 50 céntimos cada minuto.
//
//		Se carga un impuesto del 3% cuando es domingo, 
//		y si es otro día, 
//			en turno de mañana 15% (6-12)
//			y en turno de tarde 10%. (12-23)
//			y en turno de noche -10%. (23-6)
//
//		Solicitar tiempo de llamada, dia de la semana y hora y calcular el coste de la llamada
		
//CORRECION
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce el tiempo de su llamada en minutos: ");
		int minutos = scan.nextInt();
		scan.nextLine();

		System.out.println("Introduce en minúsculas el día de la semana en que se ha realizado la llamada: ");
		String dia = scan.nextLine();

		System.out.println("Introduce la hora en la que se realizó la llamada (formato 0-23): ");
		int hora = scan.nextInt();

		double costeLlamada = 1;
		
		if (minutos>5) {
			costeLlamada += 0.8;
		}
		if (minutos>8) {
			costeLlamada += 0.7;
		}
		if (minutos>10) {
			costeLlamada += (minutos-10)*0.5;
		}
		
//		// Impuestos
		
		double impuesto = 0;
		if (dia.equals("domingo")) {
			impuesto = 1.03;
		} else {
			if (hora >= 6 && hora < 12) {
				impuesto = 1.15;
			} else if (hora >= 12 && hora < 23) {
				impuesto = 1.10;
			} else {
				impuesto = 0.90;
			}
		}
		
		System.out.println("El coste de la llamada con impuestos es " + costeLlamada*impuesto);
		
	}

}
		

//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("Introduce el tiempo de su llamada en minutos: ");
//		int minutos = scan.nextInt();
//		scan.nextLine();
//
//		System.out.println("Introduce en minúsculas el día de la semana en que se ha realizado la llamada: ");
//		String diaSemana = scan.nextLine();
//
//		System.out.println("Introduce la hora en la que se realizó la llamada (formato 0-23): ");
//		int hora = scan.nextInt();
//
//		double costeLlamada = 0;
//
//		// Tramo 1: primeros 5 minutos a 1€ cada uno
//		if (minutos >= 1) {
//			int tramo1 = 1;
//			if (minutos >= 5) {
//				tramo1 = 1;
//			} else {
//				tramo1 = minutos;
//			}
//			costeLlamada += tramo1 * 1.0;
//		}
//
//		// Tramo 2: minutos 6 a 8 a 0.80€
//		if (minutos > 5) {
//			int tramo2 = 0;
//			if (minutos >= 8) {
//				tramo2 = 3; // 6, 7, 8
//			} else {
//				tramo2 = minutos - 5;
//			}
//			costeLlamada += tramo2 * 0.80;
//		}
//
//		
//		
//		// Tramo 3: minutos 9 a 10 a 0.70€
//		if (minutos > 8) {
//			int tramo3 = 0;
//			if (minutos >= 10) {
//				tramo3 = 2; // 9, 10
//			} else {
//				tramo3 = minutos - 8;
//			}
//			costeLlamada += tramo3 * 0.70;
//		}
//
//		// Tramo 4: a partir del minuto 11 a 0.50€
//		if (minutos > 10) {
//			int tramo4 = minutos - 10;
//			costeLlamada += tramo4 * 0.50;
//		}
//
//		// Impuestos
//		if (diaSemana.equals("domingo")) {
//			costeLlamada += costeLlamada * 0.03;
//		} else {
//			if (hora >= 6 && hora < 12) {
//				costeLlamada += costeLlamada * 0.15;
//			} else if (hora >= 12 && hora < 23) {
//				costeLlamada += costeLlamada * 0.10;
//			} else {
//				costeLlamada -= costeLlamada * 0.10;
//			}
//		}
//
//		System.out.printf("El coste total de la llamada es: %.2f €\n", costeLlamada);
//	}

//
//
//		Acciones:
//		Crear una condición que indique que mientras la cantidad de minutos sea mayor a 0 y menor a 5 el coste sea 1 euro. 
//		Crear una condición que indique que si la llamada dura más de 5 minutos y menos de 8, el costo de los minutos 6, 7 y 8 sea de 80 céntimos.
//		Crear una condición que indique que si la llamada dura más de 8 minutos y menos y hasta 10, el costo de los minutos 9 y 10 sea de 70 céntimos.
//		Crear una condición que indique que si la llamada dura más de 10 minutos cada minuto valga 50 céntimos.
//		Crear una condición que indique que si la llamada se hace el día domingo la llamada tenga un impuesto derl 3%
//		Crear una condición que indique que si la llamada se hace en un día diferente al domingo se aplique:
//		15% turno de 06:00am a 12:00m; 10% turno de 12:00m a 23:00pm; -10% turno de 23:00am a 05:59am;
