package es.cursojava.ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreacionFicherosEjercicio1 {
	
	//Ejercicio 1:
//	============================================================
//			Ficheros FILE: 
//			Crear en la carpeta Ficheros:
//			Crear el directorio llamado ‘Imágenes’. 
//			Crear el directorio llamado ‘Documentos’. 
//			Crear el directorio llamado ‘Otros’. 
//
//			Preguntar por 5 nombres de ficheros.
//			    Si el fichero tiene la extensión de una imagen (.gif - .jpg - .png) lo vas a crear en la carpeta de imágenes. 
//			    Si el fichero es un .txt en documentos. 
//			    Si no es una imagen y no es un documento lo añadirán en otros. 
//
//


	private static final Logger logger = LoggerFactory.getLogger(CreacionFicherosEjercicio1.class);


	public static void main(String[] args) {
		
		File directorioImagenes = new File("C:\\Users\\Tardes\\Ficheros\\Imagenes");
		File directorioDocumentos = new File("C:\\Users\\Tardes\\Ficheros\\Documentos");
		File directorioOtros = new File("C:\\Users\\Tardes\\Ficheros\\Otros");
		
		directorioImagenes.mkdir();
		directorioDocumentos.mkdir();
		directorioOtros.mkdir();
//		directorioImagenes.delete();
//		directorioDocumentos.delete();
//		directorioOtros.delete();
		
		try (Scanner sc = new Scanner(System.in)){
			for (int i = 1; i <= 5; i++) {
				System.out.println("Introduce la extension del fichero " + i + " :");
				String ext = sc.nextLine().trim().toLowerCase();
				
				if(ext.startsWith(".")) {
					ext = ext.substring(1); // con esto reasignas el bucle y cambias la extension
				}
				
				System.out.println("Nombre del archivo (sin extension) " + i + " :");
				String nombre = sc.nextLine().trim();
				if (nombre.isEmpty()) {
					i--;
					continue; // si el nombre esta vacio repite la misma iteracion
				}
				
				File destino;
				switch (ext) {
				case "jpg": case "gif": case "png":
					destino = directorioImagenes;
					break;
				case "txt":
					destino = directorioDocumentos;
					break;
				default:
					destino = directorioOtros;
					break;
					
				}
				
				File fichero = new File(destino, nombre + "." + ext);
				
				try {
					boolean ficheroCreado = fichero.createNewFile();
					if(ficheroCreado) {
						System.out.println("fichero creado en " + fichero.getAbsolutePath());
					} else {
						System.out.println("Error al crear el fichero en el directorio " + fichero.getAbsolutePath());
					}
				} catch (IOException e) {
					logger.error("Error al crear el fichero " + fichero.getAbsolutePath() + ": " + e.getMessage(), e);
				}
			}
			
		}
		
//		Coger todos los ficheros que están en el directorio de otros, renombrarlos con nuestro nombre y con un contador para clasificar los archivos.
		
//		File[] ficherosOtros = directorioOtros.listFiles();
//		int contador = 0;
//		for (File file : ficherosOtros) {
//			String nuevoNombre = "Mario" + contador++;
//			file.renameTo(directorioOtros);
//			File destino = new File(directorioOtros, nuevoNombre);
//		}
		System.out.println("Ejercicio 1 acabado");
		
//		Ejercicio 2:
//			============================================================
//			Preguntamos por un directorio
//			Si existe 
//			Nombre, tamaño y si es oculto (De cada fichero del directorio).
		
		Scanner sc = new Scanner(System.in);  
		System.out.println("Ruta del directorio que buscas: ");
		String directorioBuscado = sc.nextLine().trim();
		
		File dir = new File(directorioBuscado);
		
		if (dir.isDirectory()) {
			if (dir.exists()) {
				File[] files = dir.listFiles();
				if (files == null) {
					System.out.println("El directorio esta vacio, no se pudo listar el directorio ");
					return;
				}
				for (File f : files) {
					System.out.println(
							"Nombre " + f.getName()+
							" | Tamaño " + f.length() + 
							" | ¿Es oculto? " + f.isHidden()
							);
				}
			} else {
				System.out.println("El texto introducido no es un directorio");
			}
		} else {
			System.out.println("El texto introducido no es un directorio");
		}
		
	}

}
