package poo.Herencia;

public class Vaca extends Animal {
	
	private int numCuernos;
	
	public Vaca(String nombre, double peso, long identificador, int numCuernos) {
		super(nombre, peso, identificador);
		this.numCuernos = numCuernos;
	}

	public int getNumCuernos() {
		return numCuernos;
	}

	public void setNumCuernos(int numCuernos) {
		this.numCuernos = numCuernos;
	}
	
	public void mugir() {
		System.out.println("La vaca " + this.getNombre() + " está mugiendo");
	}
	
	public void comer() {
		System.out.println("La vaca esta pastando");
	}

}
