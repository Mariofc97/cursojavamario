package es.cursojava.inicio.interfaces.ejercicio.gestionVehiculos;

public interface Deletable extends Insertable, Updatable {

	@Override
	default void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void insert() {
		// TODO Auto-generated method stub
		
	}
	
	public void delete();
	
	

}
