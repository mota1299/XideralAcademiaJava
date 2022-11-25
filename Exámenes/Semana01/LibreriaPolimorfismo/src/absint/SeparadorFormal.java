package absint;

public class SeparadorFormal extends Separador{

    private double porcentajeGanancia = .10;
    public SeparadorFormal(String nombre, double longitud, double precioCompra){
        super(nombre,longitud,precioCompra);
    }
    @Override
    public void venta(){
        System.out.print("El precio de: "+ this.getClass().getSimpleName()+" "+getNombre()+",para venta al público es: " + getPrecioVenta(porcentajeGanancia));
    }
   /* @Override
    public double getPrecioVenta(double porcentajeGanancia) {
        return ((getPrecioCompra()* porcentajeGanancia)+getPrecioCompra());
    }*/
}
