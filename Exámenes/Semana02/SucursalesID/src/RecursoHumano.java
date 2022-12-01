
public abstract class RecursoHumano {

	String nombre;
	String aPaterno;
	String aMaterno;
	TipoActividad actividad;
	
	
	
	public RecursoHumano(String nombre, String aPaterno, String aMaterno,TipoActividad actividad) {
		this.nombre = nombre;
		this.aPaterno = aPaterno;
		this.aMaterno = aMaterno;
		this.actividad = actividad;
	}


	abstract void trabaja();

	

	public TipoActividad getActividad() {
		return actividad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getaPaterno() {
		return aPaterno;
	}


	public void setaPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}


	public String getaMaterno() {
		return aMaterno;
	}


	public void setaMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}
	
	
}
