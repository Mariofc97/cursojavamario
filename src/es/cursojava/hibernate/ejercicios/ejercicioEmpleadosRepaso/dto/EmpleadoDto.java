package es.cursojava.hibernate.ejercicios.ejercicioEmpleadosRepaso.dto;

import java.math.BigDecimal;

public class EmpleadoDto {

	private Long id;
	private String nif;
	private String nombre;
	private String departamento;
	private BigDecimal salario;
	
	public EmpleadoDto() {
		
	}

	public EmpleadoDto(Long id, String nif, String nombre, String departamento, BigDecimal salario) {
		super();
		this.id = id;
		this.nif = nif;
		this.nombre = nombre;
		this.departamento = departamento;
		this.salario = salario;
	}
	

	public EmpleadoDto(String nif, String nombre, String departamento, BigDecimal salario) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.departamento = departamento;
		this.salario = salario;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
}
