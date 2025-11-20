package es.cursojava.hibernate;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_EMPRESA")
public class Empresa {
	// esto es para señalar a Hibernate cual sera la primary Key.
	@Id
	// con esto le damos el GENERATED AS IDENTITY POR LO QUE HAY QUE CREAR UN CONSTRUCTOR SIN ID.
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(length = 30)
	private String nombre;
	private String tipoSociedad;
	private String cif;
	@Column(name = "ACTIVIDAD")
	private String tipoActividad;
	private Date fechaConstitucion;
	
	public Empresa() {
		super();
	}

	public Empresa(long id, String nombre, String tipoSociedad, String cif, String tipoActividad,
			Date fechaConstitucion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipoSociedad = tipoSociedad;
		this.cif = cif;
		this.tipoActividad = tipoActividad;
		this.fechaConstitucion = fechaConstitucion;
	}
	
	public Empresa(String nombre, String tipoSociedad, String cif, String tipoActividad,
			Date fechaConstitucion) {
		super();
		this.nombre = nombre;
		this.tipoSociedad = tipoSociedad;
		this.cif = cif;
		this.tipoActividad = tipoActividad;
		this.fechaConstitucion = fechaConstitucion;
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

	public String getTipoSociedad() {
		return tipoSociedad;
	}

	public void setTipoSociedad(String tipoSociedad) {
		this.tipoSociedad = tipoSociedad;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getTipoActividad() {
		return tipoActividad;
	}

	public void setTipoActividad(String tipoActividad) {
		this.tipoActividad = tipoActividad;
	}

	public Date getFechaConstitucion() {
		return fechaConstitucion;
	}

	public void setFechaConstitucion(Date fechaConstitucion) {
		this.fechaConstitucion = fechaConstitucion;
	}
	
	
	
}
