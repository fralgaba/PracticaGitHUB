package calculadora;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void sumaPrueba() {
		
		System.out.println("Probando suma 2 + 5");
		
		Calculadora c1 = new Calculadora(2, 5);
		assertTrue(c1.suma() == 7);
	}
	
	@Test
	public void sumaPruebaConCero() {
		
		System.out.println("Probando suma con 0");
		
		Calculadora c2 = new Calculadora(0, 4);
		assertTrue(c2.suma() == 4);
	}
	
	@Test
	public void sumaPruebaConNegativos() {
		
		System.out.println("Probando suma con 2 números negativos");
		
		Calculadora c3 = new Calculadora(-4, -2);
		assertTrue(c3.suma() == -6);
	}
	
	@Test
	public void divisionPruebaPositivos() {
		
		System.out.println("Probando división 6 / 2");
		
		Calculadora c4 = new Calculadora(6, 2);
		assertTrue(c4.division() == 3);
	}
	
	public void divisionPruebaCero() {
		
		System.out.println("Probando división 5 / 0");
		
		Calculadora c4 = new Calculadora(5, 0);
		try {
			c4.division();
			Assert.fail("Se esperaba una excepción de argumento ilegal");
		}
		catch (IllegalArgumentException e) {
			
			assertTrue(e.getClass().equals(IllegalArgumentException.class));
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void divisionPruebaCero2() {
		
		System.out.println("Probando división 5 / 0");
		
		Calculadora c5 = new Calculadora(5, 0);
		c5.division();
	}
	
}
