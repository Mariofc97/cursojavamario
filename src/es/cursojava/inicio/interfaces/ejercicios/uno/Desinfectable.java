package es.cursojava.inicio.interfaces.ejercicios.uno;

public interface Desinfectable extends Limpiable {

	@Override
	default void limpiar() {
		// TODO Auto-generated method stub
		
	}
	
	public void desinfectar();

}
