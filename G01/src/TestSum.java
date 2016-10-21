import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSum {

	@Test
	public void test1Modificado() {
		assertEquals(4, sum(1, 3));
	}

	@Test
	public void testSumNumWithZero() {
		assertEquals(2, sum(2, 0));
		assertEquals(2, sum(0, 2));
	}

	@Test
	public void testSumWithNeg() {
		assertEquals(6, sum(8, -2));
		assertEquals(-7, sum(-4, -3));
	}

	int sum(int a, int b) {
		return Sum.sum(a, b);

	}
	@Test 
	public void sumaTresNumeros() {
		assertEquals(7, Sum.sum(1, 4, 2));

	}

}
