package es.cursojava.inicio.interfaces.ejercicio.gestionVehiculos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MountainBike extends Bicicleta {
	
	private static final Logger log = LoggerFactory.getLogger(MountainBike.class);

	public MountainBike(String id, String nombre, String color, double Precio, int numMarchas) {
		super(id, nombre, color, Precio, numMarchas);
		// TODO Auto-generated constructor stub
	}
	
	public MountainBike(String id, String nombre) {
		super(id, nombre);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
	    return getClass().getSimpleName() + " " + this.getNombre();
	}


	@Override
	public void delete() {
		log.info("Eliminando {}" ,this, " por el id ",this.getId());
	}

	@Override
	public void select() {
		log.info("Consultando {}" ,this, " por el id ",this.getId());
	}

	@Override
	public int getNumMarchas() {
		return super.getNumMarchas();
	}

	@Override
	public void setNumMarchas(int numMarchas) {
		super.setNumMarchas(numMarchas);
	}

	@Override
	public void update() {
		log.info("Actualizando {}" ,this, " por el id ",this.getId());
	}

	@Override
	public void insert() {
		log.info("Insertando {}" ,this, " por el id ",this.getId());
	}
	
	
	
	

}
