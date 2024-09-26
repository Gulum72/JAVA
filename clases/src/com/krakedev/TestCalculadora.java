package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSumaa;
		int resultadoResta;
		calcu=new Calculadora();
		resultadoSumaa=calcu.sumar(5, 3);
		resultadoResta=calcu.resta(10, 3);
		
		System.out.println("RESULTADO SUMA: "+resultadoSumaa);
		System.out.println("----------------------------");
		System.out.println("RESULTADO RESTA: "+resultadoResta);

	}

}
