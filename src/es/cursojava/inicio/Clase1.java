

package es.cursojava.inicio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Clase1 {
	
	private final static Logger log = LoggerFactory.getLogger(Clase1.class);
	//private final static Logger log = LoggerFactory.getLogger("Clase1");

	
	public static void main (String[] args ) {
		int edad = 27;
		log.debug("Pruebaaa Mario");
		System.out.println("Mario Ferron"+"9"+edad);
		System.out.println("test2");
	}

}
