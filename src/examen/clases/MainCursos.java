package examen.clases;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import examen.excepcion.NoOficialException;
import utils.Utilidades;

public class MainCursos {

	protected static final Logger log = LoggerFactory.getLogger(MainCursos.class);

	public static void main(String[] args) {

		try {
			// si no utilizo la excepcion todos los metodos funcionan sin problema
			List<Master> masteres = creacionMasteres();
			eliminarMaster(masteres);
			mostrarMasteresOficiales(masteres);
		} catch (NoOficialException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static List<Master> creacionMasteres() throws NoOficialException {

		Master master1 = new Master("Psicologia", 1, 20, true);
		Master master2 = new Master("Criminologia", 2, 15, true);
		Master master3 = new Master("Pedagogia", 3, 20, false);

		if (master1.isOficial() == false || master2.isOficial() == false || master3.isOficial() == false) {
			throw new NoOficialException("El master debe de ser oficial");
		}

		List<Master> masteres = new ArrayList<>();
		masteres.add(master1);
		masteres.add(master2);
		masteres.add(master3);

		return masteres;
	}

	public static void eliminarMaster(List<Master> masteres) {
		int cursoAeliminar = Utilidades.pideDatoNumerico("Introduce el ID del master que desea eliminar: ");

		for (Master master : masteres) {
			if (master.getCodigoCurso() == cursoAeliminar) {
				log.info("Curso {} eliminado correctamente", master.getNombreCurso());
				masteres.remove(master);
			}
		}
	}

	public static void mostrarMasteresOficiales(List<Master> masteres) {
		for (Master master : masteres) {
			if (master.isOficial()) {
				log.info(master.getNombreCurso());
			} else {
				log.error("El master {} no es oficial", master.getNombreCurso());
			}
		}
	}

}
