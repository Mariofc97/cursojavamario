package es.cursojava.enums;

import utils.Utilidades;

public class Agenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DiasSemana [] programacionSemanal = {DiasSemana.SABADO, DiasSemana.DOMINGO};
		
		System.out.println(DiasSemana.values().length);
		
		DiasSemana[] diasTotales = DiasSemana.values();
		System.out.println("Todos los dias disponibles");
		
		for(DiasSemana diaSemanaTarea : programacionSemanal) {
			System.out.println(diaSemanaTarea);
		}
		
		Tarea tarea1 = new Tarea("Ir a la farmacia",programacionSemanal);
		String diaSemana = Utilidades.pideDatoCadena("Introduce dia de la semana");
		
		

	}

	private void recordarTarea(Tarea tarea) {
		String diaSemana = Utilidades.pideDatoCadena("Introduce día de la semana");
		
		DiasSemana[] diasTarea1 = tarea.getVistaSemana();
		
		for (DiasSemana diasSemana : diasTarea1) {
			if(diasSemana.name().equalsIgnoreCase(diaSemana)) {
				System.out.println("Ejecuta");
			}
		}
	}
}
