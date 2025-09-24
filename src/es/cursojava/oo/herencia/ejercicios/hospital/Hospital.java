package es.cursojava.oo.herencia.ejercicios.hospital;

import java.util.Arrays;

public class Hospital {

	private String nombre;
	private Habitacion[] habitaciones;
	private Paciente[] salaDeEspera;
	private EmpleadosHospital[] empleados;

	public static void main(String[] args) {
		Hospital hospital1 = new Hospital("Hospital General", null, null);
		hospital1.abrirHospital();
		hospital1.ficharEmpleados();

	}

	public Hospital(String nombre, Habitacion[] habitaciones, Paciente[] salaDeEspera) {
		super();
		this.nombre = nombre;
		this.habitaciones = habitaciones;
		this.salaDeEspera = salaDeEspera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Habitacion[] getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(Habitacion[] habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Paciente[] getSalaDeEspera() {
		return salaDeEspera;
	}

	public void setSalaDeEspera(Paciente[] salaDeEspera) {
		this.salaDeEspera = salaDeEspera;
	}

	public void abrirHospital() {

		System.out.println("El hospital ha abierto con: ");

		Habitacion hab1 = new Habitacion(01);
		Habitacion hab2 = new Habitacion(02);

		Habitacion[] habitaciones = { hab1, hab2 };

		System.out.println(habitaciones.length + " habitaciones");

		Paciente pac1 = new Paciente("Mario", 27);
		Paciente pac2 = new Paciente("Manu", 30);
		Paciente pac3 = new Paciente("Jose", 40);
		// 3 pacientes --> Meterlos en la sala de espera

		this.salaDeEspera = new Paciente[] { pac1, pac2, pac3 };

		System.out.println("Se encuentran " + salaDeEspera.length + " pacientes en la sala de espera del hospital");

		Enfermero enfermero1 = new Enfermero("Pepe", 35);

		Doctor doctor1 = new Doctor("Raul", 40, "cardiologia");

		this.empleados = new EmpleadosHospital[] { enfermero1, doctor1 };

		for (EmpleadosHospital empleado : empleados) {
			if (empleado instanceof Doctor d) {
				System.out.println("Doctor " + d.getNombre() + " || " + d.getEdad() + " años");

			} else if (empleado instanceof Enfermero e) {
				System.out.println("Enfermero " + e.getNombre() + " || " + e.getEdad() + " años");
			}
		}

	}

	public void ficharEmpleados() {
		System.out.println();
		for (EmpleadosHospital empleado : empleados) {
			if (empleado instanceof Doctor d) {
				System.out.println("Doctor " + d.getNombre() + ", fiche su jornada: ");
				d.fichar();

			} else if (empleado instanceof Enfermero e) {
				System.out.println("Enfermero " + e.getNombre() + ", fiche su jornada: ");
				e.fichar();
			}
		}
	}

	public void HoraDeComer() {
		System.out.println("Es la hora de comer");
		for (EmpleadosHospital empleado : empleados) {
			if (empleado instanceof Doctor d) {
				System.out.println("Doctor " + d.getNombre());
				empleado.comer();

			} else if (empleado instanceof Enfermero e) {
				System.out.println("Enfermero " + e.getNombre() + " || " + e.getEdad() + " años");
				empleado.comer();
			}
		}

		for (Paciente paciente : salaDeEspera) {
			if (paciente instanceof Paciente p) {
				System.out.println("Paciente " + p.getNombre());
				p.comer();
			}
		}
	}

	private Paciente sacarPacienteDeSalaEspera() {
		if (salaDeEspera == null || salaDeEspera.length == 0) {
			return null;
		} else {

			Paciente p = salaDeEspera[0];

			for (int i = 1; i < salaDeEspera.length; i++) {
				salaDeEspera[i - 1] = salaDeEspera[i];
			}
			salaDeEspera = Arrays.copyOf(salaDeEspera, salaDeEspera.length - 1);
			return p;
		}
	}
	
	private Doctor getDoctor() {
		for (EmpleadosHospital empleado:empleados) {
			if (empleado instanceof Doctor d) {
				return d;
			} 
		}
		return null;
	}
	private Enfermero getEnfermero() {
		for (EmpleadosHospital empleado:empleados) {
			if (empleado instanceof Enfermero e) {
				return e;
			} 
		}
		return null;
	}
	
	private Habitacion buscarHabitacionLibre() {
		if (habitaciones == null) {
			return null;
		} else {
			for (Habitacion habitacion : habitaciones) {
				if 
			}
		}
	}

	public void pasarConsultas(Paciente[] salaDeEspera) {
		for (Paciente paciente : salaDeEspera) {
			if (paciente instanceof Paciente p) {
				sacarPacienteDeSalaEspera();
				System.out.println("Paciente " + p.getNombre());
			
			}
			
		}
	}

}
