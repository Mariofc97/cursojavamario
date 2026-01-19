package es.cursojava.inicio.mapas.ejercicios;

public class MapaColegio {

//	public static void main(String[] args) {
//		Colegio colegio1 = new Colegio("Cole1", "Dir1");
//		Colegio colegio2 = new Colegio("Cole2", "Dir2");
//		
//		
//		List<Alumno> alumnos = MapaColegio.generaAlumnos();
//		
//		Map<String,List<Alumno>> aulasCole3 = new HashMap<>();
//		aulasCole3.put("aula1",alumnos.subList(0, 2));
//		aulasCole3.put("aula2",alumnos.subList(2, 3));
//		aulasCole3.put("aula3",alumnos.subList(3, 7));
//		Colegio colegio3 = new Colegio("Cole3", "Dir3",aulasCole3);
//		
//		Map<String,List<Alumno>> aulasCole2 = new HashMap<>();
//		aulasCole2.put("aula1", alumnos.subList(7, 10));
//		colegio2.setAulas(aulasCole2);
//		
//		
//		List<Colegio> colegios = Arrays.asList(colegio1,colegio2, colegio3);
//		for (Colegio colegio : colegios) {
//			if (colegio.getAulas().isEmpty()) {
//				System.out.println(colegio.getNombre() +" sin aulas");
//				Map<String,List<Alumno>> aulasCole1 = new HashMap<>();
//				aulasCole1.put("aula1", alumnos.subList(10, 11));
//				aulasCole1.put("aula2", alumnos.subList(11, 12));
//				aulasCole1.put("aula3", alumnos.subList(12, 13));
//				
//				colegio.setAulas(aulasCole1);
//			}
//		}
//		Alumno alumnoN = new Alumno("AN", "222N", 9.5);
//		Alumno alumnoN1 = new Alumno("AN1", "222N1", 6.5);
//		//colegio2.getAulas().get("aula1").add(alumnoN);//Añadimos alumnos a un aula que ya existe
//		
//		colegio2.getAulas().put("aula2", new ArrayList(Arrays.asList(alumnoN)));
//		colegio2.getAulas().get("aula2").add(alumnoN1);
//		//System.out.println(colegio2.getAulas().get("aula2").size());
//
//		mostrarDatosColegios(colegios);
//		mostrarColegioNotaMediaMayor(colegios);
//	}
//
//	private static List<Alumno> generaAlumnos() {
//		Alumno alumno1 = new Alumno("A1", "111A", 7.5);
//		Alumno alumno2 = new Alumno("A2", "222B", 2.5);
//		Alumno alumno3 = new Alumno("A3", "333C", 3.5);
//		Alumno alumno4 = new Alumno("A4", "444D", 4.5);
//		Alumno alumno5 = new Alumno("A5", "555E", 5.5);
//		Alumno alumno6 = new Alumno("A6", "666F", 6.5);
//		Alumno alumno7 = new Alumno("A7", "777G", 8.5);
//		Alumno alumno8 = new Alumno("A8", "888G", 8.5);
//		Alumno alumno9 = new Alumno("A9", "999G", 8.5);
//		Alumno alumno10 = new Alumno("A10", "1010G", 9.5);
//		Alumno alumno11= new Alumno("A11", "1011G", 9.75);
//		Alumno alumno12= new Alumno("A12", "1012G", 8.0);
//		Alumno alumno13= new Alumno("A13", "1013G", 7.7);
//
//
//		List<Alumno> alumnos = Arrays.asList(alumno1, alumno2, alumno3, alumno4, alumno5, alumno6, alumno7,alumno8,alumno9,alumno10,alumno11,alumno12,alumno13);
//
//		return alumnos;
//	}
//
//	private static void mostrarColegioNotaMediaMayor(List<Colegio> colegios) {
//		
//		double notaMediaMaxima = 0;
//		Colegio mejorColegio = null;
//		for(Colegio colegio : colegios) {
//			double notaMediaColegio = 0;
//			int contadorAlumnos = 0;
//			System.out.println(colegio.getNombre());
//			Map<String, List<Alumno>> aulas = colegio.getAulas();
//			Collection<List<Alumno>> listadosAlumnos = aulas.values();
//			for (List<Alumno> alumnos : listadosAlumnos) {
//				for (Alumno a : alumnos) {
//					notaMediaColegio += a.getNotaMedia();
//					contadorAlumnos++;
//				}
//				
//			}
//			
//			notaMediaColegio = notaMediaColegio/contadorAlumnos;
//			System.out.println(notaMediaColegio);
//			if (notaMediaColegio>notaMediaMaxima) {
//				notaMediaMaxima = notaMediaColegio;
//				mejorColegio = colegio;
//			}
//		}
//		
//		System.out.println(mejorColegio.getNombre() + " tienes la nota media más alta");
//		
//		Map<Integer, Persona> datos = new HashMap<>();
//		Collection Persona = datos.values();
//	}
//
//	private static void mostrarDatosColegios(List<Colegio> colegios) {
//
//		for (Colegio colegio : colegios) {
//			System.out.println(colegio);
//			Map<String, List<Alumno>> aulas = colegio.getAulas();
//			Set<String> nombresAulas = aulas.keySet();
//			for (String nombreAula : nombresAulas) {
//				System.out.println("\t" + nombreAula);
//				List<Alumno> alumnos = aulas.get(nombreAula);
//				for (Alumno alumno : alumnos) {
//					System.out.println("\t\t" + alumno);
//				}
//			}
//		}
//
//	}

}
