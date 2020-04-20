package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import dev.Calculos;

public class TestCalculos2 {

	private double[] arreglo1 = { 7, 12, 10, 12, 10, 12, 12, 12, 12, 8, 8, 8, 20, 14, 18, 12 };

	@Test
	public void TestXs() {
		Calculos calcu = new Calculos(arreglo1);
		double resultadoObservado = calcu.imprimir(0);
		double resultadoEsperado = 6.3375;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void TestS() {
		Calculos calcu = new Calculos(arreglo1);
		double resultadoObservado = calcu.imprimir(1);
		double resultadoEsperado = 8.4393;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void TestM() {
		Calculos calcu = new Calculos(arreglo1);
		double resultadoObservado = calcu.imprimir(2);
		double resultadoEsperado = 11.2381;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void TestL() {
		Calculos calcu = new Calculos(arreglo1);
		double resultadoObservado = calcu.imprimir(3);
		double resultadoEsperado = 14.9650;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void TestXL() {
		Calculos calcu = new Calculos(arreglo1);
		double resultadoObservado = calcu.imprimir(4);
		double resultadoEsperado = 19.9280;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}
}

//
//
//
//
//
