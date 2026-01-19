package es.cursojava.spring.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // LE ESTA DICIENDO QUE NO ES UN SINGLETON, VA A CREAR NUEVOS OBJETOS DE AQUI
public class PrototypeBean {
	public PrototypeBean() {
		System.out.println("CREADO PrototypeBean: " + this);
	}
}
