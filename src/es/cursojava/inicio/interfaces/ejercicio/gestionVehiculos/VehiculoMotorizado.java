package es.cursojava.inicio.interfaces.ejercicio.gestionVehiculos;

public abstract class VehiculoMotorizado extends Vehiculo implements Apagable,Encendible,Consultable,Insertable,Updatable {
	
	private String motor;
	
	public VehiculoMotorizado(String id, String nombre, String color, double Precio) {
		super(id, nombre, color, Precio);
		// TODO Auto-generated constructor stub
	}
	
	public VehiculoMotorizado(String id, String nombre) {
		super(id, nombre);
		// TODO Auto-generated constructor stub
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		
	}
	
	

	
}
