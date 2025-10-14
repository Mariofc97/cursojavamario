package es.cursojava.inicio.interfaces.ejercicio.gestionVehiculos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Aguacate extends Alimentos {
	
	public Aguacate(String id, String nombre) {
		super(id, nombre);
		// TODO Auto-generated constructor stub
	}

	private static final Logger log = LoggerFactory.getLogger(Aguacate.class);
	
	@Override
	public String toString() {
	    return getClass().getSimpleName() + " " + this.getNombre();
	}

	@Override
	public void select() {
		log.info("Consultando {}", this, " por el id ", this.getId());
	}
	
	

	
	
	
	

}
