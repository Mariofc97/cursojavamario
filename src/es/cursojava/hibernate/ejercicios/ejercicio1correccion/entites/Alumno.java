package es.cursojava.hibernate.ejercicios.ejercicio1correccion.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "TB_ALUMNO")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "Id")
	private long id;
    
    @NotNull
    @NotBlank
    @Size(max = 100)
    @Column(name = "nombre", nullable = false, length = 100)
	private String nombre;
    
    @Column(name= "email", nullable = false)
	private String email;
    
	private int edad;
	
	@ManyToOne
	@JoinColumn(name= "curso_id")
	private Curso curso;
	
	
	public Alumno() {
		super();
	}

	public Alumno(long id, @NotNull @NotBlank @Size(max = 100) String nombre, String email, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
	}

	public Alumno(@NotNull @NotBlank @Size(max = 100) String nombre, String email, int edad) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	
	
	
	
	
	
}
