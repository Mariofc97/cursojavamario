package es.cursojava.inicio.interfaces.ejercicio.gestionVehiculos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Movil extends ProductosElectronicos {
	
	private static final Logger log = LoggerFactory.getLogger(Movil.class);

	public Movil(String id, String nombre, String fechaFabricacion) {
		super(id, nombre, fechaFabricacion);
		// TODO Auto-generated constructor stub
	}
	
	public Movil(String id, String nombre) {
		super(id, nombre);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
	    return getClass().getSimpleName() + " " + this.getNombre();
	}

	@Override
	public void update() {
		log.info("Actualizando {}", this, " por el id ",this.getId());
	}

	@Override
	public void insert() {
		log.info("Insertando {}", this, " por el id ",this.getId());
	}

	@Override
	public void select() {
		log.info("Consultando {}", this, " por el id ",this.getId());
	}

	@Override
	public void encender() {
		log.info("Encendiendo {}", this, " por el id ",this.getId());
	}

	@Override
	public void apagar() {
		log.info("Apagando {}", this, " por el id ",this.getId());
	}
	

}
