package addition;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Calculator Test
 * @author shubhampatel
 *
 */
public class CalculatorTest {

	
	@Test
	public void test_add_1() {
		Calculator calculator = new Calculator();
		calculator.a = 10;
		calculator.b = 20;
		assertEquals(30, calculator.addNum());
	}
	
	
	@Test
	public void test_add_() {
		Calculator calculator = new Calculator();
		calculator.a = 20;
		calculator.b = 10;
		assertEquals(30, calculator.addNum());
	}
	
	
	@Test
	public void test_sub_1() {
		Calculator calculator = new Calculator();
		calculator.a = 40;
		calculator.b = 10;
		assertEquals(30, calculator.subtract());
	}
	
	
	@Test
	public void test_sub_2() {
		Calculator calculator = new Calculator();
		calculator.a = 10;
		calculator.b = 20;
		assertEquals(-10, calculator.subtract());
	}

}
