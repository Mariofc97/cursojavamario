package es.cursojava.inicio.repaso;

public class TeoriaVaria {
	
//	Método CON STRINGS									Qué hace												Ejemplo
//	length()								Devuelve la longitud del texto							"Hola".length() → 4
//	charAt(int)								Devuelve el carácter en una posición					"Hola".charAt(1) → 'o'
//	substring(int, int)						Extrae parte del texto									"Hola".substring(1, 3) → "ol"
//	equals(String)							Compara contenido (distingue mayúsculas)				"hola".equals("Hola") → false
//	equalsIgnoreCase(String)				Compara ignorando mayúsculas							"hola".equalsIgnoreCase("Hola") → true
//	toUpperCase() / toLowerCase()			Convierte a mayúsculas o minúsculas						"Hola".toUpperCase() → "HOLA"
//	"Hola".toLowerCase() → "hola"
//	contains(String)						Verifica si incluye una subcadena						"Hola mundo".contains("mun") → true
//	indexOf(String)							Devuelve la posición donde aparece una subcadena		"Hola".indexOf("l") → 2
//	replace(old, new)						Reemplaza texto											"Hola".replace("l", "x") → "Hoxa"
//	trim()									Elimina espacios al principio y final					" Hola ".trim() → "Hola"
	
	
	
//	🧩 Tabla: Métodos básicos y útiles para arrays en Java
//	Método / Propiedad						Qué hace								Ejemplo de uso
//	array.length							Devuelve el tamaño del array							array.length
//	Arrays.toString(array)					Convierte el array a texto (para imprimirlo)			System.out.println(Arrays.toString(array));
//	Arrays.sort(array)						Ordena los elementos (ascendente)						Arrays.sort(array);
//	Arrays.equals(array1, array2)			Compara si dos arrays tienen el mismo contenido			Arrays.equals(a, b)
//	Arrays.fill(array, valor)				Rellena todas las posiciones con un mismo valor			Arrays.fill(array, 0);
//	Arrays.copyOf(array, nuevoTamaño)		Copia el array con un nuevo tamaño						Arrays.copyOf(array, 10);
//	Arrays.copyOfRange(array, i, j)			Copia parte del array (de i a j-1)						Arrays.copyOfRange(array, 2, 5);
//	Arrays.binarySearch(array, valor)		Busca un valor en un array ordenado (devuelve índice)	Arrays.binarySearch(array, 10);
//	Arrays.asList(array)					Convierte un array de objetos en una lista (List)		List<String> lista = Arrays.asList(array);

}
