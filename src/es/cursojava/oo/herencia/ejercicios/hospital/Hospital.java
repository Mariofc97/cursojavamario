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
		hospital1.HoraDeComer();
		hospital1.pasarConsultas();		
		hospital1.HoraDeComer();
		/*boolean coberturaOk = hospital1.controlarFichaje();
		if (!coberturaOk) {
		    System.out.println("Hay turnos sin la cobertura mínima.");
		    hospital1.ficharEmpleados();
		} else {
			hospital1.HoraDeComer();
			hospital1.pasarConsultas();		
			hospital1.HoraDeComer();
		}*/
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

		Habitacion hab1 = new Habitacion(1);
		Habitacion hab2 = new Habitacion(2);

		this.habitaciones = new Habitacion[] { hab1, hab2 };

		System.out.println(this.habitaciones.length + " habitaciones");

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

	/*public boolean controlarFichaje() {
		if (empleados.length == 0) {
			return false;
		}
		String[] Turnos = { "mañana", "tarde", "noche" };
		boolean todoOk = false;

		for (String turno : Turnos) {
			int doctores = 0;
			int enfermeros = 0;

			for (EmpleadosHospital empleado : empleados) {
				String t = empleado.getTurno();
				if (t != null && turno.equalsIgnoreCase(empleado.getTurno())) {
					if (empleado instanceof Doctor d) {
						doctores++;

					} else if (empleado instanceof Enfermero e) {
						enfermeros++;
					}
					
					if(doctores == 0 || enfermeros == 0) {
						System.out.println("Es necesario mas personal para iniciar el turno");
						todoOk = false;
					} else {
						System.out.println("Se ha iniciado la jornada en el turno " + turno + " con " + doctores + " doctores y " + enfermeros + " enfermeros");
					}
				}
			}

		}
		
		return todoOk = true;

	}*/

	public void HoraDeComer() {
		System.out.println("Es la hora de comer");
		for (EmpleadosHospital empleado : empleados) {
			if (empleado instanceof Doctor d) {
				d.comer();

			} else if (empleado instanceof Enfermero e) {
				e.comer();
			}
		}

		for (Paciente paciente : salaDeEspera) {
			if (paciente instanceof Paciente p) {
				p.comer();
			}
		}

		for (Habitacion hab : habitaciones) {
			if (hab.getEnfermo() != null) {
				hab.getEnfermo().comer();
			} else if (hab.getEnfermo() == null) {
				System.out.println("Todavia no hay enfermos ingresados en habitaciones");
			}
		}
	}

	public void pasarConsultas() {
		if (salaDeEspera == null || salaDeEspera.length == 0) {
			System.out.println("No hay pacientes en la sala de espera");
		}
		Doctor doc = getDoctor();
		Enfermero enf = getEnfermero();
		if (doc == null || enf == null) {
			System.out.println("No hay personal suficiente para asistir a los pacientes");
		}

		System.out.println("----El personal sanitario procede a pasar consulta----");
		while (salaDeEspera.length > 0) {
			Paciente p = sacarPacienteDeSalaEspera();
			enf.atenderPaciente(p);

			Enfermo enfermo = doc.diagnosticarPaciente(p);

			if (enfermo != null) {
				Habitacion libre = buscarHabitacionLibre();
				if (libre != null) {
					libre.setEnfermo(enfermo);
					System.out.println(p.getNombre() + " ingresado en la habitacion " + libre.getNumero());
				} else {
					System.out.println("Lo sentimos, no hay habitaciones disponibles para " + p.getNombre());
				}
			} else {
				System.out.println(p.getNombre() + " esta sano, no requiere ingreso");
			}
		}

		System.out.println("Consulta finalizada. Quedan " + salaDeEspera.length + " pacientes en la sala de espera");

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
		for (EmpleadosHospital empleado : empleados) {
			if (empleado instanceof Doctor d) {
				return d;
			}
		}
		return null;
	}

	private Enfermero getEnfermero() {
		for (EmpleadosHospital empleado : empleados) {
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
				if (habitacion.getEnfermo() == null) {
					return habitacion;
				}
			}
		}
		return null;
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
