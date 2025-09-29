package es.cursojava.inicio.interfaces.ejercicios.uno;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JudiasVerdes extends Verdura{

	public JudiasVerdes(String procedencia, boolean tieneVaina) {
		super(procedencia);
		this.tieneVaina = tieneVaina;
		// TODO Auto-generated constructor stub
	}

	private static final Logger log = LoggerFactory.getLogger(Lechuga.class);
	
	private boolean tieneVaina;

	@Override
	public void desinfectar() {
		log.info("Desinfectando {}", this.getClass().getSimpleName());
		
	}
	
	
	
	
}
