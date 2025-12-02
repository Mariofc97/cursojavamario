package es.cursojava.hibernate.ejercicios.ejercicioEmpleados.service;

import java.math.BigDecimal;
import java.util.List;

import es.cursojava.hibernate.ejercicios.ejercicioEmpleados.dto.EmpleadoDto;
import es.cursojava.hibernate.ejercicios.ejercicioEmpleados.exceptions.BusinessException;

public interface EmpleadoService {

	EmpleadoDto altaEmpleado(EmpleadoDto empleadoDto)  throws BusinessException;
	EmpleadoDto actualizarSalario (String nig, BigDecimal nuevoSalario) throws BusinessException;
	EmpleadoDto buscarPorNif(String nif) throws BusinessException;
	List<EmpleadoDto> listarPorDepartamento(String departamento) throws BusinessException;
	List<EmpleadoDto> listarTodos();
}