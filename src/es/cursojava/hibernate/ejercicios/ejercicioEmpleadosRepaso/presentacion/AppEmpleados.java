package es.cursojava.hibernate.ejercicios.ejercicioEmpleadosRepaso.presentacion;

import java.math.BigDecimal;
import java.util.List;

import es.cursojava.hibernate.ejercicios.ejercicioEmpleadosRepaso.dto.EmpleadoDto;
import es.cursojava.hibernate.ejercicios.ejercicioEmpleadosRepaso.exceptions.BusinessException;
import es.cursojava.hibernate.ejercicios.ejercicioEmpleadosRepaso.service.EmpleadoService;
import es.cursojava.hibernate.ejercicios.ejercicioEmpleadosRepaso.service.impl.EmpleadoServiceImpl;

public class AppEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--- INICIO DE LA APP DE GESTIÓN DE EMPLEADOS ---");
		
		EmpleadoService servicio = new EmpleadoServiceImpl();
		
		System.out.println("--- ALTA DE EMPLEADOS ---");
//        crearEmpleado(servicio, "11111111A", "Juan Perez", "IT", new BigDecimal("2500.00"));
        crearEmpleado(servicio, "22222222B", "Maria Lopez", "RRHH", new BigDecimal("2000.00"));
        crearEmpleado(servicio, "33333333C", "Carlos Ruiz", "IT", new BigDecimal("2800.00"));

//		System.out.println("Listado por departamentos: ");
//		List<EmpleadoDto> itEmployees = servicio.listarPorDepartamento("IT");
//		for (EmpleadoDto empleadoDto : itEmployees) {
//			System.out.println(empleadoDto);
//		}
//		
//		System.out.println("Busqueda por nif: ");
//		EmpleadoDto encontrado = servicio.buscarPorNif("11111111A");
//		System.out.println("Encontrado: " + encontrado);
//		
//		System.out.println("Actualización de salario: ");
//		try {
//			System.out.println("Actualizando salario de 11111111A a 3000");
//			EmpleadoDto actualizado = servicio.actualizarSalario("11111111A", new BigDecimal(3000));
//			System.out.println("Empleado actualizado: " + actualizado);
//		}catch(BusinessException e) {
//			System.err.println("Error al actualizar el salario deseado " + e.getMessage() );
//		}
	}
	
	private static void crearEmpleado(EmpleadoService servicio, String nif, String nombre, String dept, BigDecimal salario) {
		
		try {
			EmpleadoDto nuevoEmpleado = new EmpleadoDto(nif, nombre, dept, salario);
			servicio.altaEmpleado(nuevoEmpleado);
			System.out.println("Empleado creado: " + nuevoEmpleado);
		}catch(BusinessException e) {
			System.err.println("Error de negocio: " + e.getMessage());
		} catch(Exception e) {
			System.err.println("Error inesperado: " + e.getMessage());
		}
	}

}
