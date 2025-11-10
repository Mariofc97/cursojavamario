package es.cursojava.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data                   // Getter/Setter, toString, equals/hashCode, RequiredArgsConstructor
@NoArgsConstructor     // Ctor sin args
@AllArgsConstructor     // Ctor con todos los campos
@Builder                // Patrón builder
//@Getter
//@Setter
//@ToString
public class Botella {

	private double capacidad;
	private String material;
	private String forma;
	private String contenido;
	
	
}
