package es.cursojava.bbdd.ejercicioRepaso;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.bbdd.Producto;

//1) Crear directorios de forma segura (ruta relativa)
//Enunciado
//
//Crea una clase ExportadorProductos que tenga un método:
//
//public static Path crearDirectorioExportacion()
//
//
//que haga lo siguiente:
//
//Construya una ruta relativa dentro del proyecto, por ejemplo:
//recursos/exportaciones
//(no uses rutas absolutas tipo C:\...).
//
//Si el directorio no existe, lo cree (incluyendo subdirectorios necesarios).
//
//Devuelva el Path del directorio creado o existente.
//
//Muestre un mensaje por consola indicando la ruta final usada.
//
//Pista: puedes usar Files.exists(path) y Files.createDirectories(path).

public class ExportadorProductos {
	
	protected static final Logger log = LoggerFactory.getLogger(ExportadorProductos.class);

	public static Path crearDirectorioExportacion() {
		
		// RUTA RELATIVA AL PROYECTO: ./recursos/exportaciones.
		Path directorio = Paths.get("recursos", "exportaciones");
		
		try {
		
			if(Files.notExists(directorio)) {
				Files.createDirectories(directorio);
				log.info("Directorio creado {}" + directorio.toAbsolutePath());
			}
		} catch (IOException e) {
			log.error("Error al crear el directorio {}" + e.getMessage());
			e.printStackTrace();
		}
		
		return directorio;
		
		
	}
	
//	2) Generar un fichero de productos con fecha en el nombre
//	Enunciado
//
//	Añade un método:
//
//	public static Path exportarProductosAArchivo(List<Producto> productos, Path directorioDestino)
//
//
//	que:
//
//	Genere un nombre de fichero del estilo:
//	productos_YYYYMMDD.txt
//	(por ejemplo: productos_20251117.txt).
//
//	Cree el archivo dentro del directorioDestino recibido.
//
//	Escriba una línea por producto con el mismo formato que ya usas:
//
//	id|nombre|categoria|precio|stock|fecha_alta|estado|codigo_sku|creado_por|iva
//
//
//	Devuelva el Path del fichero creado.
//
//	Pista: para la fecha, puedes usar LocalDate.now() + DateTimeFormatter.ofPattern("yyyyMMdd").
//	Para la ruta: directorioDestino.resolve(nombreFichero).
	
	public static Path exportarProductosAArchivo(List<Producto> productos, Path directorioDestino) {
		
		LocalDate hoy = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		String nombreFichero = "productos_" + hoy.format(dtf) + ".txt";
		
		Path fichero = directorioDestino.resolve(nombreFichero);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try(BufferedWriter bw = Files.newBufferedWriter(
				fichero,
				StandardCharsets.UTF_8,
				StandardOpenOption.CREATE,
				StandardOpenOption.TRUNCATE_EXISTING
				)){
			
			for (Producto p : productos) {
				String fechaStr = sdf.format(p.getFecha_alta());
				String linea = p.getId() + "|" +
						p.getNombre() + "|" +
						p.getCategoria() + "|" +
						p.getPrecio() + "|" +
						p.getStock() + "|" +
						fechaStr + "|" +
						p.getEstado() + "|" +
						p.getCodigo_sku() + "|" +
						p.getCreado_por() + "|" +
						p.getIva();
				
				bw.write(linea);
				bw.newLine();
			}
			
			log.info("Archivo creado en el directorio {}" + fichero.toAbsolutePath());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			log.error("Error al crear el archivo en el directorio {}" + fichero.toAbsolutePath());
			e.printStackTrace();
		}
		
		return fichero;
	}
	

	
}
