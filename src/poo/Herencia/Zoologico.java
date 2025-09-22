package poo.Herencia;

public class Zoologico {

	public static void main(String[] args) {
		Animal animal = new Vaca("Taurus",200,5205l,2);
		animal.comer();
		
		// Esto no se puede hacer
		//Vaca animal2 = new Animal("A1",30,12354);
		
		Lobo lobo = new Lobo("Furioso", 50,222,2);
		lobo.comer();
	}
}
