package es.cursojava.inicio.interfaces;

public interface Interfaz1 extends Interfaz2, Interfaz3 {
	
	int NUMERO = 9; // la variable es estatica y final, aunque no lo pongamos
	
	public void metodo1(); // el metodo es abstracto, aunque no lo pongamos
	
	public void metodo2(String nombre);
	
	//interfaz 2 con metodo 3 que devuelve un entero
	//interfaz3 con metodo 4 que devuelve un string y le pasamos un entero
	

}
