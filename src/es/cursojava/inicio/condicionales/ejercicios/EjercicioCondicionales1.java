package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class EjercicioCondicionales1 {
	
	    public static void main(String[] args) {
	
	//    	EJERCICIO 1
	//    	===============================================
	//    	+ Crear paquete ejercicios dentro de condicionales
	//    	+ Clase donde se solicite un número y se diga si el número es par o impar
	    	
	        Scanner scan = new Scanner(System.in);
	
	        System.out.println("Introduce el numero deseado:");
	        int numero = scan.nextInt();
	
	        if (numero % 2 == 0) {
	            System.out.println("El numero dado es par");
	        } else {
	            System.out.println("El numero dado es impar");
	        }
	        
	        //Operador ternario
	        //condicion?ejecucion_true:ejecucion_false
	        System.out.println(numero%2==0?"Par":"Impar");
	    }
}
