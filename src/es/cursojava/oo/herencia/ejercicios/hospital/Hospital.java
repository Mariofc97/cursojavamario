package es.cursojava.oo.herencia.ejercicios.hospital;

public class Hospital {
	
	private String nombre;
	private Habitacion[] habitaciones;
	private Paciente[] salaDeEspera; 
	
	public static void main(String[] args) {
		
	}

	public Hospital(String nombre, Habitacion[] habitaciones, Paciente[] salaDeEspera) {
		super();
		this.nombre = nombre;
		this.habitaciones = habitaciones;
		this.salaDeEspera = salaDeEspera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Habitacion[] getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(Habitacion[] habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Paciente[] getSalaDeEspera() {
		return salaDeEspera;
	}

	public void setSalaDeEspera(Paciente[] salaDeEspera) {
		this.salaDeEspera = salaDeEspera;
	}
	
	public void abrirHospital() {
		Habitacion hab1 = new Habitacion(01);
		Habitacion hab2 = new Habitacion(02);
		
		Paciente pac1 = new Paciente("Mario",27);
		Paciente pac2 = new Paciente("Manu",30);
		Paciente pac3 = new Paciente("Jose",40);
		//3 pacientes --> Meterlos en la sala de espera
		
		Paciente[] salaDeEspera = {pac1,pac2,pac3};
		
		Enfermero enfermero1 = new Enfermero()
		
		
	}
	

}
