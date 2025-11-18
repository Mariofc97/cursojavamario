package examen.ficheros;

import java.io.IOException;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeerFichero {

	protected static final Logger log = LoggerFactory.getLogger(LeerFichero.class);

	public static void main(String[] args) {
		String nombreArchivo = ".\\recursos\\application.log";
		ArchivoServicio servicio = new ArchivoServicio();

		try {

			log.debug(servicio.leerArchivo3(nombreArchivo));

			Map<Integer, String> lineasMapa = servicio.leerLineasEnMapa(nombreArchivo);

			int contadorJava = 0;
			//mapa con numero de linea y contenido de la linea
			for (Map.Entry<Integer, String> entry : lineasMapa.entrySet()) {
				log.info("Línea " + entry.getKey() + ": " + entry.getValue());
				if (entry.getValue().contains("java")) {
					contadorJava++;
					log.info("La linea {} contiene la palabra Java!", entry.getKey());
				}
			}
// no cuento cuantas veces aparece la palabra java, solo cuento en cuantas lineas aparece la palabra java
			log.info("La palabra java aparece en {} lineas", contadorJava);

		} catch (IOException e) {
			log.error("Error al recuperar informacion del archivo {}", nombreArchivo);
			e.printStackTrace();
		}
	}

//	public String leerArchivo3(String nombre) throws IOException{
//		Path path = Paths.get(nombre);
//		StringBuilder sb = new StringBuilder();
//
//		List<String> lines = Files.readAllLines(path);
//    
//    public static Map<Integer,String> mapeoApp(){
//    	
//    }
}
