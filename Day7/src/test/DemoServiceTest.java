package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import service.DemoService;

public class DemoServiceTest {
	@Test
	public void isPrimeTest() {
		DemoService demoService = new DemoService();

		boolean result = demoService.isPrime(11);
//			assertEquals(true, result);
		assertTrue(result);
	}

	@Test
	public void isNonPrime() {
		DemoService demoService = new DemoService();
		boolean result = demoService.isPrime(12);
		assertFalse(result);
	}
}
