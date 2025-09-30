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
	public void update() {
		super.update();
		log.info("Actualizando movil {}" +  this.getClass().getSimpleName() + " por el id " + this.getId());
	}

	@Override
	public void insert() {
		super.insert();
		log.info("Insertando movil {}" +  this.getClass().getSimpleName() + " por el id " + this.getId());
	}

	@Override
	public void select() {
		super.select();
		log.info("Consultando movil {}" +  this.getClass().getSimpleName() + " por el id " + this.getId());
	}

	@Override
	public void encender() {
		super.encender();
		log.info("Encendiendo movil {}" +  this.getClass().getSimpleName());
	}

	@Override
	public void apagar() {
		super.apagar();
		log.info("Apagando movil {}" +  this.getClass().getSimpleName());
	}
	
	
	

	

}
