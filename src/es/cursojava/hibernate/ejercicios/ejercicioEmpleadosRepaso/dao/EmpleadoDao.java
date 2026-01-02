package es.cursojava.hibernate.ejercicios.ejercicioEmpleadosRepaso.dao;

import java.util.List;

import es.cursojava.hibernate.ejercicios.ejercicioEmpleadosRepaso.entities.Empleado;

public interface EmpleadoDao {

	void guardar(Empleado empleado);
	// crear o actulalizar
	Empleado buscarPorId(Long id);
	
	Empleado buscarPorNif(String nif);
	
	List<Empleado> buscarTodos();
	
	List<Empleado> buscarPorDepartamento(String departamento);
	
	void commitTransaction();

	void rollbackTransaction();
	
	
}
