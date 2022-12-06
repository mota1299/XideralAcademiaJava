package com.curso.composite;


public class Suma implements Expresion {
	
	Expresion left;
	Expresion right;
	
	public Suma(Expresion left, Expresion right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public double getValor() {
		return left.getValor() + right.getValor();
	}

}