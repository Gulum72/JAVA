package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado l1=new Cuadrado();
		Cuadrado l2=new Cuadrado();
		Cuadrado l3=new Cuadrado();

		double lado1;
		double lado2;
		double lado3;
		
		l1.lado=2;
		l2.lado=5;
		l3.lado=8;
		
		lado1=l1.calcularArea();
		lado2=l2.calcularArea();
		lado3=l3.calcularArea();
		
		System.out.println("el area es: "+lado1);
		System.out.println("el area 2 es: "+lado2);
		System.out.println("el area 3 es: "+lado3);
		System.out.println("---------------------------");
		
		lado1=l1.calcularPerimetro();
		lado2=l2.calcularPerimetro();
		lado3=l3.calcularPerimetro();
		
		System.out.println("el perimetro es: "+lado1);
		System.out.println("el perimetro 2 es: "+lado2);
		System.out.println("el perimetro 3 es: "+lado3);
		
	}

}
