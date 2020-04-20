package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import dev.Calculos;

public class TestCalculos1 {

	private double[] arreglo1 = { 6.0000, 6.0000, 8.3333, 10.3333, 12.3333, 16.4000, 20.5000, 21.7500, 22.2500, 23.0000,
			28.3333, 29.0000, 55.8000 };

	@Test
	public void TestXs() {
		Calculos calcu = new Calculos(arreglo1);
		double resultadoObservado = calcu.imprimir(0);
		double resultadoEsperado = 4.3953;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void TestS() {
		Calculos calcu = new Calculos(arreglo1);
		double resultadoObservado = calcu.imprimir(1);
		double resultadoEsperado = 8.5081;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void TestM() {
		Calculos calcu = new Calculos(arreglo1);
		double resultadoObservado = calcu.imprimir(2);
		double resultadoEsperado = 16.4696;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void TestL() {
		Calculos calcu = new Calculos(arreglo1);
		double resultadoObservado = calcu.imprimir(3);
		double resultadoEsperado = 31.8811;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void TestXL() {
		Calculos calcu = new Calculos(arreglo1);
		double resultadoObservado = calcu.imprimir(4);
		double resultadoEsperado = 61.7137;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}
}
