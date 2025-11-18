package examen.ficheros;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArchivoServicio {

	public String leerArchivo3(String nombre) throws IOException {
		Path path = Paths.get(nombre);
		StringBuilder sb = new StringBuilder();

		List<String> lines = Files.readAllLines(path);
		for (String linea : lines) {
			sb.append(linea + "\n");
		}

		return sb.toString();
	}

	public Map<Integer, String> leerLineasEnMapa(String nombreArchivo) throws IOException {
		Map<Integer, String> mapaLineas = new HashMap<>();

		try (BufferedReader br = Files.newBufferedReader(Paths.get(nombreArchivo))) {
			String linea;
			int numeroLinea = 1;

			while ((linea = br.readLine()) != null) {
				mapaLineas.put(numeroLinea, linea);
				numeroLinea++;
			}
		}

		return mapaLineas;
	}

}
