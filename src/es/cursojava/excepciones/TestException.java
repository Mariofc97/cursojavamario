package es.cursojava.excepciones;

public class TestException {

	public static void main(String[] args) {
		int[] numeros = {1,2,3};
		String ruta = null;
		try {
			int result = 7/0;
			System.out.println("Empieza");
			ruta.substring(4);
			System.out.println(numeros[3]);
			System.out.println("Termina try");
		} catch(ArrayIndexOutOfBoundsException eArray) {
			System.out.println("Error Fuera de Rango " + eArray.getMessage());
		} catch(NullPointerException npe) {
			System.out.println("Error objeto es null" + npe.getMessage());
		} catch(Exception e) {
			System.out.println("Error general " + e.getMessage());
			e.printStackTrace(); // esto te pinta exactamente el error que deberia pintar la consola si diera error.
		} finally { 
//			es un bloque que siempre se va a ejecutar, aunque haya errores
//		 	un finally no tiene porque tener catch para funcionar.
		System.out.println("siempre");
		}
		System.out.println("Fin");

	}

}
