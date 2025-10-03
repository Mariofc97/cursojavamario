package es.cursojava.inicio.interfaces.ejercicio.gestorPagos.clases;

import es.cursojava.inicio.interfaces.ejercicio.gestorPagos.interfaces.Pago;

public class PagoTarjetaCredito implements Pago {

	@Override
	public void procesarPago(double monto) {
		System.out.println("Confirmando pago de " + monto + ", " + this.getClass().getSimpleName() + " realizado");
		
	}

}
