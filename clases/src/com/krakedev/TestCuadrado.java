package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado l1=new Cuadrado(2);
		Cuadrado l2=new Cuadrado(3);
		Cuadrado l3=new Cuadrado(8);
		
		double lad1=l1.calcularArea();
		double lad2=l2.calcularArea();
		double lad3=l3.calcularArea();
		System.out.println("EJERCICIO CONSTRUCTOR");
		System.out.println("el area es: "+lad1);
		System.out.println("el area 2 es: "+lad2);
		System.out.println("el area 3 es: "+lad3);
		System.out.println("---------------------------");
		
		lad1=l1.calcularPerimetro();
		lad2=l2.calcularPerimetro();
		lad3=l3.calcularPerimetro();
		System.out.println("el perimetro es: "+lad1);
		System.out.println("el perimetro 2 es: "+lad2);
		System.out.println("el perimetro 3 es: "+lad3);
		
		System.out.println("FIN EJERCICIO CONSTRUCTOR");
		System.out.println("---------------------------");
		
		

		double lado1;
		double lado2;
		double lado3;
		
		l1.setLado(2);
		l2.setLado(5);
		l3.setLado(8);
		
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
