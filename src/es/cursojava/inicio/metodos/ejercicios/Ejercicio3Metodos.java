package es.cursojava.inicio.metodos.ejercicios;

public class Ejercicio3Metodos {
	
//	Ejercicio 3
//	====================================================================================
//	Escribe un único método en Java que sirva para realizar los siguientes cálculos 
//	sobre un rectángulo a partir de la base y la altura proporcionadas por el usuario:
//
//	+ Calcular el área del rectángulo. Area=base×altura
//	+ Calcular el perímetro del rectángulo. Perímetro=2×(base+altura)
//	+ Calcular la diagonal del rectángulo (utilizando el teorema de Pitágoras). 
//	Diagonal= (raíz cuadrada)base2+altura2
//	 
//	​Devolver todos los datos en un único return
//
//	En el main pintar la información devuelta por el método

	public static void main(String[] args) {
		
		String []resultado = calculoGeometrico(10,5);
		
		System.out.println("Área: "+resultado[0]);
		System.out.println("Perímetro: "+resultado[1]);
		System.out.println("Diagonal: "+resultado[2]);
		

	}
	
	public static String[] calculoGeometrico(double base, double altura) {
		
		double area = base * altura;
		double perimetro = 2*(base+altura);
		double diagonal = Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2));
		
		String []resultado = new String[] {String.valueOf(area), String.valueOf(perimetro), String.valueOf(diagonal)};
		
		return resultado;
	
	}

}
