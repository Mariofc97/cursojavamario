package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidades {

	public static int calcularEdad (int anioNacimiento) {
		int edad = 0;
		
		edad = 2025 - anioNacimiento;
		
		return edad;
	}
	
	public static void pintaMenu (String[] opciones) {
		
//		for (String opcion : opciones) {
//			System.out.println(opcion);
//		}
//		System.out.println("Introduce una opción");
		pintaMenu(opciones,"Introduce una opción");
	}
	
	public static void pintaMenu (String[] opciones, String texto) {
//		pintaMenu(opciones);
		for (String opcion : opciones) {
			System.out.println(opcion);
		}
		System.out.println(texto);
	}
	
	public static int pideDatoNumerico (String texto) {
		
		try {
			
			int numero=0;
			System.out.println(texto);
			Scanner scan = new Scanner(System.in);
			numero = scan.nextInt();
			
			return numero;
		} catch (Exception e) {
			System.out.println("Error general " + e.getMessage());
			System.out.println("El dato introducido debe ser un integer");
			
			return pideDatoNumerico(texto);
		}
		// si el usuario mete un integer o algo que no sea texto, devolver una excepcion y volver a preguntar para que meta otra cosa
		
		
	}
	
	public static double pideDatoDecimal (String texto) {
		double numero=0;
		boolean hayError;
		do {
			
			System.out.println(texto);
			Scanner scan = new Scanner(System.in);
			
			try {
				numero = scan.nextDouble();
				hayError=false;
			}catch(InputMismatchException ime) {
				hayError=true;
				System.out.println("Valor introducido no correcto");
			}finally {
				scan.close();
			}
			
		}while(hayError);
		
		return numero;
		
	}
	
	public static String pideDatoCadena (String texto) {
		String dato="";
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		dato = scan.nextLine();
		
		return dato;
	}
}
