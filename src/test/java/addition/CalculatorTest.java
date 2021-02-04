package addition;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test_add_1() {
		Calculator calculator = new Calculator();
		calculator.a = 10;
		calculator.b = 20;
		assertEquals(30, calculator.addNum());
	}
	
	@Test
	public void test_add_2() {
		Calculator calculator = new Calculator();
		calculator.a = 20;
		calculator.b = 30;
		assertEquals(50, calculator.addNum());
	}
	
	@Test
	public void test_add_3() {
		Calculator calculator = new Calculator();
		calculator.a = 40;
		calculator.b = 20;
		assertEquals(20, calculator.subtract());
	}
	
	@Test
	public void test_add_4() {
		Calculator calculator = new Calculator();
		calculator.a = 10;
		calculator.b = 20;
		assertEquals(-10, calculator.subtract());
	}

}