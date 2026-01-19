package es.cursojava.spring.ejercicioCalculadora;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.cursojava.spring.AppConfig;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (var ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			CalculadoraServiceSpring calculadoraService = ctx.getBean(CalculadoraServiceSpring.class);
			
//			System.out.println("10 + 2 = " + calculadoraService.calcular(10, 2, "+"));
//			System.out.println("10 - 2 = " + calculadoraService.calcular(10, 2, "-"));
//			System.out.println("10 * 2 = " + calculadoraService.calcular(10, 2, "*"));
//			System.out.println("10 / 2 = " + calculadoraService.calcular(10, 2, "+"));
			
			  Operacion suma = ctx.getBean("sumaOp", Operacion.class);
			  Operacion resta = ctx.getBean("restaOp", Operacion.class);
			  Operacion multiplicacion = ctx.getBean("multiplicacionOp", Operacion.class);
			  Operacion division = ctx.getBean("divisionOp", Operacion.class);

			  System.out.println("10 + 2 = " + suma.ejecutar(10, 2));
			  System.out.println("10 - 2 = " + resta.ejecutar(10, 2));
			  System.out.println("10 * 2 = " + multiplicacion.ejecutar(10, 2));
			  System.out.println("10 / 2 = " + division.ejecutar(10, 2));
		}
	}

}
