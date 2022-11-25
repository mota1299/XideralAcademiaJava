package absint;

public class Cuento extends Libro{

    public Cuento(String titulo,String autor,int paginas,double precioCompra){
        super(titulo,autor,paginas,precioCompra);
    }

    public double getPorcentajeGanancia() {
        return porcentajeGanancia;
    }

    public void setPorcentajeGanancia(double porcentajeGanancia) {
        this.porcentajeGanancia = porcentajeGanancia;
    }
    private double porcentajeGanancia = .30;
    //Sobreescritura del método venta para dar salida de información y calcular la venta al público
    @Override
    public void venta(){
        System.out.print("El precio de: "+ this.getClass().getSimpleName()+" "+getTitulo()+",para venta al público es: " + getPrecioVenta(porcentajeGanancia));
    }
  
}

