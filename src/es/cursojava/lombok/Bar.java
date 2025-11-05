package es.cursojava.lombok;

public class Bar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Botella bot = new Botella(1000,"vidrio","botella","cerveza");
        Botella b = Botella.builder()
                .capacidad(1.5)
                .material("vidrio")
                .forma("cilíndrica")
                .contenido("agua")
                .build();
        
        System.out.println("Contenido " + bot.getContenido());


	}

}
