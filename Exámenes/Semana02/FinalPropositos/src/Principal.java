
public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mochila m1 = new Cangurera(150.0,0.30);
		final Mochila m2 = new Antirrobo(350.0,0.30);
		
		double m1Precio = m1.getPrecioVenta();
		System.out.println("Precio de m1 " +m1Precio);
		
		double m2Precio = m2.getPrecioVenta();
		System.out.println("Precio de m2 " +m2Precio);
		//m2 = new Cangurera(130,0.10);// no se puede cambiar de referencia 
		
		
		m1 = new Antirrobo(500,20);
		m1Precio = m1.getPrecioVenta();
		System.out.println("Precio de m1 despues de cambiar de referencia: " +m1Precio);
		
		System.out.println("//////////////////////////////////");
		final StringBuilder sb = new StringBuilder("Hola");
		sb.append(" Mundo");
		//sb = sb.append(" Mundo");
		System.out.println(sb);
	}

}
