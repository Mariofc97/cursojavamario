package es.cursojava.inicio.interfaces.ejercicio.gestionVehiculos;

public class MainTienda {
	
	public static void main(String[] args) {
		
		Platano platano1 = new Platano("01","Platano canario","22-10-2025");
		Movil movil1 = new Movil("02","Samsung Galaxy","30-08-2025");
		Coche coche1 = new Coche("03","Seat Ibiza", "Gris", 9000);
		MountainBike bici1 = new MountainBike("04","BiciCross 3.0");
		
		selectObject(platano1);
		insertObject(movil1);
		updateObject(coche1);
		deletableObject(bici1);
		
		encender(movil1);
		apagar(coche1);
		
	}
	
	private static void encender(Encendible e) {
		e.encender();
	}
	
	private static void apagar(Apagable a) {
		a.apagar();
	}
	
	private static void insertObject(Insertable i) {
		i.insert();
	}
	
	private static void selectObject(Consultable c) {
		c.select();
	}
	
	private static void updateObject(Updatable u) {
		u.update();
		
	}
	
	private static void deletableObject(Deletable d) {
		d.delete();
		
	}
	

}
