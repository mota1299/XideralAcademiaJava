
public class Empleado extends RecursoHumano {

	//ConstructorEmpleado
	public Empleado(String nombre, String aPaterno, String aMaterno,TipoActividad actividad) {
		//Paso de parametros para constructor RecursoHumano
		super(nombre,aPaterno,aMaterno,actividad);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void trabaja() {
		System.out.println("Empleado " +getNombre()+ " trabaja con la actividad: " + getActividad());
	}

	
}
