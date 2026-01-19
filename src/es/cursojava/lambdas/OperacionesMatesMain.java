package es.cursojava.lambdas;

public class OperacionesMatesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Suma suma = new Suma();
		int resultado = suma.operar(5, 3);
		System.out.println("Resultado suma: " + resultado);
		
		Operaciones sumaLambda = (a, b) -> a-b;
		
		int resultado2 = sumaLambda.operar(5, 3);
		System.out.println("Resultado lambda: " + resultado2);
		
		ejecutarOperacion(6, 2, suma);
	}
	
	public static int ejecutarOperacion(int a, int b, Operaciones operacion) {
		return operacion.operar(a, b);
	}

}
