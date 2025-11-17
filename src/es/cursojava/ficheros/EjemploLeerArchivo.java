package es.cursojava.ficheros;

import java.io.IOException;

public class EjemploLeerArchivo {
	

    public static void main(String[] args) {
        //String nombreArchivo = "D:\\Cursos\\Java\\archivo\\java.txt";
    	String nombreArchivo = "./recursos/mario_productos.txt";
        ArchivoServicio servicio = new ArchivoServicio();
		EjemploLeerArchivo ejemplo = new EjemploLeerArchivo();

		// leerarchivo3 propaga la excepcion, por lo que nos obliga a controlarla
        try {
			System.out.println(servicio.leerArchivo3(nombreArchivo));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        // si queremos utilizar leerarchivo2, no hace falta manejar la excepcion, porque ya lo maneja el propio metodo y no se propaga fuera de el.
      System.out.println(servicio.leerArchivo2(nombreArchivo));
      
      //debemos de leer el archivo, 
    }
}
