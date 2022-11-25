/*
 * Examen Polimorfismo 
 * Autor: Juan Jesús Ávila Mota
 * Clase Principal
 * Proyecto que devuelve un producto random y muestra precio para venta al publico
 * Aplicando Polimorfismo con clase abstracta e interface
 * */
package absint;
import java.util.Random;
import java.util.Scanner;

public class Libreria {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String detalle;
        boolean ejecutarMostrarDetalle = false;
       //revise el producto retornado por el método getProductos()
        Producto l = getProductos();
       // Al producto que apunta la variable de referencia l ejecuta el método venta
        l.venta();
        System.out.println();
        /* Ejecuta si se desea obtener información mas detalla del producto en este caso la
  		   pregunta se realiza minímo una vez gracias al Do While y se valida que la respuesta 
  		   que de el usuario sea una de las dos esperadas
         */
        do {
            System.out.println("¿Desea obtener más detalles del producto? Y/N");
            detalle = sr.nextLine().toUpperCase();
            if(detalle.equals("Y") || detalle.equals("N")) {ejecutarMostrarDetalle = true;}
            else {System.out.println("Escribe una de las opciones indicadas");}
        }while (!ejecutarMostrarDetalle);
        mostrarDetalle(detalle,l);
    }
//Método que crea y almacena los objetos producto en un Array y devuelve un producto
    static Producto getProductos(){
          Producto[] listaProducto = new Producto[9];
          /*Se aplica polimorfismo -Un producto puede adoptar la forma de
           * Novela
           * Cuento
           * SeparadorInfantil
           * SeparadorFormal 
           */
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
    //Método que recibe la respuesta a la pregunta, si se desea obtener más detalles y el producto del que se desea obtener más detalles
    static void mostrarDetalle(String detalle, Producto l){
        if (detalle.equals("Y")) {
            System.out.println(l);
            System.out.println("Fin del programa");
            System.exit(0);
        } else if(detalle.equals("N")){
            System.out.println("Fin del programa");
            System.exit(0);
        }
    }

}
