package es.cursojava.hibernate.ejercicios.ejercicio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ArchivoServicio {
	
	public List<String> leerLineas(String nombre) throws IOException {
		Path path = Paths.get(nombre);
		return Files.readAllLines(path);
	}

	public String leerArchivo3(String nombre) throws IOException {
		Path path = Paths.get(nombre);
		StringBuilder sb = new StringBuilder();

		List<String> lines = Files.readAllLines(path);
		for (String linea : lines) {
			sb.append(linea + "\n");
		}

		return sb.toString();
	}

}
