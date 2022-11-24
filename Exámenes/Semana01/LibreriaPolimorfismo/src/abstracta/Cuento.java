package abstracta;
public class Cuento extends Libro{
    public Cuento(String titulo, String autor, int paginas, double precioCompra){
        super(titulo,autor,paginas,precioCompra);
    }
    @Override
    public void venta(){
        System.out.print("El precio del cuento: " +getTitulo()+" para venta al público es: " + getPrecioVenta());
    }

}
