package absint;

public class SeparadorInfantil extends Separador{

    private double porcentajeGanancia = .10;
    public SeparadorInfantil(String nombre, double longitud, double precioCompra){
        super(nombre,longitud,precioCompra);
    }
    //Sobreescritura del método venta para dar salida de información y calcular la venta al público
    @Override
    public void venta(){
        System.out.print("El precio de: "+ this.getClass().getSimpleName()+" "+getNombre()+",para venta al público es: " + getPrecioVenta(porcentajeGanancia));
    }
}
