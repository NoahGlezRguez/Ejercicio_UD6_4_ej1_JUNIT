package ejercicio;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	Calculadora numeros1 = new Calculadora(1, 2);
	Calculadora numeros2 = new Calculadora(2, 1);
	Calculadora numeros3 = new Calculadora(2, 2);
	Calculadora numeros4 = new Calculadora(-1, 2);
	Calculadora numeros5 = new Calculadora(-1, -2);
	Calculadora numeros6 = new Calculadora(1, -2);
	Calculadora numeros7 = new Calculadora(2, 0);
	Calculadora numeros8 = new Calculadora(0, 2);
	
	@Test
	public void testResta() {
		
		//1, 2
		assertEquals(1, numeros1.resta());
		assertNotNull(numeros1.resta());
		//2, 1
		assertEquals(1, numeros2.resta());
		assertNotNull(numeros2.resta());
		//2, 2
		assertEquals(0, numeros3.resta());
		assertNotNull(numeros3.resta());
		//-1, 2
		assertEquals(3, numeros4.resta());
		assertNotNull(numeros4.resta());
		//-1, -2
		assertEquals(1, numeros5.resta());
		assertNotNull(numeros5.resta());
		//1, -2
		assertEquals(3, numeros6.resta());
		assertNotNull(numeros6.resta());
		//2, 0
		assertEquals(2, numeros7.resta());
		assertNotNull(numeros7.resta());
		//0, 2
		assertEquals(2, numeros8.resta());
		assertNotNull(numeros8.resta());
	}

	@Test
	public void testResta2() {
		
		//1, 2
		assertFalse(numeros1.resta2());
		assertNotNull(numeros1.resta2());
		//2, 1
		assertTrue(numeros2.resta2());
		assertNotNull(numeros2.resta2());
		//2, 2
		assertTrue(numeros3.resta2());
		assertNotNull(numeros3.resta2());
		//-1, 2
		assertFalse(numeros4.resta2());
		assertNotNull(numeros4.resta2());
		//-1, -2
		assertTrue(numeros5.resta2());
		assertNotNull(numeros5.resta2());
		//1, -2
		assertTrue(numeros6.resta2());
		assertNotNull(numeros6.resta2());
		//2, 0
		assertTrue(numeros7.resta2());
		assertNotNull(numeros7.resta2());
		//0, 2
		assertFalse(numeros8.resta2());
		assertNotNull(numeros8.resta2());
	}

	@Test
	public void testDivide2() {
		
		//1, 2
		assertEquals((Integer)0, numeros1.divide2());
		assertNotNull(numeros1.divide2());
		//2, 1
		assertEquals((Integer)2, numeros2.divide2());
		assertNotNull(numeros2.divide2());
		//2, 2
		assertEquals((Integer)1, numeros3.divide2());
		assertNotNull(numeros3.divide2());
		//-1, 2
		assertEquals((Integer)0, numeros4.divide2());
		assertNotNull(numeros4.divide2());
		//-1, -2
		assertEquals((Integer)0, numeros5.divide2());
		assertNotNull(numeros5.divide2());
		//1, -2
		assertEquals((Integer)0, numeros6.divide2());
		assertNotNull(numeros6.divide2());
		//2, 0
		assertEquals(null, numeros7.divide2());
		assertNull(numeros7.divide2());
		//0, 2
		assertEquals((Integer)0, numeros8.divide2());
		assertNotNull(numeros8.divide2());
	}

}
