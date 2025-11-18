package es.cursojava.bbdd.ejercicioRepaso;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.bbdd.Producto;
import utils.Utilidades;

public class MainMenu {
	
	protected static final Logger log = LoggerFactory.getLogger(MainMenu.class);  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MostrarMenu();
//		List<Producto> productos = MapeoProductos.consultaProductos();
//		Path directorioDestino = ExportadorProductos.crearDirectorioExportacion();
//		Path archivoCreado = ExportadorProductos.exportarProductosAArchivo(productos, directorioDestino);
//
//		Map<Integer, Producto> productosMapa = MapeoProductos.mapearProductosConLista(productos);
//
//		MapeoProductos.buscarPorId(productosMapa);
//
//		EstadisticasProducto.estadisticasProductos(productos);
//
//		EstadisticasProducto.contadorLineasFichero(archivoCreado);

	}

	private static void MostrarMenu() {
		
		List<Producto> productos = null;
		Map<Integer, Producto> productosMapa = null;
		Path directorioDestino = null;
		Path archivoCreado = null;
		boolean salir = false;
		while(!salir) {
			pintarMenu();
			int opcion = leerOpcion();
			switch(opcion) {
			case 1:
				productos = MapeoProductos.consultaProductos();
				productosMapa = MapeoProductos.mapearProductosConLista(productos);
				break;
			case 2:
				if (productos == null || productos.isEmpty()) {
					log.info("Primero debes cargar productos desde la opcion 1");
				} else {
					directorioDestino = ExportadorProductos.crearDirectorioExportacion();
					archivoCreado = ExportadorProductos.exportarProductosAArchivo(productos, directorioDestino);
				}
				break;
			case 3:
				if (productos == null || productos.isEmpty() || archivoCreado == null) {
					log.info("Primero debes cargar productos desde la opcion 1 y generar el directorio y archivo desde la opcion 2");
				} else {
					EstadisticasProducto.estadisticasProductos(productos);
				}
				break;
			case 4:
			    if (archivoCreado == null) {
			        log.info("Todavía no se ha exportado ningún fichero. Usa la opción 2.");
			    } else {
			        long lineas = EstadisticasProducto.contadorLineasFichero(archivoCreado);
			        log.info("El fichero tiene {} líneas", lineas);
			    }
			    break;
			case 5:
			    if (productosMapa == null || productosMapa.isEmpty()) {
			        if (productos == null || productos.isEmpty()) {
			            log.info("No hay productos cargados. Usa primero la opción 1.");
			        } else {
			            productosMapa = MapeoProductos.mapearProductosConLista(productos);
			        }
			    }
			    if (productosMapa != null && !productosMapa.isEmpty()) {
			        MapeoProductos.buscarPorId(productosMapa);
			    }
			    break;
			case 6:
				log.info("Saliendo del menu...");
				log.info("Hasta otra!");
				salir = true;
				break;
			default:
				log.info("Opcion no valida");
				break;
			}
			
		}
	}
	
	private static void pintarMenu() {
		log.info("Menu\n1.Cargar productos desde BBDD.\n2.Exportar productos a fichero.\n3.Mostrar estadísticas de productos en memoria.\n4.Contar lineas del fichero exportado.\n5.Buscar producto por ID.\n6.Salir ");
	}
	
	private static int leerOpcion() {
		int opcion = Utilidades.pideDatoNumerico("Introduce la opcion deseada: ");
		
		return opcion;
	}
	
	
}


