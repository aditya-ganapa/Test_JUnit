package Annotations_Threads_GC_JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProfitTest {

	@Test(expected=IllegalArgumentException.class)
	public void testCalculateProfit() {
	//	fail("Not yet implemented");
		assertEquals(10, Profit.calculateProfit(20,30),0);
		Profit.calculateProfit(-20, 30);
		Profit.calculateProfit(20, -30);
		Profit.calculateProfit(-20, -30);
	}

}