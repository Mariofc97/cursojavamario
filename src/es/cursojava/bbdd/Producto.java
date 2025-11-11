package es.cursojava.bbdd;

import java.sql.Date;

public class Producto {

	private int id;
	private String nombre;
	private String categoria;
	private double precio;
	private int stock;
	private Date fecha_alta;
	private String estado;
	private String codigo_sku;
	private String creado_por;
	private int iva;
	
	public Producto(int id, String nombre, String categoria, double precio, int stock, Date fecha_alta,
			String estado, String codigo_sku, String creado_por, int iva) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
		this.fecha_alta = fecha_alta;
		this.estado = estado;
		this.codigo_sku = codigo_sku;
		this.creado_por = creado_por;
		this.iva = iva;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Date getFecha_alta() {
		return fecha_alta;
	}

	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}



	public String getCodigo_sku() {
		return codigo_sku;
	}

	public void setCodigo_sku(String codigo_sku) {
		this.codigo_sku = codigo_sku;
	}

	public String getCreado_por() {
		return creado_por;
	}

	public void setCreado_por(String creado_por) {
		this.creado_por = creado_por;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio
				+ ", stock=" + stock + ", fecha_alta=" + fecha_alta + ", estado=" + estado + ", codigo_sku="
				+ codigo_sku + ", creado_por=" + creado_por + ", iva=" + iva + "]";
	}
	
	
	
	
	
	
	
	
}
