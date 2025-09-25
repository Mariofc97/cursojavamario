package es.cursojava.oo.herencia.ejercicios.hospital;

import java.util.Scanner;

public class EmpleadosHospital extends Persona {
	
	/*public static void main(String[] args) {
		EmpleadosHospital empleado = new EmpleadosHospital("Mario",30);
		
		empleado.fichar();
		empleado.getTurno();
	}*/

	private String turno;

	public EmpleadosHospital(String nombre, int edad, String turno) {
		super(nombre, edad);
		this.turno = turno;
	}
	
	public EmpleadosHospital(String nombre, int edad) {
		super(nombre, edad);
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public void fichar() {
		System.out.println("Por favor, introduzca el numero correspondiente a su turno: \n1. Mañana \n2. Tarde \n3. Noche");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		switch (numero) {
		case 1:
			this.turno = "mañana";
			System.out.println("El empleado " + getNombre()+ " esta listo/a para trabajar en horario de " + this.turno);
			break;
		case 2:
			this.turno = "tarde";
			System.out.println("El empleado " + getNombre()+ " esta listo/a para trabajar en horario de " + this.turno);
			break;
		case 3:
			this.turno = "noche";
			System.out.println("El empleado " + getNombre()+ " esta listo/a para trabajar en horario de " + this.turno);
			break;
		default:
			System.out.println("El turno elegido no existe");
		}
		
		
	}
	
	public void comer() {
		super.comer();
		System.out.println("El empleado " + getNombre() + " esta comiendo en el comedor");
	}

}
