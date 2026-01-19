package es.cursojava.enums;

public class CaballoMain {

//    public static void main(String[] args) {
//
//        // Recorremos todos los valores del enum
//        for (Caballoenum datosCaballo : Caballoenum.values()) {
//
//            // Creamos un objeto Caballo usando los datos del enum
//            Caballo caballo = new Caballo(
//                    datosCaballo.getNombre(),
//                    datosCaballo.getPeso(),
//                    datosCaballo.getVelocidad(),
//                    datosCaballo.getExperiencia(),
//                    datosCaballo.getVictorias(),
//                    null,  // jinete (lo dejamos null de momento)
//                    0      // metrosRecorridos inicial
//            );
//
//            // Mostramos la información del caballo
//            System.out.println("Enum: " + datosCaballo.name() + " (ordinal: " + datosCaballo.ordinal() + ")");
//            System.out.println(caballo); // llama a toString(), que en tu clase usa imprimeDatos()
//            System.out.println("------------------------");
//        }
//
//        // Ejemplo de uso de valueOf, igual que con AlumnoEnum
//        Caballoenum seleccionado = Caballoenum.valueOf("CABALLO1");
//        System.out.println("Has seleccionado del enum: " + seleccionado.getNombre());
//    }
}