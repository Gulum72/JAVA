package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1;
		Auto auto2;
		/*INSTANCIANDO */
		auto1=new Auto("Hiundai",1990,24000);
		auto2=new Auto("Ferrari",2024,120000);
		
		System.out.println("MARCA DEL PRIMER AUTO ES: "+auto1.getMarca() );
		System.out.println("MARCA DEL SEGUNDO AUTO ES: "+auto2.getMarca());
		System.out.println("------------------------------------" );
		/*MODIFICANDO VALORES AUTO1*/
		auto1.setMarca("mustang");
		auto1.setAnio(98);
		auto1.setPrecio(16000);
		/*MODIFICANDO VALORES AUTO2*/
		auto2.setMarca("chevrolet");
		auto2.setAnio(2004);
		auto2.setPrecio(8600);
		/*MOSTRANDO EN CONSOLA AUTO1*/
		System.out.println("MARCA DEL PRIMER AUTO ES: "+auto1.getMarca() );
		System.out.println("AÑO DEL PRIMER AUTO ES: "+auto1.getAnio() );
		System.out.println("PRECIO DEL PRIMER AUTO ES: "+auto1.getPrecio() );
		
		System.out.println("------------------------------------------" );
		/*MOSTRANDO EN CONSOLA AUTO2*/
		System.out.println("MARCA DEL SEGUNDO AUTO ES: "+auto2.getMarca() );
		System.out.println("AÑO DEL SEGUNDO AUTO ES: "+auto2.getAnio() );
		System.out.println("PRECIO DEL SEGUNDO AUTO ES: "+auto2.getPrecio() );
		

	}

}
