package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		Rectangulo p=new Rectangulo();
		
		
		int area;
		r1.setBase(10);
		r1.setAltura(5);
		area=r1.calcularArea();
		
		int area2;
		r2.setBase(8);
		r2.setAltura(3);
		area2=r2.calcularArea();
		
		int per;
		p.setBase(r1.getBase()*2);
		p.setAltura(r1.getAltura()*2);;
		per=p.calcularPerimetro();
		
		int per2;
		p.setBase(r2.getBase()*2);
		p.setAltura(r2.getAltura()*2);
		per2=p.calcularPerimetro();
		
		
		System.out.println("El area es: "+area);
		System.out.println("El area 2 es: "+area2);
		System.out.println("El perimetro es: "+per);
		System.out.println("El perimetro 2 es: "+per2);

	}

}
