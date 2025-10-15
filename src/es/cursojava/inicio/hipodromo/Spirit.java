package es.cursojava.inicio.hipodromo;

public class Spirit extends Caballo {

	public Spirit(String nombre, double velocidadBase, int energia, int victorias) {
		super(nombre, velocidadBase, energia, victorias);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public double correr() {

		double factorEnergia = 0.5 + (energia / 100.0) * 0.5;

		double factorAleatorio = 0.9 + Math.random() * 0.3;

		double velocidadReal = velocidadBase * factorEnergia * factorAleatorio;
		
		int energiaAntes = energia;
		int desgaste = 8 + (int) Math.round(velocidadReal / 8.0);
		energia = energia - desgaste;
		if (energia < 0) {
			energia = 0;
		}
		
		log.debug(nombre + " corre a velocidad " + velocidadReal + " y su energia era " + energiaAntes + " y pasa a ser " + energia + " sobre 100" );

		return velocidadReal;
	}
	
	

}
