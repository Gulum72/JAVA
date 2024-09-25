package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		/*CREANDO VARIABLES*/
		Producto productoA;
		Producto productoB;
		Producto productoC;
		/*INSTANCIANDO OBJETOS*/
		productoA=new Producto();
		productoB=new Producto();
		productoC=new Producto();
		
		/*MODIFICANDO PRODUCTOS*/
		productoA.nombre="Clonazepam";
		productoA.descripcion="Benzodiacepina";
		productoA.precio=3.99;
		productoA.stockActual=29;
		
		productoB.nombre="Fenobarbital";
		productoB.descripcion="Analgesico";
		productoB.precio=6.10;
		productoB.stockActual=14;
		
		productoC.nombre="Toxoide Tetanico";
		productoC.descripcion="Vacuna Antibacterial";
		productoC.precio=19.78;
		productoC.stockActual=7;
		
		/*MOSTRANDO EN PANTALLA*/
		System.out.println("PRODUCTO 1");
		System.out.println("NOMBRE: "+productoA.nombre);
		System.out.println("DESCRIPCION: "+productoA.descripcion);
		System.out.println("PRECIO: "+productoA.precio);
		System.out.println("STOCK: "+productoA.stockActual);
		
		System.out.println("-----------------------------------------");
		
		System.out.println("PRODUCTO 2");
		System.out.println("NOMBRE: "+productoB.nombre);
		System.out.println("DESCRIPCION: "+productoB.descripcion);
		System.out.println("PRECIO: "+productoB.precio);
		System.out.println("STOCK: "+productoB.stockActual);
		
		System.out.println("-----------------------------------------");
		
		System.out.println("PRODUCTO 3");
		System.out.println("NOMBRE: "+productoC.nombre);
		System.out.println("DESCRIPCION: "+productoC.descripcion);
		System.out.println("PRECIO: "+productoC.precio);
		System.out.println("STOCK: "+productoC.stockActual);
					
		
	}

}
