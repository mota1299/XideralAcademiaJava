package abstracta;
    public class Novela extends Libro{
        public Novela(String titulo,String autor,int paginas,double precioCompra){
            super(titulo,autor,paginas,precioCompra);
        }
        @Override
        public void venta(){
            System.out.print("El precio de la Novela: "+getTitulo()+" para venta al público es: " + getPrecioVenta());
        }

    }

