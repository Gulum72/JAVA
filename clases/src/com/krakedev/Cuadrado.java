package com.krakedev;

public class Cuadrado {
	private int lado;
	
	
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public double calcularArea() {
		double resultado;
		resultado=lado*2;
		return resultado;
	}
	
	public double calcularPerimetro() {
		double resultado;
		resultado=lado*4;
		return resultado;
	}
	
	public Cuadrado(int lado) {
		this.lado=lado;
	}

}
