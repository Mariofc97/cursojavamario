package es.cursojava.hibernate.ejercicios.ejercicio1correccion.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class AulaDTO {
	

    private Long id;
    private String codigoAula;
    private Integer capacidad;
    private String ubicacion;
    
	public AulaDTO(Long id, String codigoAula, Integer capacidad, String ubicacion) {
		super();
		this.id = id;
		this.codigoAula = codigoAula;
		this.capacidad = capacidad;
		this.ubicacion = ubicacion;
	}

	public AulaDTO(String codigoAula, Integer capacidad, String ubicacion) {
		super();
		this.codigoAula = codigoAula;
		this.capacidad = capacidad;
		this.ubicacion = ubicacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoAula() {
		return codigoAula;
	}

	public void setCodigoAula(String codigoAula) {
		this.codigoAula = codigoAula;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	
    
    

}
