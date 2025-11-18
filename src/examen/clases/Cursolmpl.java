package examen.clases;

import examen.interfaces.Curso;

public class Cursolmpl implements Curso {

	private String nombre;
	private int codigo;
	private int cupoMaxEstudiantes;

	public Cursolmpl(String nombre, int codigo, int cupoMaxEstudiantes) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.cupoMaxEstudiantes = cupoMaxEstudiantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCupoMaxEstudiantes() {
		return cupoMaxEstudiantes;
	}

	public void setCupoMaxEstudiantes(int cupoMaxEstudiantes) {
		this.cupoMaxEstudiantes = cupoMaxEstudiantes;
	}

	@Override
	public String getNombreCurso() {
		return getNombre();

	}

	@Override
	public int getCodigoCurso() {
		// TODO Auto-generated method stub
		return getCodigo();
	}

	@Override
	public int getCupoDisponible() {
		// TODO Auto-generated method stub
		return getCupoDisponible();
	}

}
