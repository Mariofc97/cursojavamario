package es.cursojava.inicio.ejercicios;

import java.util.Scanner;

//Crea el paquete ejercicios dentro del paquete inicio
//Dentro del paquete ejercicios crear la clase PideDatos con el método main
//Mostrar los datos recogidos por consola
	
	

public class PideDatos {
	
	public static void main(String[] args) {
		//Solicitar dirección:
		//- nombre de calle,
		//- numero
		//- poblacion
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el nombre de la calle: ");
		String calle = scan.nextLine();
		System.out.println("El nombre de la calle es " + calle);
		
		System.out.println("Introduce el numero de la calle: ");
		int numero = scan.nextInt();
		System.out.println("El numero es " + numero);
		
		// Mostrar: "La calle es grande ": <true o false>, si el numero de la calle es mayor de 100(true) en caso contrario "false"
		boolean esGrande = numero > 100;
		System.out.println("¿La calle es grande? " + esGrande);
		
		System.out.println("Introduce la poblacion: ");
		scan = new Scanner(System.in);
		String poblacion = scan.nextLine();
		System.out.println("La población es " + poblacion + "\n");
		
		// Generar numero aleatorio e indicar el numero que se genera y si es > de 0,5 (poniendo True o false).
		
		double numeroAleatorio = Math.random();
		System.out.print(numeroAleatorio);
		System.out.println("\nMostrar true si el numero random es mayor de 0,5, sino false");
		System.out.print(numeroAleatorio > 0.5);
//		System.out.println(numeroCalle%10==0); // si metemos 20 como numero de calle, dara TRUE, ya que el resto es 0
		
		
		
		
		
		
		
		
		
	}

}