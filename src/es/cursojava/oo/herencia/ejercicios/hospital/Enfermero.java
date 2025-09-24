package es.cursojava.oo.herencia.ejercicios.hospital;

public class Enfermero extends EmpleadosHospital {
	
	private String planta;

	public Enfermero(String nombre, int edad, String turno, String planta) {
		super(nombre, edad, turno);
		this.planta = planta;
	}
	
	public Enfermero(String nombre, int edad) {
		super(nombre, edad);
	}

	public String getPlanta() {
		return planta;
	}

	public void setPlanta(String planta) {
		this.planta = planta;
	}
	
	public void atenderPaciente(Paciente paciente) {
		System.out.println("El paciente " + paciente.getNombre() + " queda asignado al enfermero " + this.getNombre());
		
	}
	
}
