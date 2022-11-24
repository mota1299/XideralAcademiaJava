package absint;
import java.util.Random;
import java.util.Scanner;

public class Libreria {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String detalle;
        boolean ejecutarMostrarDetalle = false;
        Producto l = getProductos();
        l.venta();
        System.out.println();

        do {
            System.out.println("¿Desea obtener más detalles del libro? Y/N");
            detalle = sr.nextLine().toUpperCase();
            if(detalle.equals("Y") || detalle.equals("N")) {ejecutarMostrarDetalle = true;}
            else {System.out.println("Escribe una de las opciones indicadas");}
        }while (!ejecutarMostrarDetalle);
        mostrarDetalle(detalle,l);
    }

    static Producto getProductos(){
          Producto[] listaProducto = new Producto[9];
        listaProducto[0] = new Novela("Orgullo y prejuicio ","Jane Austen",150,130.72);
        listaProducto[1] = new Novela("El rojo y el negro","Stendhal",210,315.05);
        listaProducto[2] = new Cuento("Moby Dick","Herman Melville",350,451.10);
        listaProducto[3] = new Cuento("Cenicienta","Charles Perrault",32,157.30);
        listaProducto[4] = new Cuento("La cigarra y la hormiga","Felix María de Samaniego",37,78.50);
        listaProducto[5] = new SeparadorInfantil("Separador Batman",15.0,10.0);
        listaProducto[6] = new SeparadorInfantil("Separador Cenicienta",16.0,12.50);
        listaProducto[7] = new SeparadorFormal("Separador negro",17.0,6.0);
        listaProducto[8] = new SeparadorFormal("Separador azul marino",17.0,6.0);
        return listaProducto[new Random().nextInt(listaProducto.length)];
        //return listaProducto[5];
    }
    static void mostrarDetalle(String detalle, Producto l){
        if (detalle.equals("Y")) {
            System.out.println(l);
            System.out.println("Fin del programa");
        } else if(detalle.equals("N")){
            System.out.println("Fin del programa");
        }
    }

}
