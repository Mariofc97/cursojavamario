package es.cursojava.hibernate.ejercicios.ejercicio2.capaPresentacion;

import java.math.BigDecimal;
import java.util.List;

import es.cursojava.hibernate.ejercicios.ejercicioEmpleados.dto.EmpleadoDto;
import es.cursojava.hibernate.ejercicios.ejercicioEmpleados.exceptions.BusinessException;
import es.cursojava.hibernate.ejercicios.ejercicioEmpleados.service.EmpleadoService;
import es.cursojava.hibernate.ejercicios.ejercicioEmpleados.service.EmpleadoServiceImpl;
import utils.Utilidades;

public class AppEmpleadosMain {

    private static EmpleadoService empleadoService = new EmpleadoServiceImpl();

    public static void main(String[] args) {

        int opcion;
        do {
            mostrarMenu();
            opcion = Utilidades.pideDatoNumerico("Selecciona una opción: ");

            switch (opcion) {
                case 1:
                    altaEmpleado();
                    break;
                case 2:
                    listarTodos();
                    break;
                case 3:
                    buscarPorNif();
                    break;
                case 4:
                    actualizarSalario();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n===== GESTIÓN DE EMPLEADOS =====");
        System.out.println("1. Alta empleado");
        System.out.println("2. Listar todos");
        System.out.println("3. Buscar por NIF");
        System.out.println("4. Actualizar salario");
        System.out.println("0. Salir");
    }

    // --------- OPCIÓN 1: ALTA EMPLEADO ---------
    private static void altaEmpleado() {
        System.out.println("\n--- Alta de empleado ---");

        String nif = Utilidades.pideDatoCadena("NIF: ");
        String nombre = Utilidades.pideDatoCadena("Nombre: ");
        String departamento = Utilidades.pideDatoCadena("Departamento: (IT,RRHH,VENTAS,FINANZAS) ");
        BigDecimal salario = Utilidades.pideDatoBigDecimal("Salario: ");

        EmpleadoDto dto = new EmpleadoDto();
        dto.setNif(nif);
        dto.setNombre(nombre);
        dto.setDepartamento(departamento);
        dto.setSalario(salario);

        try {
            EmpleadoDto creado = empleadoService.altaEmpleado(dto);
            System.out.println("Empleado creado con exito ");
        } catch (BusinessException e) {
            System.out.println("ERROR de negocio: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("ERROR inesperado: " + e.getMessage());
        }
    }

    // --------- OPCIÓN 2: LISTAR TODOS ---------
    private static void listarTodos() {
        System.out.println("\n--- Listado de empleados ---");
        List<EmpleadoDto> empleados = empleadoService.listarTodos();

        if (empleados.isEmpty()) {
            System.out.println("No hay empleados.");
            return;
        }

        for (EmpleadoDto e : empleados) {
            System.out.println(
                    e.getNif() + " - " +
                    e.getNombre() + " - " +
                    e.getDepartamento() + " - " +
                    e.getSalario()
            );
        }
    }

    // --------- OPCIÓN 3: BUSCAR POR NIF ---------
    private static void buscarPorNif() {
        System.out.println("\n--- Búsqueda de empleado por NIF ---");
        String nif = Utilidades.pideDatoCadena("Introduce NIF: ");

        try {
            EmpleadoDto dto = empleadoService.buscarPorNif(nif);
            System.out.println("Empleado encontrado:");
            System.out.println(
                    dto.getNif() + " - " +
                    dto.getNombre() + " - " +
                    dto.getDepartamento() + " - " +
                    dto.getSalario()
            );
        } catch (BusinessException e) {
            System.out.println("ERROR de negocio: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("ERROR inesperado: " + e.getMessage());
        }
    }

    // --------- OPCIÓN 4: ACTUALIZAR SALARIO ---------
    private static void actualizarSalario() {
        System.out.println("\n--- Actualizar salario ---");
        String nif = Utilidades.pideDatoCadena("Introduce NIF: ");

        BigDecimal nuevoSalario = Utilidades.pideDatoBigDecimal("Nuevo salario: ");

        try {
            EmpleadoDto dto = empleadoService.actualizarSalario(nif, nuevoSalario);
            System.out.println("Salario actualizado. Datos actuales:");
            System.out.println(
                    dto.getNif() + " - " +
                    dto.getNombre() + " - " +
                    dto.getDepartamento() + " - " +
                    dto.getSalario()
            );
        } catch (BusinessException e) {
            System.out.println("ERROR de negocio: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("ERROR inesperado: " + e.getMessage());
        }
    }

}
