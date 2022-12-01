import java.util.ArrayList;
import java.util.List;

public abstract class Sucursal {
	List<RecursoHumano> listaPersonal = new ArrayList<>();
	
	String nombre;
	String colonia;
	RecursoHumano emp;
	
	public Sucursal(String nombre, String colonia, RecursoHumano emp) {
		this.nombre = nombre;
		this.colonia = colonia;
		this.emp = emp;
	}
	
	
	public List<RecursoHumano> getListaPersonal() {
		return listaPersonal;
	}


	public String getNombre() {
		return nombre;
	}


	public String getColonia() {
		return colonia;
	}

	void asignar(RecursoHumano personal) {
		listaPersonal.add(personal);
	}
	void liberar(RecursoHumano personal) {
		listaPersonal.remove(personal);
	}
	void mostrarListaEmpleados() {
		System.out.println("Empleados Sucursal" + getNombre()+ ":");
		for(RecursoHumano personal : listaPersonal) {
			System.out.println(personal.nombre+" "+personal.aPaterno+" "+personal.aMaterno + " "+personal.actividad);
		}
	}
}
