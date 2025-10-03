package es.cursojava.inicio.interfaces.ejercicio.gestionVehiculos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Coche extends VehiculoMotorizado {
	
	private static final Logger log = LoggerFactory.getLogger(Coche.class);

	public Coche(String id, String nombre, String color, double Precio) {
		super(id, nombre, color, Precio);
		// TODO Auto-generated constructor stub
	}
	
	public Coche(String id, String nombre) {
		super(id, nombre);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
	    return getClass().getSimpleName() + " " + this.getNombre();  // "Coche Seat Ibiza"
	}

	@Override
	public String getMotor() {
		// TODO Auto-generated method stub
		return super.getMotor();
	}

	@Override
	public void setMotor(String motor) {
		// TODO Auto-generated method stub
		super.setMotor(motor);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		log.info("Actualizando {}",this, " por el id ", this.getId());
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		log.info("Insertando {}",this, " por el id ", this.getId());
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		log.info("Consultando {}",this, " por el id ", this.getId());
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		log.info("Arrancando {}", this);
	}

	@Override
	public void apagar() {
	    log.info("Apagando {}", this); // usa toString()
	}
	
	
	

}
