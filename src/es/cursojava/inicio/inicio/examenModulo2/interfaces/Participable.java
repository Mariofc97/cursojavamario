package es.cursojava.inicio.inicio.examenModulo2.interfaces;

@FunctionalInterface

// es una interfaz funcional porque solo tiene un metodo abstracto
public interface Participable {

	String getIdentificador();
	
	// herencia abstracta en java, metodos default
	default public void participar() {
		System.out.println("Participando");
	}
}
