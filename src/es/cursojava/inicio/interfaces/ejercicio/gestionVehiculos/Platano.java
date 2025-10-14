package es.cursojava.inicio.interfaces.ejercicio.gestionVehiculos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Platano extends Alimentos {
	
	private static final Logger log = LoggerFactory.getLogger(Platano.class);

	public Platano(String id, String nombre, String fechaCaducidad) {
		super(id, nombre, fechaCaducidad);
	}
	
	public Platano(String id, String nombre) {
		super(id, nombre);
	}
	
	@Override
	public String toString() {
	    return getClass().getSimpleName() + " " + this.getNombre();
	}

	@Override
	public void select() {
		log.info("Consultando {}", this, " por el id ", this.getId());
	}
	
	

	
	
	
	

}
