package es.cursojava.excepciones.ejercicioComensales;

public class ClienteAsiduo extends ClienteAdicto {

	private String mote;
	
	public ClienteAsiduo(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	
	public ClienteAsiduo(String nombre, String mote) {
		super(nombre);
		// TODO Auto-generated constructor stub
		this.mote = mote;
	}

	public String getMote() {
		return mote;
	}

	public void setMote(String mote) {
		this.mote = mote;
	}

	@Override
	public String toString() {
		return "ClienteAsiduo [mote=" + mote + ", getNombre()=" + getNombre() + "]";
	}
	
	
	
	


	
}
