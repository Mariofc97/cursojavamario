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
	
	

	
}
