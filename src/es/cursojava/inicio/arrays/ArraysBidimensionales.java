package es.cursojava.inicio.arrays;

import java.util.Arrays;

public class ArraysBidimensionales {

	public static void main(String[] args) {
		
		int [][]numeros = new int [2][3]; // primer corchete, 2 filas. Segundo corchete 3 columnas.
				
		numeros [1][2]=10;
		
		System.out.println(numeros.length); // numero de filas que tiene un array bidimensional
		
		
		int [] fila0 = numeros[0];
		System.out.println(fila0.length); // por cada una de las filas en este caso, estoy averiguando el numero de columnas que tiene esta fila
		System.out.println(numeros[0].length); // esto es lo mismo de lo anterior
		
		for (int fila = 0; fila < numeros.length; fila++) {
//			System.out.println("Fila: " + fila);
			for (int col = 0; col < numeros[fila].length; col++) {
//				System.out.println("Columna: " + col);
//				System.out.println("Posicion ("+fila+ ","+col+")");
				System.out.print("\t"+numeros[fila][col]);
			}
			System.out.println();
		}

	}

}
