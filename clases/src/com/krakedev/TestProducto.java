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
		productoA.setNombre("Clonazepam");
		productoA.setDescripcion("Benzodiacepina");
		productoA.setPrecio(3.99);
		productoA.setStockActual(29);
		
		productoB.setNombre("Fenobarbital");
		productoB.setDescripcion("Analgesico");
		productoB.setPrecio(6.10);
		productoB.setStockActual(14);
		
		productoC.setNombre("Toxoide Tetanico");
		productoC.setDescripcion("Vacuna Antibacterial");
		productoC.setPrecio(19.78);
		productoC.setStockActual(7);
		
		/*MOSTRANDO EN PANTALLA*/
		System.out.println("PRODUCTO 1");
		System.out.println("NOMBRE: "+productoA.getNombre());
		System.out.println("DESCRIPCION: "+productoA.getDescripcion());
		System.out.println("PRECIO: "+productoA.getPrecio());
		System.out.println("STOCK: "+productoA.getStockActual());
		
		System.out.println("-----------------------------------------");
		
		System.out.println("PRODUCTO 2");
		System.out.println("NOMBRE: "+productoB.getNombre());
		System.out.println("DESCRIPCION: "+productoB.getDescripcion());
		System.out.println("PRECIO: "+productoB.getPrecio());
		System.out.println("STOCK: "+productoB.getStockActual());
		
		System.out.println("-----------------------------------------");
		
		System.out.println("PRODUCTO 3");
		System.out.println("NOMBRE: "+productoC.getNombre());
		System.out.println("DESCRIPCION: "+productoC.getDescripcion());
		System.out.println("PRECIO: "+productoC.getPrecio());
		System.out.println("STOCK: "+productoC.getStockActual());
					
		
	}

}
