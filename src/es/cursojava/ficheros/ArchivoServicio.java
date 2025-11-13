package es.cursojava.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;



import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

//nombre_yyyymmdd.txt
public class ArchivoServicio {

	// tres metodos diferentes para crear archivos y otros tres metodos para leer
	// los archivos

	public void crearArchivo(String nombre) {
		File archivo = new File(nombre); // se crea un objeto de tipo file
		// la clase FileWrite nos obliga a controlar una excepcion IOException, ya que
		// en el constructor de la clase FileWriter se lanza una excepcion
		System.out.println("crearArchivo nombre: " + nombre);
		if (archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try (FileWriter fw = new FileWriter(archivo, true); // con ese true le estamos diciendo si queremos
															// añadir texto a modo de append,
															// añadido al contenido del archivo y si ponemos false, va a
															// sobreescribir todo el archivo, borrando lo anterior, por
															// el texto que le pases

				BufferedWriter buffer = new BufferedWriter(fw);) {

			buffer.append("Hola que tal amigos!\n").append("Todo bien? yo escribiendo en un archivo...\n")
					.append("Hasta luego Lucas!\n");
			// buffer.close(); // hay que mirar si tiene el metodo closeable, en este caso
			// si tiene la interfaz closeable(), por eso esta comentada esta linea de código
			System.out.println("El archivo se ha creado con éxito!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// try with resources
		// try (Alumno a = new Alumno("N1",44,9)){
		// System.out.println("Pasa" +a .getNombre());
		// System.out.println("Termina");
		// }catch (Exception e){
		// e.printStackTrace();
		// }

		// BufferedWriter buffer = null;
		// try {
		// FileWriter fw = new FileWriter(archivo, false);
		// buffer = new BufferedWriter(fw);
		// buffer.append("Hola que tal amigos!\n")
		// .append("Todo bien? yo escribiendo en un archivo...\n")
		// .append("Hasta luego Lucas!\n");

		// }catch (IOException e){
		// e.printStackTrace();
		// }finally{
		// try {
		// buffer.close();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }

	}

	public void crearArchivo2(String nombre) {
		File archivo = new File(nombre);

		try (PrintWriter buffer = new PrintWriter(archivo)) { // este sobreescribe directamente el contenido de todo el
																// archivo
			// try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo))){

			buffer.println("Hola que tal amigos!");
			buffer.println("Todo bien? yo acá escribiendo un archivo...");
			buffer.printf("Hasta luego %s! %s", "JoseLuis", "Cadena");
			// buffer.close();
			System.out.println("El archivo se ha creado con éxito!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void crearArchivo3(String nombreFichero) { // solo sobreescribe las lineas que le pases, pero si el archivo
														// tenia mas lineas escritas, el resto se mantienen!
		Path ruta = Paths.get(nombreFichero); // Path es la version moderna de File
		String contenido = "Hola, mundo!\nEste es un ejemplo usando java.nio.";
		try {
			Files.write(ruta, contenido.getBytes(StandardCharsets.UTF_8), // convierte el texto a bytes usando
																			// codificacion UTF-8
					StandardOpenOption.CREATE, // crea el fichero si no existe, si existe da una excepcion
					StandardOpenOption.WRITE); // lo abre para escribir (si existe lo sobreescribe por defecto)
			System.out.println("Escritura completada.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String leerArchivo(String nombre) throws IOException {
		StringBuilder sb = new StringBuilder();
		File archivo = new File(nombre);
		// FileReader fileReader = new FileReader(archivo);
		// BufferedReader reader = new BufferedReader(fileReader);

		// String linea;
		// while ((linea = reader.readLine()) != null) {
		// sb.append(linea).append("\n");
		// }

		try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {

			String linea;
			while ((linea = reader.readLine()) != null) {
				sb.append(linea).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
		return sb.toString();
	}

	public String leerArchivo2(String nombre) {
		StringBuilder sb = new StringBuilder();
		File archivo = new File(nombre);
		try (Scanner s = new Scanner(archivo)) {

			s.useDelimiter("\n");
			while (s.hasNext()) {
				String linea = s.next();
				sb.append(linea).append("\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
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

	public void mostrarContenidoDirectorio(String directorio) {
		File dir = new File(directorio);
		File file1 = new File(directorio, "fichero1.txt");
		File file2 = new File(dir, "fichero1.txt");

		if (dir.isDirectory()) {
			String[] ficheros = dir.list();
			for (String nombreFichero : ficheros) {
				// System.out.print(nombreFichero + " ");
				String nuevoFichero = directorio + nombreFichero;
				System.out.println(nuevoFichero);
				File file = new File(nuevoFichero);
				if (file.isDirectory()) {
					// System.out.println("Es un directorio");
				} else {
					if (file.getName().endsWith(".txt")) {
						System.out.println("Se puede leer:" + file.canRead());
						System.out.println("TAmaño " + file.length());
						System.out.println("Es un fichero");
					}
				}

			}
		} else {
			System.err.println("No es un directorio");
		}
	}
}
