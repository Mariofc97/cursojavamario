package poo;

import java.util.Arrays;

public class Alumno {
	private String nombre;
	private String dni;
	private double notaMedia;
	private String[] asignaturas;
	
	Alumno (String dni){
		this.dni = dni;
		
	}
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public double getNotaMedia() {
		return notaMedia;
	}



	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}



	public String[] getAsignaturas() {
		return asignaturas;
	}



	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}



	public void estudiar() {
		System.out.println("El estudiante " + nombre + " tiene " + Arrays.toString(asignaturas));
		System.out.println("Su nota media es: " + notaMedia);
		if (notaMedia<5) {
			System.out.println("Ha estudiado poco");
		}
		if (notaMedia>5) {
			System.out.println("Ha estudiado mucho");
		}
		if (notaMedia>9) {
			System.out.println("Es un genio");
		}
	}
	

}
