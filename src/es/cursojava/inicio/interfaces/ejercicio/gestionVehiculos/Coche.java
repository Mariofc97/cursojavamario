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
		super.update();
		log.info("Actualizando coche {}" +  this.getClass().getSimpleName() + " por el id " + this.getId());
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		super.insert();
		log.info("Insertando coche {}" +  this.getClass().getSimpleName() + " por el id " + this.getId());
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		super.select();
		log.info("Consultando coche {}" +  this.getClass().getSimpleName() + " por el id " + this.getId());
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		super.encender();
		log.info("Arrancando coche {}" +  this.getClass().getSimpleName() + " por el id " + this.getId());
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		super.apagar();
		log.info("Apagando coche {}" +  this.getClass().getSimpleName());
	}
	
	
	

}
