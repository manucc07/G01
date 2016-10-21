import static org.junit.Assert.*;

import org.junit.Test;


public class TestResta {

	@Test
	public void testRest2Num2() {
		assertEquals(1, resta(3,2));
	}

	@Test
	public void testSumNumWithZero() {
		assertEquals(2, resta(2,0));
		assertEquals(-2, resta(0,2));
	}

	
	@Test
	public void testSumWithNeg() {
		assertEquals(10, resta(8, -2));
		assertEquals(-1, resta(-4, -3));
	}
	
	int resta(int a, int b) {
		return Resta.resta(a, b);

	}

}
