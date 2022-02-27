package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CocienteTest {

	Cociente c1= new Cociente();
	Cociente c2= new Cociente();
	
	@Test
	public void testEsIgual() {
		c1.numerosReales(10.5, 5);
		double resultEsperado= 2.1;
		double resultObtenido= c1.numerosReales(10.5, 5);
		assertEquals(resultEsperado, resultObtenido);
	}
	@Test
	public void testNoEsIgual() {
		c1.numerosReales(10.5, 5);
		double resultEsperado= 3;
		double resultObtenido= c1.numerosReales(10.5, 5);
		assertNotEquals(resultEsperado, resultObtenido);
	}
	
	
	@Test
	public void testEsTrue() {
		c1.numerosEnteros(10, 5);
		int resultEsperado= 2;
		int resultObtenido= 2;
		assertTrue(resultEsperado==resultObtenido);
	}
	@Test
	public void testEsFalse() {
		c1.numerosEnteros(10, 5);
		int resultEsperado= 2;
		int resultObtenido= 8;
		assertFalse(resultEsperado==resultObtenido);
	}

	
	@Test
	public void testNoEsNull() {
		assertNotNull(c1.inversoNumeroReal(10.5));
	}
	@Test
	public void testThrows1() {
	assertThrows(RuntimeException.class, () -> c1.inversoNumeroReal(-10));
	}

	
	@Test
	public void testSame() {
		c1.raiz(10);
		c2.raiz(10.5);
		c1=c2;
		
		assertSame(c1,c2);
	}
	@Test
	public void testThrows2() {
	assertThrows(RuntimeException.class, () -> c1.raiz(-5));
	}
}
