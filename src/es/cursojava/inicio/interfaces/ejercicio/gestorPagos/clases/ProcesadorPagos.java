package es.cursojava.inicio.interfaces.ejercicio.gestorPagos.clases;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import es.cursojava.inicio.interfaces.ejercicio.gestorPagos.interfaces.Pago;

public class ProcesadorPagos{

	//private static final Logger log = LoggerFactory.getLogger(ProcesadorPagos.class);
	
	public static void realizarPago(Pago metodoPago, double monto) {
		metodoPago.procesarPago(monto);
	}

}
