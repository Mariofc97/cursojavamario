package es.cursojava.inicio.condicionales;

public class CondicionalesSwitch {
	
	public static void main(String[] args) {
		
		String mes = "mayo";
		
		switch (mes) {
			case "enero": 
				System.out.println("Invierno");
			
			case "febrero":
				System.out.println("Invierno");
			break;
			
			case "marzo": 
				System.out.println("Gustito");

			case "abril": 
				System.out.println("Gustito");
			
			case "mayo": 
				System.out.println("Gustito");
			break;
			case "junio": 
				System.out.println("Calor");
			break;
			case "julio":
				System.out.println("Horror1");
			break;
			case "agosto": System.out.println("Horror2");
			break;
			default:
				System.out.println("Mes incorrecto");
		}
	}

}
