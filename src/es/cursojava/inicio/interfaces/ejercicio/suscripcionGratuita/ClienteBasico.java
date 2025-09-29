package es.cursojava.inicio.interfaces.ejercicio.suscripcionGratuita;

public class ClienteBasico extends Cliente implements SuscripcionBasica {

	private String notas;

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public ClienteBasico(String nombre, String notas) {
		super(nombre);
		this.notas = notas;
	}

	@Override
	public void leerInformes() {
		System.out.println("Cliente " + getNombre() + " leyendo informes"); // como se heredan los metodos y variables no privados, debemos utilizar getNombre de la clase Cliente
		
	}

	@Override
	public void crearInformes() {
		System.out.println("Cliente " + getNombre() + " creando informes");
		
	}
	
	
}
