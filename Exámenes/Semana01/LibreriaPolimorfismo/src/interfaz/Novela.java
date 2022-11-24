package interfaz;

public class Novela implements Libro {
        private String titulo;
        private String autor;
        private  int paginas;
        double precioCompra;
        double porcentajeGanancia = 0.30;
        public Novela(String titulo, String autor, int paginas, double precioCompra){
            super();
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

    @Override
        public double getPrecioVenta(double precioCompra){
            return (precioCompra * porcentajeGanancia)+precioCompra;
        }
        @Override
        public void venta(){
            System.out.print("El precio de la Novela: "+getTitulo()+" para venta al público es: " + getPrecioVenta(this.precioCompra));
        }
        @Override
        public String toString(){
            return "Nombre del " +this.getClass().getSimpleName()+ ": " +getTitulo() + "\n" +
                    "Autor: " +getAutor() + "\n" +
                    "No.Pagínas: " +getPaginas() + "\n";
        }

    }

