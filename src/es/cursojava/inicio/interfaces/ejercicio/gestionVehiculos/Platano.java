package es.cursojava.inicio.interfaces.ejercicio.gestionVehiculos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Platano extends Alimentos {
	
	private static final Logger log = LoggerFactory.getLogger(Platano.class);

	public Platano(String id, String nombre, String fechaCaducidad) {
		super(id, nombre, fechaCaducidad);
	}

	@Override
	public void select() {
		super.select();
		log.info("Consultando {}" +  this.getClass().getSimpleName() + " por el id " + this.getId());
	}
	
	

	
	
	
	

}
