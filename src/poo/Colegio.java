package poo;

public class Colegio {
	
	// Clase colegio en el main crear 3 alumnos y ponerlos a estrudiar
	
	public static void main(String[] args) {
		Alumno alumno0 = new Alumno();
		alumno0.setNombre("Mario");
		alumno0.setDni("11A");
		alumno0.setNotaMedia(6.05);
		alumno0.setAsignaturas(new String[]{"Matematicas", "Lenguaje", "Biologia"});
		
		Alumno alumno1 = new Alumno();
		alumno1.setNombre("Marta");
		alumno1.setDni("22B");
		alumno1.setNotaMedia(9.25);
		alumno1.setAsignaturas(new String[]{"Física", "Lenguaje", "Biologia"});
		
		Alumno alumno2 = new Alumno();
		alumno2.setNombre("Jose");
		alumno2.setDni("33X");
		alumno2.setNotaMedia(3.05);
		alumno2.setAsignaturas(new String[]{"Recreo", "Lenguaje", "FOL"});
		
		estudiarAlumnos(alumno0,alumno1,alumno2);
	}
	
	// Crear metodo estudiarAlumnos al que le pasais los 3 alumnos y se pone a todos a estudiar.
	
	public static void estudiarAlumnos(Alumno... alumnos) {
		for(Alumno alumno: alumnos) {
			alumno.estudiar();
			System.out.println("-------------------------");
		}
		
	}
	

	
	

}
