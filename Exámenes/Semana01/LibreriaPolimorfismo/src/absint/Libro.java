package absint;

public abstract class Libro implements Producto{
        private String titulo;
        private String autor;
        private int paginas;
        private double precioCompra;
      //Constructor para los separadores, implicitamente se esta creando un producto
        public Libro(String titulo,String autor,int paginas,double precioCompra){
            this.titulo = titulo;
            this.autor = autor;
            this.paginas = paginas;
            this.precioCompra = precioCompra;
        }
        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public int getPaginas() {
            return paginas;
        }

        public void setPaginas(int paginas) {
            this.paginas = paginas;
        }

        public double getPrecioCompra() {
            return precioCompra;
        }

        public void setPrecioCompra(double precioCompra) {
            this.precioCompra = precioCompra;
        }
        /*
         * Sobreescritura del método getPrecioVenta (Interfaz) donde se obtiene
         * el dato calculado precio de venta en base al precio de compra y el
         * porcentaje de ganancia obtenido de cada subclase
         * */
        @Override
        public double getPrecioVenta(double porcentajeGanancia){
            return ((getPrecioCompra()* porcentajeGanancia)+getPrecioCompra());
        }
        //Sobreescritura de método toString para dar salida a console con formato requerido
        @Override
        public String toString(){
            return "Nombre del " +this.getClass().getSimpleName()+ ": " +getTitulo() + "\n" +
                    "Autor: " +getAutor() + "\n" +
                    "No.Pagínas: " +getPaginas() + "\n";
        }
    }


