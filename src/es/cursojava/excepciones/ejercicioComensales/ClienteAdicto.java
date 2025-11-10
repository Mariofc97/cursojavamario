package es.cursojava.excepciones.ejercicioComensales;

public class ClienteAdicto extends Cliente {

	private final int TEMPERATURA_MAXIMA=80; // VARIABLES QUE NO PUEDEN CAMBIAR SU VALOR
	private final int TEMPERATURA_MINIMA=20;
	
	public ClienteAdicto(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	
	public void tomarCafe(TazaCafe taza) throws TooHotTemperatureException, TooColdTemperatureException{
		
		if(taza.getTemperatura()>TEMPERATURA_MAXIMA) {
			// PARA HACER QUE EL CAMARERO SE ENTERE Y LANZAR LA EXCEPCION FUERA DE ESTE METODO
			throw new TooHotTemperatureException("El café esta ardiendo, a" + taza.getTemperatura() + " grados.");
		} else if (taza.getTemperatura()<TEMPERATURA_MINIMA) {
			throw new TooColdTemperatureException(" El cafe esta muy frio, a " + taza.getTemperatura() + " grados.");
			
		} else {
			System.out.println("El cliente " + this.getNombre() + " se esta tomando el cafe tranquilamente a buena temperatura");
		}
		
	}

}
