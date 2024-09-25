package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p;
		p= new Persona();
		Persona p2= new Persona();
		/*PERSONA 1*/
		p.nombre="Mario";
		p.edad=12;
		p.estatura=1.90;
		/*PERSONA 2*/
		p2.nombre="Lucia";
		p2.edad=24;
		p2.estatura=1.50;
		
		System.out.println("nombre es: "+ p.nombre);
		System.out.println("edad es: "+ p.edad);
		System.out.println("estarura es: "+ p.estatura);
		System.out.println("************************");
		System.out.println("nombre es: "+ p.nombre);
		System.out.println("edad es: "+ p.edad);
		System.out.println("estatura es: "+ p.estatura);
		
	}

}
