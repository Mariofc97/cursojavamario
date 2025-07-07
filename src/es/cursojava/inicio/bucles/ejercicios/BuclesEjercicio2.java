package es.cursojava.inicio.bucles.ejercicios;

public class BuclesEjercicio2 {
	
	public static void main(String[] args) {
		
//		2. Mostrar los pares del 2 al 100 y al mismo tiempo los impares del 99 al 1
//			2-99
//			4-97
//			6-95
		
		// CON FOR
		for (int par = 2, impar = 99; par <=100 && impar >=1; par +=2, impar -=2) {
			
			System.out.println(par + "," + impar);
		}
	}

}

//        CON WHILE
//        int par = 2;      
//        int impar = 99;    
//        
//        while (par <= 100 && impar >= 1) {
//            System.out.print(par + "," + impar);
//            par += 2;      // siguiente par
//            impar -= 2;    // siguiente impar
//        }
//        
//    }
//}
