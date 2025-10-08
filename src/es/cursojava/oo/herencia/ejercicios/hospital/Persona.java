package es.cursojava.oo.herencia.ejercicios.hospital;

public class Persona {

	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void comer() {

	}

	public char[] getDni() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
