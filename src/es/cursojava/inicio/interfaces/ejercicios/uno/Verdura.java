package es.cursojava.inicio.interfaces.ejercicios.uno;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Verdura implements Desinfectable {
	
	private static final Logger log = LoggerFactory.getLogger(Verdura.class);
	private String procedencia;

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public Verdura(String procedencia) {
		super();
		this.procedencia = procedencia;
	}
	
	public void limpiar() {
		log.info("Limpiando verdura",this.getClass().getName());
	}

}
