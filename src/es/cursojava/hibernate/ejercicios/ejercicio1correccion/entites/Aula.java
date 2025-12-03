package es.cursojava.hibernate.ejercicios.ejercicio1correccion.entites;

import jakarta.persistence.*;

@Entity
@Table(
    name = "AULA",
    uniqueConstraints = {
        @UniqueConstraint(name = "UK_AULA_CODIGO", columnNames = "codigo_aula")
    }
)
public class Aula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo_aula", nullable = false, unique = true, length = 50)
    private String codigoAula;

    @Column(nullable = false)
    private Integer capacidad;

    @Column(length = 100)
    private String ubicacion;

    // ===== Constructores =====
    public Aula() {
    }

    public Aula(String codigoAula, Integer capacidad, String ubicacion) {
        this.codigoAula = codigoAula;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
    }

    // ===== Getters y Setters =====
    public Long getId() {
        return id;
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

