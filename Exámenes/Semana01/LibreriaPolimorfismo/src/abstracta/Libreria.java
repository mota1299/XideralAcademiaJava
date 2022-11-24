package abstracta;
import java.util.Random;
import java.util.Scanner;

public class Libreria {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String detalle;
        boolean ejecutarMostrarDetalle = false;
        Libro l = libros();
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
    static Libro libros(){
        Libro[] listaLibros = new Libro[5];
        listaLibros[0] = new Novela("Orgullo y prejuicio ","Jane Austen",150,130.72);
        listaLibros[1] = new Novela("El rojo y el negro","Stendhal",210,315.05);
        listaLibros[2] = new Cuento("Moby Dick","Herman Melville",350,451.10);
        listaLibros[3] = new Cuento("Cenicienta","Charles Perrault",32,157.30);
        listaLibros[4] = new Cuento("La cigarra y la hormiga","Felix María de Samaniego",37,78.50);
        return listaLibros[new Random().nextInt(listaLibros.length)];
    }
    static void mostrarDetalle(String detalle, Libro l){
        if (detalle.equals("Y")) {
            System.out.println(l);
            System.out.println("Fin del programa");
        } else if(detalle.equals("N")){
            System.out.println("Fin del programa");
        }
    }

}
