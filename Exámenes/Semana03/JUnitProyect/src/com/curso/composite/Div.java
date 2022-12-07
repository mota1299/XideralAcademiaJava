package com.curso.composite;

public class Div implements Expresion {

	Expresion left;
	Expresion right;
	
	public Div(Expresion left, Expresion right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public double getValor() {
		return left.getValor() / right.getValor();
	}


}