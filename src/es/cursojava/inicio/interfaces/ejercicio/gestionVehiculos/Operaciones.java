package es.cursojava.inicio.interfaces.ejercicio.gestionVehiculos;

public class Operaciones {
	
	public static void encenderObjetos(Encendible [] arrayEncendible) {
		for(Encendible encendible : arrayEncendible) {
			encendible.encender();
		}
	}
	
	public static void encender(Encendible e) {
		e.encender();
	}
	
	public static void apagar(Apagable a) {
		a.apagar();
	}
	
	public static void insertObject(Insertable i) {
		i.insert();
	}
	
	public static void selectObject(Consultable c) {
		c.select();
	}
	
	public static void updateObject(Updatable u) {
		u.update();
		
	}
	
	public static void deletableObject(Deletable d) {
		d.delete();
		
	}

}
