package es.cursojava.ficheros;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import es.cursojava.bbdd.Producto;

public class ArchivoServicio2 {
	
	private static final String SEPARADOR_DEFAULT= "|";

	public static void crearArchivoProductos(String nombreFichero, List<Producto> productos, String separador) {
		String separadorFichero = separador==null?SEPARADOR_DEFAULT:separador;
//		if (separador==null) {
//			separadorFichero=SEPARADOR_DEFAULT;
//		}else {
//			separadorFichero=separador;
//		}
		
		File archivo = new File(nombreFichero);
		
		try (PrintWriter buffer = new PrintWriter(archivo)) {
			// try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo))){
			
			for (Producto producto : productos) {
				
				// se utiliza stringbuilder para guardar menos objetos en memoria
				StringBuilder lineaProducto = new StringBuilder();
				lineaProducto.append(producto.getId()).append(separadorFichero);
				lineaProducto.append(producto.getNombre()).append(separadorFichero);
				lineaProducto.append(producto.getCategoria()).append(separadorFichero);
				lineaProducto.append(producto.getPrecio()).append(separadorFichero);
				lineaProducto.append(producto.getStock()).append(separadorFichero);
				lineaProducto.append(producto.getFecha_alta()).append(separadorFichero);
				lineaProducto.append(producto.getEstado()).append(separadorFichero);
				lineaProducto.append(producto.getCreado_por()).append(separadorFichero);
				lineaProducto.append(producto.getCodigo_sku()).append(separadorFichero);
				lineaProducto.append(producto.getIva()).append(separadorFichero);
				
				buffer.println(lineaProducto.toString());
			}
			
			
			// buffer.close();
			System.out.println("El archivo se ha creado con éxito!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
