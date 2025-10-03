package es.cursojava.inicio.interfaces.ejercicio.gestionVehiculos;

public abstract class ProductosElectronicos extends Producto implements Apagable,Encendible,Consultable,Insertable,Updatable {
	
	private String fechaFabricacion;
	
	public ProductosElectronicos(String id, String nombre) {
		super(id, nombre);
		// TODO Auto-generated constructor stub
	}
	
	public ProductosElectronicos(String id, String nombre, String fechaFabricacion) {
		super(id, nombre);
		this.fechaFabricacion = fechaFabricacion;
		// TODO Auto-generated constructor stub
	}
	
}
