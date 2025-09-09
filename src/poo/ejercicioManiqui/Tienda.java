package poo.ejercicioManiqui;

public class Tienda {

	public static void main(String[] args) {
		Tienda tienda1 = new Tienda("Dolce Gabana", 5);
		Maniqui[] ms = tienda1.abrirTienda();
		
		tienda1.abrirTienda();
		tienda1.vestirManiquies(ms);
		tienda1.mostrarEscaparate();

	}

	private String nombre;
	private Maniqui[] maniquis;
	private int numManiquis;

	public Tienda(String nombre, int numManiquis) {
		this.nombre = nombre;
		this.maniquis = new Maniqui[numManiquis];
	}

	public Maniqui[] abrirTienda() {

		Vestido vestido1 = new Vestido("Rojo", 45.0, "L");
		Vestido vestido2 = new Vestido("Blanco", 85.0, "M");

		Maniqui maniqui1 = new Maniqui(01, vestido1);
		Maniqui maniqui2 = new Maniqui(02, vestido2);
		Maniqui maniqui3 = new Maniqui(03);
		
		Maniqui[] maniquies = {maniqui1, maniqui2, maniqui3};

		numManiquis = 3;
		

		System.out.println("La tienda " + nombre + " ha abierto con " + numManiquis + " maniquies");
		
		return maniquies;
	}

	public void vestirManiquies(Maniqui[] maniquiesVestir) {

		for (Maniqui maniqui : maniquis) {
			Maniqui m = maniquis[i];
			if (maniquis[i] != null && m.desvestir()) {
				Boton boton1 = new Boton("Negro", "pequeño", "redondo");
				Boton boton2 = new Boton("Blanco", "grande", "cuadrado");
				Boton botonesPantalon[] = { boton1, boton2 };
				Boton botonesCamisa[] = { boton2, boton2, boton2, boton2, boton2 };
				Pantalon p = new Pantalon("Marron", 50.00, "XL", botonesPantalon);
				Camisa c = new Camisa("Azul", 45.00, "L", botonesCamisa);
				m.vestir(p, c);

				System.out.println("Se ha vestido el maniqui con id: " + (i + 1) + " con camisa y pantalón");
			}
		}

	}
	
	public void mostrarEscaparate(Maniqui[] maquinis) {
		double total = 0;
		System.out.println("Escaparate de la tienda: ");
		for (int i = 0; i < numManiquis; i++) {
			Maniqui m = maniquis[i];
			if (m != null) {
				total += m.getPrecioRopa();
			}
		}
		
		System.out.println("El precio total del escaparate teniendo en cuenta todos los maniquis es: " + total + " €");
		
	}

}
