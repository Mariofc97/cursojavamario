package es.cursojava.hibernate.ejercicios.ejercicioEmpleadosRepaso.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import es.cursojava.hibernate.ejercicios.ejercicioEmpleadosRepaso.dao.EmpleadoDao;
import es.cursojava.hibernate.ejercicios.ejercicioEmpleadosRepaso.dao.impl.EmpleadoDaoImpl;
import es.cursojava.hibernate.ejercicios.ejercicioEmpleadosRepaso.dto.EmpleadoDto;
import es.cursojava.hibernate.ejercicios.ejercicioEmpleadosRepaso.entities.Empleado;
import es.cursojava.hibernate.ejercicios.ejercicioEmpleadosRepaso.exceptions.BusinessException;
import es.cursojava.hibernate.ejercicios.ejercicioEmpleadosRepaso.service.EmpleadoService;

public class EmpleadoServiceImpl implements EmpleadoService {
	
	private final EmpleadoDao empleadoDao;
	
	

	public EmpleadoServiceImpl() {
		this.empleadoDao = new EmpleadoDaoImpl();
	}

	@Override
	public void altaEmpleado(EmpleadoDto empleadoDto) {
		// TODO Auto-generated method stub
		if(empleadoDto.getNif() == null || empleadoDto.getNif().trim().isEmpty()) {
			throw new BusinessException("El NIF es obligatorio");
		}
		if(empleadoDto.getNombre() == null || empleadoDto.getNombre().trim().isEmpty()) {
			throw new BusinessException("El nombre es obligatorio");
		}
		if(empleadoDto.getDepartamento() == null || empleadoDto.getDepartamento().trim().isEmpty()) {
			throw new BusinessException("El departamento es obligatorio");
		}
		
		if(empleadoDto.getSalario() == null || empleadoDto.getSalario().compareTo(BigDecimal.ZERO) < 0) {
			throw new BusinessException("El salario debe ser mayor o igual a 0");
		}
		
		Empleado existing = empleadoDao.buscarPorNif(empleadoDto.getNif());
		
		if(existing != null) {
			throw new BusinessException("Ya existe un empleado con el NIF: " + empleadoDto.getNif());
		}
		
		Empleado empleado = new Empleado();
		empleado.setNif(empleadoDto.getNif());
		empleado.setNombre(empleadoDto.getNombre());
		empleado.setDepartamento(empleadoDto.getDepartamento());
		empleado.setSalario(empleadoDto.getSalario());
		
		empleadoDao.guardar(empleado);
		empleadoDao.commitTransaction();
		
		empleadoDto.setId(empleado.getId());
	}

	@Override
	public EmpleadoDto actualizarSalario(String nif, BigDecimal nuevoSalario) {
		// TODO Auto-generated method stub
		if(nif == null || nif.trim().isEmpty()) {
			throw new BusinessException("El NIF es obligatorio");
		}
		if(nuevoSalario == null || nuevoSalario.compareTo(BigDecimal.ZERO) < 0) {
			throw new BusinessException("El NIF es obligatorio");
		}
		
		Empleado empleado = empleadoDao.buscarPorNif(nif);
		if(empleado == null) {
			throw new BusinessException("No se encontro empleado con NIF: " + nif);
		}
		
		empleado.setSalario(nuevoSalario);
		empleadoDao.guardar(empleado);
		empleadoDao.commitTransaction();
		
		return mapToDto(empleado);
		
	}

	@Override
	public EmpleadoDto buscarPorNif(String nif) {
		// TODO Auto-generated method stub
		if(nif == null || nif.trim().isEmpty()) {
			throw new BusinessException("El NIF es obligatorio para buscar");
		}
		Empleado empleado = empleadoDao.buscarPorNif(nif);
		if(empleado == null) {
			return null;
		}
		// no podemos pasar un entity como si nada tenemos que transferirlo como un dto
		return mapToDto(empleado);
	}

	@Override
	public List<EmpleadoDto> listarPorDepartamento(String departamento) {
		// TODO Auto-generated method stub
		if(departamento == null || departamento.trim().isEmpty()) {
			throw new BusinessException("El departamento es obligatorio para listar.");
		}
		List<Empleado> empleados = empleadoDao.buscarPorDepartamento(departamento);
		
		return mapToDtoList(empleados);
	}

	@Override
	public List<EmpleadoDto> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private EmpleadoDto mapToDto(Empleado entity) {
		return new EmpleadoDto(
                entity.getId(),
                entity.getNif(),
                entity.getNombre(),
                entity.getDepartamento(),
                entity.getSalario());
	}
	
	private List<EmpleadoDto> mapToDtoList(List<Empleado> entities){
		List<EmpleadoDto> dtos = new ArrayList<>();
		for (Empleado entity: entities) {
			dtos.add(mapToDto(entity));
		}
		return dtos;
	}
	
	

}
