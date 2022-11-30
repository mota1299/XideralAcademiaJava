
public class Mochila /*extends Producto*/ {
	
	double precio;
	double porcentajeGanancia;
	final double impuesto = 0.16;
		public Mochila(double precio, double porcentajeGanancia) {
		this.precio = precio;
		this.porcentajeGanancia = porcentajeGanancia;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getPorcentajeGanancia() {
		return porcentajeGanancia;
	}
	public void setPorcentajeGanancia(double porcentajeGanancia) {
		this.porcentajeGanancia = porcentajeGanancia;
	}		
	public double getImpuesto() {
		return impuesto;
	}
	/*public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}*/
	
	
	public final double getPrecioVenta() {
		//impuesto = 16.0;
		double pSinImpuesto = ((precio*porcentajeGanancia) + precio);
		return  (pSinImpuesto * impuesto) + pSinImpuesto;
	}
}
