package es.cursojava.inicio.bucles;

public class BucleFor {

	public static void main(String[] args) {
		
		for (int i=0; i<5 ; i++) {
			
			if(i%2==0) {
				continue;
			}
			System.out.println("Hola " +i);
			if(i%3==0) {
				break;
			}
			
			// el continue detiene el tramo del bucle, pero el bucle sigue continuando en el siguiente numero
			// el break una vez que se realiza te saca del bucle.
			
		}
		System.out.println("Termina");
	}
}
