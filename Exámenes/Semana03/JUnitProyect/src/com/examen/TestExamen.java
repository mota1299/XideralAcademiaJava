package com.examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestExamen {
	//Prueba JUnit para la creación correcta de un empleado
	@DisplayName("Validar Creación del Empleado")
	@Test
	void testEmpleado() {
		String nombre = "Jesús";
		String puesto = "Gerente";
		double sueldoHora = 100;
		int horasTrabajo = 8;
		Empleado e = new Empleado(nombre,puesto,sueldoHora,horasTrabajo);
		assertEquals("Jesús",e.getNombre());
		assertEquals("Gerente",e.getPuesto());
		assertEquals(100,e.getSueldoHora());
		assertEquals(8,e.getHorasTrabajo());
	}
	//Prueba JUnit para el cálculo correcto del sueldo del empleado
	@DisplayName("Calcular sueldo del Empleado")
	@Test
	void testSueldoEmpleado() {
		double sueldoHora = 100;
		int horasTrabajo = 7;
		double salario = sueldoHora * horasTrabajo;
		Empleado e = new Empleado("José","Cajero",sueldoHora,horasTrabajo);
		assertEquals(salario,e.calculoSalario());
	}
	//Prueba JUnit para la validación de trabajo extra por empleado
	@Test
	@DisplayName("Valida si el trabajador hizo horas extras")
	void testTrabajoHorasExtras() {
		int horasTrabajo = 10;
		boolean trabajoExtra = horasTrabajo <= 8 ? false : true;
		Empleado e = new Empleado ("José","Cajero",100,horasTrabajo);
		assertEquals(trabajoExtra,e.trabajoExtra());
	}
	//Prueba JUnit para el cálculo del pago de horas extras
	@Test
	@DisplayName("Validar Pago de horas extra")
	void testPagoHorasExtra() {
		int horasExtra = 0;
		double pagoHorasExtra = 0;
		Empleado e = new Empleado("José","Cajero",100,10);
		if(e.trabajoExtra())
		horasExtra = e.getHorasTrabajo() - 8;
		pagoHorasExtra = horasExtra * (e.getSueldoHora() * 2);
		assertEquals(pagoHorasExtra,e.pagoHorasExtra());
	}
	//Prueba JUnit para valida que los nombres no contengan números
	@DisplayName("Validar Nombres")
	@Test
	void testValidaNombre() {
		Empleado e = new Empleado("José","Cajero",100,10);
		boolean cN = e.getNombre().matches(".*[0-9].*");
		assertEquals(cN,e.validaNombre());
	}
	

}
