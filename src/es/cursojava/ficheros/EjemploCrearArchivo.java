package es.cursojava.ficheros;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
    	LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
    	System.out.println(datetime.getYear());
    	System.out.println(datetime.getMonthValue());
    	System.out.println(datetime.getMonth());
    	
		String fechaStr = ""+ datetime.getYear() + datetime.getMonthValue() + datetime.getDayOfMonth();

		LocalDate date = LocalDate.now();
		String fechaStr2 = ""+date;
		
		System.out.println("============================");
		System.out.println(fechaStr2);
		System.out.println("============================");

    	Instant instant = Instant.now(); // Hace lo mismo que localDateTime pero es mas reciente;
    	System.out.println(instant);
		//Ruta relativa a la carpeta del proyecto

		Date fecha = new Date();
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yy"); // MM es para meses y mm es para minutos, cuidado con eso
		String fechaStr3 = df.format(fecha); // simple date format tiene un metodo format, que hay que pasarle un Date
		
		System.out.println(fechaStr3);
		
		// no podemos usar rutas absolutas, porque lo normal es que sea util para diferentes terminales

        String nombreArchivo = "./recursos/mario_"+ fechaStr3 +".txt";
		
		
        ArchivoServicio service = new ArchivoServicio();
        //service.mostrarContenidoDirectorio("C:\\Users\\Tardes\\");
        service.crearArchivo3(nombreArchivo);
    }
}
