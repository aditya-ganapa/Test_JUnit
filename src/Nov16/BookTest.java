package Nov16;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookTest {
	Book b1,b2,b3;
	@Before
	public void init() {
		b1=new Book();
		b2=new Book();
		b3=new Book();
		b1.setBname("junit testing"); b1.setCost(789.55f); b1.setIsdn(1234);
		b2.setBname("javascript testing"); b2.setCost(780.55f); b2.setIsdn(123);
		b3.setBname("junit testing"); b3.setCost(789.55f); b3.setIsdn(1234);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testEqualsObject() {
	//	fail("Not yet implemented");
		assertTrue(b1.equals(b3));
		assertFalse(b2.equals(b3));
		throw new IllegalArgumentException();
	}
	@After
	public void cleanup() {
		b1=null;
		b2=null;
		b3=null;
	}	
}