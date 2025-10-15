package es.cursojava.inicio.hipodromo;

public interface Competidor {
	
	String getNombre();
	double correr();
	void descansar();
	int getVictorias();
	void sumarVictoria();

}
