package es.cursojava.hibernate.ejercicios.ejercicio1;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

@Entity
public class Curso {
	// esto es para señalar a Hibernate cual sera la primary Key.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(length = 20, nullable = false) // no puede ser null
	@NotBlank // No nulo y no cadena vacia
	private String codigo; // Obligatorio
	@Column(length = 100, nullable = false)
	@NotBlank
	private String nombre; // Obligatorio, no puede ser una cadena vacia
	@Column(length = 500)
	private String descripcion; // Opcional
	@Column(name = "HORAS_TOTALES",nullable = false)
	@Positive
	private int horas_totales; // Obligatorio, debe numero entero positivo
	@Column(nullable = false)
	private boolean activo; // Obligatorio CHECK solo puede ser verdadero o falso
	@Column(length = 20)
	@Pattern(regexp = "Basico|Intermedio|Avanzado") //regexp es regular expresion
	private String nivel; // Opcional, limitar valores a "Basico","Intermedio" o "Avanzado"
	@Column(length = 50)
	private String categoria; // Opcional, se pueden definir categorias estandar: Programacion, Big Data, DevOps, etc.
	@PositiveOrZero
	private double precio; // Opcional debe ser mayor o igual que 0
	private LocalDate fecha_inicio; // Opcional
	private LocalDate fecha_fin; // Opcional, debe ser posterior a la fecha de inicio
	@Column(nullable = false, updatable = false)
	private LocalDateTime fecha_creacion; //Obligatorio, se establece automaticamente con la fecha y hora actuales
	
	public Curso() {
		super();
	}

	public Curso(long id, @NotBlank String codigo, @NotBlank String nombre, String descripcion,
			@Positive int horas_totales, boolean activo, @Pattern(regexp = "Basico|Intermedio|Avanzado") String nivel,
			String categoria, @PositiveOrZero double precio, LocalDate fecha_inicio, LocalDate fecha_fin,
			LocalDateTime fecha_creacion) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.horas_totales = horas_totales;
		this.activo = activo;
		this.nivel = nivel;
		this.categoria = categoria;
		this.precio = precio;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.fecha_creacion = fecha_creacion;
	}

	public Curso(@NotBlank String codigo, @NotBlank String nombre, String descripcion, @Positive int horas_totales,
			boolean activo, @Pattern(regexp = "Basico|Intermedio|Avanzado") String nivel, String categoria,
			@PositiveOrZero double precio, LocalDate fecha_inicio, LocalDate fecha_fin, LocalDateTime fecha_creacion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.horas_totales = horas_totales;
		this.activo = activo;
		this.nivel = nivel;
		this.categoria = categoria;
		this.precio = precio;
		isFechaFinPosteriorAInicio();
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.fecha_creacion = fecha_creacion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getHoras_totales() {
		return horas_totales;
	}

	public void setHoras_totales(int horas_totales) {
		this.horas_totales = horas_totales;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public LocalDate getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(LocalDate fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public LocalDate getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(LocalDate fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public LocalDateTime getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(LocalDateTime fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	
    @AssertTrue(message = "La fecha fin debe ser posterior a la fecha de inicio")
    public boolean isFechaFinPosteriorAInicio() {
        // si alguna es null, no se aplica la regla (es opcional)
        if (fecha_fin == null || fecha_inicio == null) {
            return true;
        }
        return fecha_fin.isAfter(fecha_inicio);
    }
	
	
}
