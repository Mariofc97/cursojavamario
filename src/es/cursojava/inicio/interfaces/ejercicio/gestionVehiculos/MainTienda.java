package es.cursojava.inicio.interfaces.ejercicio.gestionVehiculos;

public class MainTienda {
	
	public static void main(String[] args) {
		
		Platano platano1 = new Platano("01","Platano canario","22-10-2025");
		Movil movil1 = new Movil("02","Samsung Galaxy","30-08-2025");
		Coche coche1 = new Coche("03","Seat Ibiza", "Gris", 9000);
		MountainBike bici1 = new MountainBike("04","BiciCross 3.0");
		
		//Encendible coche2 = new Coche("05","Renault Laguna","Negro",4500);
		
		Encendible[] arrayEncendible = {coche1,movil1};
		Operaciones.encenderObjetos(arrayEncendible);
		
		Operaciones.selectObject(platano1);
		Operaciones.insertObject(movil1);
		Operaciones.updateObject(coche1);
		Operaciones.deletableObject(bici1);
		
		Operaciones.encender(movil1);
		Operaciones.apagar(coche1);
		
	}
	

}
