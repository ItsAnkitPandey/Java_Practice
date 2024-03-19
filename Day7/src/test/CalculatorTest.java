package test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import service.Calculator;

public class CalculatorTest {
	
	
	
	@Test
	public void sumTest() {
		Calculator cal = new Calculator();
		int result  = cal.sum(2, 6);
		assertEquals(result, 8 );
	}
	
	@Test
	public void substractTest() {
		Calculator cal = new Calculator();
		int result  = cal.substract(8, 6);
		assertEquals(result, 2 );
	}
	
	@Test
	public void multiplyTest() {
		Calculator cal = new Calculator();
		int result  = cal.multiply(2, 6);
		assertEquals(result, 12 );
	}
	
	@Test
	public void divisionTest() {
		Calculator cal = new Calculator();
		int result  = cal.division(30, 6);
		assertEquals(result, 5 );
	}
	
	
}
