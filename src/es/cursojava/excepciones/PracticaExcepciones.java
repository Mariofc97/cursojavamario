package es.cursojava.excepciones;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticaExcepciones {

    public static void main(String[] args) {
    	
        // + Pedir tamaño de un array de números, con ese dato crear el array
        int[] numeros = PracticaExcepciones.pideTamañoArray("Introduce el tamaño deseado del array: ");
        // + Solicitar los números a ingresar en el array
        PracticaExcepciones.numerosAingresar(numeros);
        // + Solicitar la posición del array para mostrar su valor (en realidad buscáis por valor)
        PracticaExcepciones.mostrarValorArray("Introduce el número que deseas buscar en el array: ", numeros);
        // Si hay alguna excepción se indica al usuario un mensaje y se vuelve a pedir la información
        //GetafeException npe = new GetafeException("Null creado por mi");
        //throw npe;
    }

    public static int[] pideTamañoArray(String texto) {
        System.out.print(texto);
        try {
            Scanner scan = new Scanner(System.in);
            int numero = scan.nextInt();

            if (numero <= 0) {
                System.out.println("El tamaño debe ser un entero positivo.\n");
                return pideTamañoArray(texto); // reintentar
            }

            int[] numeros = new int[numero];
            System.out.println("Array creado: " + Arrays.toString(numeros));
            return numeros;

        } catch (InputMismatchException e) {
            System.out.println("Debes introducir un número entero.\n");
            return pideTamañoArray(texto); // reintentar
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + "\n");
            return pideTamañoArray(texto); // reintentar
        }
    }

    public static int[] numerosAingresar(int[] numeros) {
        System.out.println("\n--- Rellenar el array ---");
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número de la posición " + (i + 1) + ": ");
            try {
                int numero = scan.nextInt();
                numeros[i] = numero;
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número entero.");
                scan.nextLine(); // limpiar basura
                i--; // reintentar la misma posición
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                i--; // reintentar la misma posición
            }
        }

        System.out.println("Array actual: " + Arrays.toString(numeros));
        return numeros; // devolvemos el mismo array rellenado
    }

    public static void mostrarValorArray(String texto, int[] numeros) {
        Scanner scan = new Scanner(System.in);
        int numeroBuscado;

        while (true) {
            System.out.print("\n" + texto);
            try {
                numeroBuscado = scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número entero.");
                scan.nextLine(); // limpiar basura
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scan.nextLine();
            }
        }

        boolean encontrado = false;
        String posiciones = "";  
        boolean primera = true;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                if (!primera) {
                    posiciones += ", ";
                }
                posiciones += i; // usa (i + 1) si prefieres posiciones “humanas”
                primera = false;
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("El número " + numeroBuscado + " está en la(s) posición(es): " + posiciones);
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el array.");
        }
    }
}
