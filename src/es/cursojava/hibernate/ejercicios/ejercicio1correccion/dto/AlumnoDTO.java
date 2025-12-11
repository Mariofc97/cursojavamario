package es.cursojava.hibernate.ejercicios.ejercicio1correccion.dto;

public class AlumnoDTO {

	private String nombre;
	private String email;
	private int edad;
	private String codigoCurso;
	
	public AlumnoDTO(String nombre, String email, int edad, String codigoCurso) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		this.codigoCurso = codigoCurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	
	
	
	
}
