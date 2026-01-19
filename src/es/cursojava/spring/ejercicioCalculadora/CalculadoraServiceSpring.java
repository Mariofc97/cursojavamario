package es.cursojava.spring.ejercicioCalculadora;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceSpring {

	private Operacion suma;
	private Operacion resta;
	private Operacion multiplicacion;
	private Operacion division;
	
	
	
	public CalculadoraServiceSpring(
			@Qualifier("sumaOp") Operacion suma, 
			@Qualifier("restaOp") Operacion resta, 
			@Qualifier("multiplicacionOp") Operacion multiplicacion,
			@Qualifier("divisionOp") Operacion division
			) {
		super();
		this.suma = suma;
		this.resta = resta;
		this.multiplicacion = multiplicacion;
		this.division = division;
	}



	public double calcular(double a, double b, String simbolo) {
		return 
		switch (simbolo) {
		case "+" -> suma.ejecutar(a, b);
		case "-" -> resta.ejecutar(a, b);
		case "*" -> multiplicacion.ejecutar(a, b);
		case "/" -> division.ejecutar(a, b);
		default -> throw new IllegalArgumentException("Unexpected value: " + simbolo);
		};
	}

}
