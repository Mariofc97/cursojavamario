package es.cursojava.hibernate.ejercicios.ejercicioEmpleados.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.cursojava.hibernate.ejercicios.ejercicioEmpleados.dao.EmpleadoDao;
import es.cursojava.hibernate.ejercicios.ejercicioEmpleados.dao.EmpleadoDaoImpl;
import es.cursojava.hibernate.ejercicios.ejercicioEmpleados.dto.EmpleadoDto;
import es.cursojava.hibernate.ejercicios.ejercicioEmpleados.entities.Empleado;
import es.cursojava.hibernate.ejercicios.ejercicioEmpleados.exceptions.BusinessException;

public class EmpleadoServiceImpl implements EmpleadoService {

	private EmpleadoDao empleadoDao;
	// listamos los departamentos validos para posterior validacion
	private static final List<String> DEPARTAMENTOS_VALIDOS = Arrays.asList("IT","RRHH","VENTAS","FINANZAS"); 
	
	// Usamos implementacion concreta con sesion y transaccion en el constructor
	public EmpleadoServiceImpl() {
		this.empleadoDao = new EmpleadoDaoImpl();
	}

	// Constructor alternativo para inyectar el DAO a modo de test
	public EmpleadoServiceImpl(EmpleadoDao empleadoDao) {
		super();
		this.empleadoDao = empleadoDao;
	}

	@Override
	public EmpleadoDto altaEmpleado(EmpleadoDto empleadoDto) throws BusinessException {
		// TODO Auto-generated method stub
		//1 validaciones de campos obligatorios
		validarEmpleadoDtoParaAlta(empleadoDto);
		//2 validar NIF unico
		if(empleadoDao.buscarPorNif(empleadoDto.getNif()) != null) {
			throw new BusinessException("Ya existe un empleado con NIF " + empleadoDto.getNif());
		}
		//3 convertir DTO -> Entity de empleado directamente
		Empleado empleado = toEntity(empleadoDto);
		//4 guardar
		empleadoDao.guardar(empleado);
		//5 confirmar cambios(usando mi commit del DAO, con un casteo)
		if (empleadoDao instanceof EmpleadoDaoImpl) {
			((EmpleadoDaoImpl) empleadoDao).commitTransaction();
		}
		System.out.println("El empleado " + empleadoDto.getNombre() + " se ha dado de alta correctamente en la BD");
		//6 devolver DTO con los datos (incluyendo id generado)
		return toDto(empleado);
	}

	@Override
	public EmpleadoDto actualizarSalario(String nif, BigDecimal nuevoSalario) throws BusinessException {
		// TODO Auto-generated method stub
		if(nif == null || nif.trim().isEmpty()) {
			throw new BusinessException("El NIF es obligatorio para actualizar el salario");
		};
		
		validarSalario(nuevoSalario);
		
		Empleado empleado = empleadoDao.buscarPorNif(nif);
		if (empleado ==  null) {
			throw new BusinessException("No existe ningún empleado con NIF " + nif);
		}
		
		empleado.setSalario(nuevoSalario);
		
		empleadoDao.guardar(empleado);
		
		if (empleadoDao instanceof EmpleadoDaoImpl) {
			((EmpleadoDaoImpl) empleadoDao).commitTransaction();
		}
		
		System.out.println("Se ha actualizado el salario del trabajos con nif " + nif + " a " + nuevoSalario + " en la base de datos correctamente");
	
		return toDto(empleado);
	}

	@Override
	public EmpleadoDto buscarPorNif(String nif) throws BusinessException {
		// TODO Auto-generated method stub
		if(nif == null || nif.trim().isEmpty()) {
			throw new BusinessException("El nif solicitado no existe en la BD");
		}
		
		Empleado empleado = empleadoDao.buscarPorNif(nif);
		if (empleado == null) {
			throw new BusinessException("No existe empleado con nif " + nif + " en la BD");
		}
		return toDto(empleado);
	}

	@Override
	public List<EmpleadoDto> listarPorDepartamento(String departamento) throws BusinessException {
		// TODO Auto-generated method stub
		validarDepartamento(departamento);
		
		List<Empleado> empleados = empleadoDao.buscarPorDepartamento(departamento);
		List<EmpleadoDto> empleadosDto = new ArrayList<>();
		
		for (Empleado e : empleados) {
			empleadosDto.add(toDto(e));
		}
		
		return empleadosDto;
	}

	@Override
	public List<EmpleadoDto> listarTodos() {
		// TODO Auto-generated method stub
		List<Empleado> empleados = empleadoDao.buscarTodos();
		List<EmpleadoDto> empleadosDto = new ArrayList<>();
		
		for (Empleado e: empleados) {
			empleadosDto.add(toDto(e));
		}
		return empleadosDto;
	}
	
	// METODOS PRIVADOS DE VALIDACIÓN
	
	private void validarDepartamento(String departamento) throws BusinessException {
		if(departamento == null || departamento.trim().isEmpty()) {
			throw new BusinessException("El departamento es obligatorio");
		}
		
		if(!DEPARTAMENTOS_VALIDOS.contains(departamento)) {
			throw new BusinessException("El departamento " + departamento + " no es valido");
		}
	}
	
	private void validarSalario(BigDecimal salario) throws BusinessException {
		if (salario == null) {
			throw new BusinessException("El salario no puede ser nulo");
		}
		
		if (salario.compareTo(BigDecimal.ZERO) < 0) {
			throw new BusinessException("El salario no puede ser menor de 0");
		}
		
		BigDecimal salarioMinimo = new BigDecimal("1000");
		if (salario.compareTo(salarioMinimo) < 0) {
			throw new BusinessException("El salario debe ser mayor o igual que 1000 euros");
		}
	}
	
	private void validarEmpleadoDtoParaAlta(EmpleadoDto dto) throws BusinessException {
		//NIF Obligatorio
		if(dto.getNif() == null || dto.getNif().trim().isEmpty()) {
			throw new BusinessException("El nif del empleado es obligatorio");
		}
		
		if(dto.getNombre() == null || dto.getNombre().trim().isEmpty()) {
			throw new BusinessException("El nombre del empleado es obligatorio");
		}
		
		// validar departamento al dar de alta al empleado
		validarDepartamento(dto.getDepartamento());
		
		// validar salario al dar de alta al empleado
		validarSalario(dto.getSalario());
	}
	
	// conversion Entity a DTO
	private EmpleadoDto toDto(Empleado empleado) {
		if (empleado == null) {
			return null;
		}
		
		EmpleadoDto dto = new EmpleadoDto();
        dto.setNif(empleado.getNif());
        dto.setNombre(empleado.getNombre());
        dto.setDepartamento(empleado.getDepartamento());
        dto.setSalario(empleado.getSalario());
        
        return dto;
	}
	
	private Empleado toEntity(EmpleadoDto dto) {
		if (dto == null) {
			return null;
		}
		
		Empleado empleado = new Empleado();
		empleado.setNif(dto.getNif());
		empleado.setNombre(dto.getNombre());
		empleado.setDepartamento(dto.getDepartamento());
		empleado.setSalario(dto.getSalario());
		
		return empleado;
	}
	
}

