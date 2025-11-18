package examen.clases;

public class Master extends Cursolmpl {

	private boolean oficial;

	public Master(String nombre, int codigo, int cupoMaxEstudiantes) {
		super(nombre, codigo, cupoMaxEstudiantes);
		// TODO Auto-generated constructor stub
	}

	public Master(String nombre, int codigo, int cupoMaxEstudiantes, boolean oficial) {
		super(nombre, codigo, cupoMaxEstudiantes);
		this.oficial = oficial;
	}

	public boolean isOficial() {
		return oficial;
	}

	public void setOficial(boolean oficial) {
		this.oficial = oficial;
	}

	@Override
	public String getNombreCurso() {
		// TODO Auto-generated method stub
		return super.getNombreCurso();
	}

	@Override
	public int getCodigoCurso() {
		// TODO Auto-generated method stub
		return super.getCodigoCurso();
	}

	@Override
	public int getCupoDisponible() {
		// TODO Auto-generated method stub
		return super.getCupoDisponible();
	}

	@Override
	public String toString() {
		return "Master [oficial=" + oficial + ", getNombre()=" + getNombre() + "]";
	}

}
