package es.cursojava.inicio.interfaces.ejercicios.uno;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lechuga extends Verdura {
	
	private static final Logger log = LoggerFactory.getLogger(Lechuga.class);
	private String tipo;
	
	public Lechuga(String procedencia, String tipo) {
		super(procedencia);
		this.tipo = tipo;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void desinfectar() {
		log.info("Desinfectando {}", this.getClass().getSimpleName());
		
	}



	
}
