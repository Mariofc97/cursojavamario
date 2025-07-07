package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class EjercicioCondicionales3 {

	public static void main(String[] args) {
		
//		EJERCICIO 3
//		===============================================
//		Pedir dos numeros y pedir la operación que se quiere realizar ("suma o +", resta o - ,*,/)  nextLine
//
//		Mostrar el resultado de la operación con los dos números
		
        Scanner scan = new Scanner(System.in);
    	
        System.out.println("Introduce el la operacion deseada escribiendo 'sumar' o 'restar' o 'multiplicar' o 'dividir': ");
        String operacion = scan.nextLine();
        System.out.println("La operacion deseada es: " + operacion);
        
        System.out.println("Introduce el primer numero: ");
        int numero1 = scan.nextInt();
        
        System.out.println("Introduce el segundo numero: ");
        int numero2 = scan.nextInt();
        
        int resultado = 0;
        
        if (operacion.equalsIgnoreCase("sumar") || operacion.equals("+")) {
        	resultado = numero1 + numero2;
        	System.out.println("El resultado de la suma es: " + resultado);
        } else if(operacion.equalsIgnoreCase("restar") || operacion.equals("-")) {
        	resultado = numero1 - numero2;
        	System.out.println("El resultado de la resta es: " + resultado);
        } else if(operacion.equalsIgnoreCase("multiplicar") || operacion.equals("*")) {
        	resultado = numero1 * numero2;
        	System.out.println("El resultado de la multiplicación es: " + resultado);
        } else if(operacion.equalsIgnoreCase("dividir") || operacion.equals("/")) {
        	resultado = numero1 / numero2;
        	System.out.println("El resultado de la división es: " + resultado);
        } else {
        	System.out.println("Operación NO valida");
        }
        
	}
}
