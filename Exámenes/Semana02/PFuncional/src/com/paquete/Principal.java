
/*
 * Juan Jesús Ávila Mota 
 * 1/12/2022
 * Programa que utiliza expresiones lambda para obtener información de objetos futbolista
 * */
package com.paquete;

import java.util.*;
import java.util.function.*;

import com.create.Futbolista;
import com.create.TipoPosicion;

public class Principal {

	public static void main(String[] args) {

		List<Futbolista> listaFutbolista = new ArrayList<>();
		listaFutbolista.add(new Futbolista("Mbappe",26,TipoPosicion.DELANTERO,95,"Francia"));
		listaFutbolista.add(new Futbolista ("Messi",34,TipoPosicion.DELANTERO,92,"Argentina"));
		listaFutbolista.add(new Futbolista ("Halaand",22,TipoPosicion.DELANTERO,96,"Noruega"));
		listaFutbolista.add(new Futbolista("DiMaria",36,TipoPosicion.DELANTERO,86,"Argentina"));
		listaFutbolista.add(new Futbolista("Benzema",34,TipoPosicion.DELANTERO,90,"Francia"));
		listaFutbolista.add(new Futbolista("VanDajik",29,TipoPosicion.DEFENSA,91,"Holanda"));
		listaFutbolista.add(new Futbolista("Ochoa",35,TipoPosicion.PORTERO,84,"Mexico"));
		listaFutbolista.add(new Futbolista("Lautaro",26,TipoPosicion.DELANTERO,91,"Argentina"));
		listaFutbolista.add(new Futbolista("DeBruyne",29,TipoPosicion.MEDIO,92,"Belgica"));
	
		Futbolista x1 = listaFutbolista.get((int)(Math.random()*8));
		System.out.println("*** Media Menor a 90 por jugador random***");
		Predicate<Futbolista> f1 = (x) -> x.getMedia() < 90;  
		boolean f0 = f1.test(x1);
		System.out.println("¿El futbolista: "+x1.getNombre() + " tiene media menor a 90?: " +f0);
		
		
		System.out.println("***Envía y recibe un Futbolista ***");
		Supplier<Futbolista> fut3 = () -> new Futbolista("Cesar Móntes",29,TipoPosicion.DEFENSA,91,"Mexico");
		Futbolista fut = fut3.get();
		System.out.println(fut);
        
		
		System.out.println("Jugadores y su media con consumer");
		listaFutbolista.forEach(x -> System.out.println(x.getNombre()+" Media: "+x.getMedia()));
		
		
		System.out.println("***Aumentar media a jugador***");
		Consumer<Integer> c2 = y -> System.out.println(fut.getNombre()+" "+(fut.getMedia()+y));
		c2.accept(9);
		
		
		System.out.println("*** Comparar media de jugadores ***");
		BinaryOperator<Futbolista> comparar = (x,y) -> (x.getMedia()>y.getMedia() ? x : y);
		Futbolista fMayor = comparar.apply(listaFutbolista.get(5), listaFutbolista.get(3));
		System.out.println("Tiene mayor media"+ fMayor.getNombre());
		
	}
	

}