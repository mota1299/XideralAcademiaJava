package absint;
//Interfaz Producto, define el comportamiento de las clases que implementen la interface
/*
 * Independientemente del tipo de producto que sean tendrán el comportamiento aquí establecido
 * */
public interface Producto {
    void venta();
    double getPrecioVenta(double porcentajeGanancia);
}
