package es.cursojava.bbdd.ejercicioRepaso;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.bbdd.Producto;

public class EstadisticasProducto {

	protected static final Logger log = LoggerFactory.getLogger(EstadisticasProducto.class);

	public static void estadisticasProductos(List<Producto> productos) {

		int numeroTotalProductos = productos.size();

		log.info("Numero total de productos: {}", numeroTotalProductos);

		Map<String, Integer> productosPorCategoria = new HashMap<>();

		int contadorProductosSinStock = 0;

		for (Producto p : productos) {

			String categoria = p.getCategoria();

			if (!productosPorCategoria.containsKey(categoria)) {
				// Primera vez que vemos esta categoria empezamos en 1
				productosPorCategoria.put(categoria, 1);
				// Ya existe, incrementamos uno.
			} else {
				int actual = productosPorCategoria.get(categoria);
				productosPorCategoria.put(categoria, actual + 1);
			}

			if (p.getStock() == 0) {
				contadorProductosSinStock++;
			}

		}

		log.info("Numero de productos sin stock : {}", contadorProductosSinStock);

		// para mostrarlo, usar entry set
		for (Map.Entry<String, Integer> entry : productosPorCategoria.entrySet()) {
			String categoria = entry.getKey();
			Integer cantidad = entry.getValue();
			log.info("Categoria {}, numero de productos: {}", categoria, cantidad);

		}
	}

	public static long contadorLineasFichero(Path fichero) {
		long numLineas = 0;

		// try-with-resources para cerrar el stream automáticamente
		try (Stream<String> lineas = Files.lines(fichero)) {
			numLineas = lineas.count();
			log.info("El fichero {} tiene {} líneas", fichero.toAbsolutePath(), numLineas);
		} catch (IOException e) {
			log.error("Error al contar líneas del fichero {}", fichero.toAbsolutePath(), e);
		}

		return numLineas;

	}
}
