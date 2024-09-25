package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1;
		Auto auto2;
		/*INSTANCIANDO */
		auto1=new Auto();
		auto2=new Auto();
		/*MODIFICANDO VALORES AUTO1*/
		auto1.marca="mustang";
		auto1.anio=98;
		auto1.precio=16000;
		/*MODIFICANDO VALORES AUTO2*/
		auto2.marca="chevrolet";
		auto2.anio=2004;
		auto2.precio=8600;
		/*MOSTRANDO EN CONSOLA AUTO1*/
		System.out.println("MARCA DEL PRIMER AUTO ES: "+auto1.marca );
		System.out.println("AÑO DEL PRIMER AUTO ES: "+auto1.anio );
		System.out.println("PRECIO DEL PRIMER AUTO ES: "+auto1.precio );
		
		System.out.println("------------------------------------------" );
		/*MOSTRANDO EN CONSOLA AUTO2*/
		System.out.println("MARCA DEL SEGUNDO AUTO ES: "+auto2.marca );
		System.out.println("AÑO DEL SEGUNDO AUTO ES: "+auto2.anio );
		System.out.println("PRECIO DEL SEGUNDO AUTO ES: "+auto2.precio );
		

	}

}
