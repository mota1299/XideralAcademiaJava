/*
 * Juan Jesús Ávila Mota 
 * 1/12/2022
 * Programa que utiliza expresiones lambda para obtener información de objetos futbolista
 * */
package com.create;

import java.util.*;

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
		
	
		System.out.println("*** Media Menor a 90***");
		mostrar(listaFutbolista,fut -> fut.getMedia() < 90);
		System.out.println("*** Edad Mayor a 30***");
		mostrar(listaFutbolista,fut -> fut.getEdad() > 30);
		System.out.println("*** Futbolistas Argentinos***");
		mostrar(listaFutbolista,fut -> fut.getPais() == "Argentina");
		System.out.println("*** Futbolistas que no sean de Francia***");
		mostrar(listaFutbolista,fut -> fut.getPais() != "Francia");
	}
	
	static void mostrar(List<Futbolista> lista, 
			PredicadoFutbolista p ) {

		for(Futbolista fut :lista) {
			if (p.mostrar(fut)) //EJECUTA LA LAMBDA
				System.out.println(fut);
		}
		
	}

}