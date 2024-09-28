package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSumaa;
		int resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDivision;
		
		calcu=new Calculadora();
		resultadoSumaa=calcu.sumar(5, 3);
		resultadoResta=calcu.restar(10, 3);
		resultadoMultiplicacion=calcu.multiplicar(4, 3);
		resultadoDivision=calcu.dividir(6, 2);
		
		
		System.out.println("RESULTADO SUMA: "+resultadoSumaa);
		System.out.println("----------------------------");
		System.out.println("RESULTADO RESTA: "+resultadoResta);
		System.out.println("----------------------------");
		System.out.println("RESULTADO MULTIPLICACION: "+resultadoMultiplicacion);
		System.out.println("----------------------------");
		System.out.println("RESULTADO DIVISION: "+resultadoDivision);
		System.out.println("----------------------------");
		calcu.mostrarResultado();

	}

}
