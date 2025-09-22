package es.cursojava.oo.herencia.ejercicios.hospital;

public class Enfermo extends Persona {
	
	private String enfermedad;

	public Enfermo(String nombre, int edad, String enfermedad) {
		super(nombre, edad);
		this.enfermedad = enfermedad;
	}
	
	public Enfermo(String nombre, int edad) {
		super(nombre, edad);
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	public void comer() {
		super.comer();
		System.out.println("Enfermo " + getNombre() + " comiendo en la habitación");
	}

}
