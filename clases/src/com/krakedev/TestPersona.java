package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p;
		p= new Persona();
		Persona p2= new Persona();
		/*PERSONA 1*/
		p.setNombre("Mario");
		p.setEdad(12);
		p.setEstatura(1.90);
		/*PERSONA 2*/
		p2.setNombre("Lucia");
		p2.setEdad(24);
		p2.setEstatura(1.50);
		
		System.out.println("nombre es: "+ p.getNombre());
		System.out.println("edad es: "+ p.getEdad());
		System.out.println("estarura es: "+ p.getEstatura());
		System.out.println("************************");
		System.out.println("nombre es: "+ p.getNombre());
		System.out.println("edad es: "+ p.getEdad());
		System.out.println("estatura es: "+ p.getEstatura());
		
	}

}
