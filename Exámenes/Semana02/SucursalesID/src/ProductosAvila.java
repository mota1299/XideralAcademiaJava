import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/*
 * Juan Jesús Ávila Mota 
 * 1/12/2022
 * Programa que utiliza inyección de dependencias para asignar empleados a sucursales
 * */
public class ProductosAvila {

	public static void main(String[] args) throws InvalidoException  {
		//Creando Instantancias recurso humano
		RecursoHumano emp1 = new Gerente("Juan","Avila","Mota");
		RecursoHumano emp7 = new Gerente("Edgar","Sánchez","Franco");
		RecursoHumano emp2 = new Empleado("Juan","López","Ruiz",TipoActividad.ALMACEN);
		RecursoHumano emp3 = new Empleado("Ricardo","Perez","Bedolla",TipoActividad.CAJA);
		RecursoHumano emp4 = new Empleado("Erika","González","Vazquez",TipoActividad.VENTAS);
		RecursoHumano emp5 = new Empleado("Monserrat","Torres","Romero",TipoActividad.LIMPIEZA);
		RecursoHumano emp6 = new Empleado("Luis","Allende","Trejo",TipoActividad.VENTAS);
		RecursoHumano emp8 = new Empleado("Joel","Olvera","Trejo",TipoActividad.VENTAS);
		//Inyectando empleados a las sucursales
		Sucursal s1 = new PachucaSucursal("Angéles","San Cayetano",emp1);
		Sucursal s2 = new TolucaSucursal("Esperanza","La Floresta",emp1);
		s1.asignar(emp1);
		s1.asignar(emp2);
		s1.asignar(emp3);
		s1.asignar(emp8);
		//s1.mostrarListaEmpleados();
		
		
		s2.asignar(emp7);
		s2.asignar(emp4);
		s2.asignar(emp5);
		s2.asignar(emp6);
		//s2.mostrarListaEmpleados();
		
		int numeroSucursal = 0;
		System.out.println("Lista de empleados: \n"
				+ "1.- Sucursal Angelés \n"
				+ "2.- Sucursal Esperanza");
		//Ejecución con multicatch
		try(Scanner sr = new Scanner(System.in)){
			if(sr.hasNextInt()) { 
			numeroSucursal = sr.nextInt();
			validar(numeroSucursal);
			switch(numeroSucursal) {
			case 1 : s1.mostrarListaEmpleados();
			break;
			case 2 : s2.mostrarListaEmpleados();
			break;
			}
			}
		}catch(NumberFormatException |NoSuchElementException |InvalidoException e) {
			//e.printStackTrace();
			System.out.println("Dato Invalido");
			main(args);
		}
		
		/*//Ejecución con try with resources
		try(Scanner sr = new Scanner(System.in)){
		if(sr.hasNextInt()) { 
		numeroSucursal = sr.nextInt();
		validar(numeroSucursal);
		switch(numeroSucursal) {
		case 1 : s1.mostrarListaEmpleados();
		break;
		case 2 : s2.mostrarListaEmpleados();
		break;
		}
		}
	}*/
		//En que trabaja cada empleado
		//emp1.trabaja();
		System.out.println("Fin del programa");
		System.exit(0);
		
	}
	//Método que válida que la sucursal elegida exista
	private static void validar(int numeroSucursal) throws InvalidoException{
		if(numeroSucursal > 2 || numeroSucursal <= 0 ) {
			throw new InvalidoException("La sucursal no existe");
		}
		
	}
}
