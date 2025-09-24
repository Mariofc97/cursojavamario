package es.cursojava.oo.herencia.ejercicios.hospital;

public class Doctor extends EmpleadosHospital {
	
	private String especialidad;

	public Doctor(String nombre, int edad, String turno, String especialidad) {
		super(nombre, edad, turno);
		this.especialidad = especialidad;
	}
	
	public Doctor(String nombre, int edad, String especialidad) {
		super(nombre, edad);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	/*public void diagnosticarPaciente(Paciente[] salaDeEspera) {
		for (Paciente paciente: salaDeEspera){
			comprobarTemperatura(paciente);
			if(comprobarTemperatura(paciente)==null) {
				System.out.println("El paciente esta sano, puede marcharse a casa");
			} else{
				Enfermo enfermo = 
			}
			
			if (paciente instanceof Paciente p ) {
				System.out.println("Paciente " + p.getNombre());
				p.comer();
			}
		}
	}*/
	
	public Enfermo comprobarTemperatura(Paciente paciente) {
		int min = 34;
		int max = 42;
		int temperatura = (int) (Math.random() * (max - min + 1)) + min;
		
		if (temperatura <= 37) {
			System.out.println("El paciente esta sano, tiene " + temperatura + " grados de temperatura" );
			return null;
		} else {
			System.out.println("El paciente esta enfermo, tiene " + temperatura + " grados de temperatura" );
			return new Enfermo(paciente.getNombre(),paciente.getEdad());
		}
		
	}
	
}
