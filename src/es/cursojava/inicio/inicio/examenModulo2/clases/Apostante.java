package es.cursojava.inicio.inicio.examenModulo2.clases;

import es.cursojava.inicio.inicio.examenModulo2.interfaces.Imprimible;

public class Apostante extends Persona implements Imprimible {

	private double saldo;

	public Apostante(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public Apostante(String nombre, int edad, double saldo) {
		super(nombre, edad);
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Apostante [saldo=" + saldo + ", getNombre()=" + getNombre() + "]";
	}

	@Override
	public void imprimeDatos() {
		// TODO Auto-generated method stub
		System.out.println(this);

	}

}
