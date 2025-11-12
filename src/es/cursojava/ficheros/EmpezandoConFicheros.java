package es.cursojava.ficheros;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmpezandoConFicheros {
	private static final Logger logger = LoggerFactory.getLogger(EmpezandoConFicheros.class);

	public static void main(String[] args) {
		// ruta absoluta: ruta creada desde la raiz al final, en un proyecto no se
		// utilizan rutas absolutas, solo relativas, porque en el ordenador de otra
		// persona puede no funcionar
		File directorio = new File("C:\\Users\\Tardes\\Ficheros"); 
		// se crean dos objetos asignados a variables tipo
		// file, pero eso no quiere decir que el directorio
		// exista!
		File fichero = new File("C:\\Users\\Tardes\\Ficheros\\fichero1.txt");

		directorio.mkdir(); // esto si crea el directorio

		System.out.println(directorio.isDirectory());
		System.out.println(directorio.isFile());

		System.out.println(fichero.isDirectory());
		System.out.println(fichero.isFile());
		System.out.println(fichero.exists());

//		for (int i = 0; i < 10; i++) {
//			File directorioNuevo = new File(directorio, "\\subdir" + i);
//			directorioNuevo.mkdir();
////		}
//		System.out.println("========================================="); 
		// eliminando todos los objetos directorio que ha creado 
		String[] lista = directorio.list(); // devuelve un String[] con los nombres de las entradas
		for (String nombre : lista) {
			System.out.println(nombre);
			File file1 = new File(directorio, nombre);
			file1.delete();
		}
//
//		File[] ficheros = directorio.listFiles(); // devuelve un File[] con los objetos ya listos
//		for (File file : ficheros) {
//			System.out.println(file.delete());
//		}
//
//		System.out.println("=========================================");
		File fichero2 = new File("C:\\Users\\Tardes\\Ficheros\\fichero2.txt");
		try {
			fichero2.createNewFile();
			
			
		} catch (IOException e) {
//			Ejemplos típicos que causan IOException
//
//			El archivo no existe o la ruta es incorrecta.
//
//			Permisos: no puedes leer/escribir en esa carpeta.
//
//			Disco lleno o dispositivo no disponible.
//
//			El archivo está abierto/bloqueado por otro proceso.
//
//			Red: la conexión se interrumpe al leer/escribir por socket.
			logger.error("Error al crear el fichero " + fichero2.getAbsolutePath() + ": " + e.getMessage(), e);
		}

	}
}
