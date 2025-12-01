package es.cursojava.hibernate.ejercicios.ejercicioEmpleados.dao;

import java.util.List;

import es.cursojava.hibernate.ejercicios.ejercicioEmpleados.entities.Empleado;

public interface EmpleadoDao {

	void guardar(Empleado empleado); // crear o actualizar empleado
	Empleado buscarPorId(Long id);
	Empleado buscarPorNif(String nif);
	List<Empleado> buscarPorDepartamento(String departamento);
	List<Empleado> buscarTodos();
}
