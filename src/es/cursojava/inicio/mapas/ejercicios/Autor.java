package es.cursojava.inicio.mapas.ejercicios;

import java.util.Objects;

public class Autor {

	private String nombre;
	private String nacionalidad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Autor(String nombre, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj) // comproobar si dos objetos son exactamente iguales en memoria
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) // comprueba que ambos objetos sean del mismo tipo, esto evita comparar un Autor con un Libro
			return false;
		Autor other = (Autor) obj; //Aquí ya sabemos que obj no es nulo y es de la clase Autor, por lo que lo convertimos (cast) a tipo Autor para poder acceder a sus atributos (nombre, nacionalidad).
		return Objects.equals(nacionalidad, other.nacionalidad) && Objects.equals(nombre,  other.nombre); // este metodo define que dos autores son iguales si tienen el mismo nombre y la misma nacionalidad sin importar sin son el mismo objeto en memoria
	}
	
	
	
	

}
