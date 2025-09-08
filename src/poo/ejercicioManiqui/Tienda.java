package poo.ejercicioManiqui;

public class Tienda{

	public static void main(String[] args) {
		

	}
	
	private String Nombre;
	private String direccion;
	private Maniqui[] maniquis;
	private int numManiquis;

	
	public Tienda(String nombre, String direccion, int numManiquis) {
		this.Nombre = nombre;
		this.direccion = direccion;
		this.maniquis = new Maniqui[numManiquis];
	}
	
	public void abrirTienda() {
		Vestido vestido1 = new Vestido("Rojo", 45.0,"L");
		Vestido vestido2 = new Vestido("Blanco", 85.0,"M");
		
		Maniqui maniqui1 = new Maniqui(01, vestido1);
		Maniqui maniqui2 = new Maniqui(02, vestido2);
		Maniqui maniqui3 = new Maniqui(03);
		
		numManiquis = 3;
	}
	
	public void vestirManiquies() {
		
		for (int i = 0; i < numManiquis; i++) {
			Maniqui m = maniquis[i];
			if (maniquis[i] != null && m.desvestir()) {
				Boton boton1 = new Boton("Negro","pequeño", "redondo");
				Boton boton2 = new Boton("Blanco","grande", "cuadrado");
				Boton botonesPantalon[] = {boton1,boton2};
				Boton botonesCamisa[] = {boton2, boton2, boton2, boton2, boton2};
				Pantalon p = new Pantalon("Marron", 50.00,"XL",botonesPantalon);
				Camisa c = new Camisa("Azul",45.00,"L",botonesCamisa);
				m.vestir(p,c);
				
				
				
			}
			
			
		}
	}

}
