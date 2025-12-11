package es.cursojava.hibernate.ejercicios.ejercicio1correccion;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

//nombre_yyyymmdd.txt
public class ArchivoServicio {

	public List<String> leerArchivo3(String nombre) throws IOException {
		Path path = Paths.get(nombre);
		return Files.readAllLines(path);
	}
}
