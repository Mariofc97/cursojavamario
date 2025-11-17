package es.cursojava.enums;

public enum AlumnoEnum {

	ALUMNO1("Alumno1","1234A",9.0),
	ALUMNO2("Alumno2","1234A",7.0),
	ALUMNO3("Alumno3","1234A",3.0),
	ALUMNO4("Alumno4","1234A",9.0),
	ALUMNO5("Alumno5","1234A",10.0),
	ALUMNO6("Alumno6","1234A",5.0),
	ALUMNO7("Alumno7","1234A",4.0);
	
	private String nombre;
	private String dni;
	private double notaMedia;
	
	private AlumnoEnum(String nombre, String dni, double notaMedia) {
		this.nombre = nombre;
		this.dni = dni;
		this.notaMedia = notaMedia;
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
	
	
	
}
