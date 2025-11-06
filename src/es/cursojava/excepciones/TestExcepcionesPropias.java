package es.cursojava.excepciones;

public class TestExcepcionesPropias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			metodoTest();
		} catch (GetafeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("TERMINA");
	}

	// ESTO ESTA MAL, NO ESTAMOS CONTROLANDO LA EXCEPCION, SOLO LO ESTAMOS VIENDO NOSOTROS MISMOS
//	public static void metodoTest() {
//		if(Math.random()>0.2) {
//			GetafeException npe = new GetafeException("Null creado por mi");
//			try {
//				
//				throw npe;
//			} catch (GetafeException ge) {
//				System.out.println(ge.getMessage());
//			}
//		} else {
//			System.out.println("Todo bien");
//		}
//	}

	public static void metodoTest() throws GetafeException {
		if (Math.random() > 0.2) {
			GetafeException npe = new GetafeException("Null creado por mi");
			try {

				throw npe;
			} catch (GetafeException ge) {
				System.out.println(ge.getMessage());
			}
		} else {
			System.out.println("Todo bien");
		}
	}

}
