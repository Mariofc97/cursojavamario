package es.cursojava.bbdd.ejercicioRepaso;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import es.cursojava.bbdd.Producto;

public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Producto> productos = MapeoProductos.consultaProductos();
		Path directorioDestino = ExportadorProductos.crearDirectorioExportacion();
		ExportadorProductos.exportarProductosAArchivo(productos, directorioDestino);
		
		Map<Integer,Producto> productosMapa = MapeoProductos.mapearProductosConLista(productos);
		
		MapeoProductos.buscarPorId(productosMapa);
		
		

	}

}
