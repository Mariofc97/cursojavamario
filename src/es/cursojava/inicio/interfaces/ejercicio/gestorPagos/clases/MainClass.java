package es.cursojava.inicio.interfaces.ejercicio.gestorPagos.clases;

public class MainClass {

	public static void main(String[] args) {
		
		PagoTarjetaCredito t1 = new PagoTarjetaCredito();
		PagoPayPal p1 = new PagoPayPal();
		PagoCriptomoneda c1 = new PagoCriptomoneda();
		
		ProcesadorPagos.realizarPago(t1, 50);
		ProcesadorPagos.realizarPago(p1, 100);
		ProcesadorPagos.realizarPago(c1, 150);

	}

}
