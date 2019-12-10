package Nov16;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator calculator;
	
	@Before
	public void init() {
		calculator=new Calculator();
		calculator.n1=12;
		calculator.n2=15;
	}
	
	@Test
	public void testAddition() {
	//	fail("Not yet implemented");
		float res=calculator.addition();
		assertEquals(27, res, 0.0f);
	}

	@Test
	public void testSubtraction() {
	//	fail("Not yet implemented");
		float res=calculator.subtraction();
		assertEquals(-3, res, 0.0f);
	}

}