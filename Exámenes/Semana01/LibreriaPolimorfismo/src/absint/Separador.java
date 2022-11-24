package absint;

public abstract class Separador implements Producto{

    private String nombre;
    private double longitud;
    private double precioCompra;
    private double precioVenta;


    public Separador(String nombre, double longitud, double precioCompra) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.precioCompra = precioCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    @Override
    public String toString(){
        return "Nombre del :"+this.getClass().getSimpleName()+" "+ getNombre()+ " \n" +
                "Longitud: " +getLongitud()+"\n";
    }
}
