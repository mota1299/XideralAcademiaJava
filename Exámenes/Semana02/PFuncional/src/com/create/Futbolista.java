package com.create;
public class Futbolista {
	
	private String nombre;
	private int edad;
	private TipoPosicion  posicion;
	private int media;
	private String pais;
	
	public Futbolista(String nombre, int edad, TipoPosicion posicion,int media,String pais) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
		this.media = media;
		this.pais = pais;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public TipoPosicion getPosicion() {
		return posicion;
	}

	public void setPosicion(TipoPosicion posicion) {
		this.posicion = posicion;
	}

	public int getMedia() {
		return media;
	}

	public void setMedia(int media) {
		this.media = media;
	}
	

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Futbolista [nombre=" + nombre + ", edad=" + edad + ", Posición=" + posicion + ", Media="+media+" País de origen= "+pais + "]";
	}
	
}