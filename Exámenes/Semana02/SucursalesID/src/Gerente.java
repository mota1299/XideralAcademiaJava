
public class Gerente extends RecursoHumano {
	
	private static final TipoActividad actividad = TipoActividad.SUPERVISAR;
	
	//Constructor Gerente
	public Gerente(String nombre, String aPaterno, String aMaterno) {
		//Paso de parametros para constructor RecursoHumano
		super(nombre,aPaterno,aMaterno,actividad);
		// TODO Auto-generated constructor stub
	}


	@Override
	void trabaja() {
		System.out.println("Gerente " +getNombre() + " trabaja con la actividad: " + getActividad());
	}

}
