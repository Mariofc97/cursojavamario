package es.cursojava.spring.ejercicioCalculadora;

public interface Operacion {

	String simbolo();
	double ejecutar (double a, double b);
}
