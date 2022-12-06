package com.curso.composite;

public class Constante implements Expresion {
	
	double valor;

	public Constante(double valor) {
		this.valor = valor;
	}

	@Override
	public double getValor() {
		return valor;
	}

}