package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class Ejercicio2Arrays {

    public static void main(String[] args) {

        int[][] numeros = new int[4][4];
//        int [] fila0 = {1, 2, 3, 4};
//        int [][] numeros = { fila0, {5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Scanner scan = new Scanner(System.in); // Scanner solo una vez

        // Introducir todos los datos de la matriz
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int col = 0; col < numeros[fila].length; col++) {
                System.out.print("Introduzca el valor para la matriz [" + fila + "][" + col + "]: ");
                numeros[fila][col] = scan.nextInt();
            }
        }

        // Mostrar la matriz completa (solo después de introducir todos los datos)
        System.out.println("\nMatriz introducida:");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }
        
        
        
        // Mostrar los valores de la diagonal principal
        System.out.println("\nValores de la diagonal principal:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición [" + i + "][" + i + "] = " + numeros[i][i]);
           
        }
        
        int valorAux = 0;
        // Mostrar los valores de la diagonal inversa
        System.out.println("\nValores de la diagonal inversa:");
        for (int i = 0; i < numeros.length/2; i++) {
            int aux = numeros[numeros.length-1-i][numeros.length-1-i];
            aux = numeros [i][i];
            numeros[i][i]=aux;
           
        }
        

        
        
    }
}
