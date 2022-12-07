import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDemos {

	@Test
	void test() {
		//fail("Not yet implemented");
		double d = 5.0;
		assertEquals(5.0,d);
	}
	
	@Test
	void testDoubleSuma() {
		double d1 = 5.0;
		double d2 = 2;
		double r = d1+d2;
		assertEquals(7.0,r);	
	}
	
	@Test
	void testPrimitivoSuma() {
		byte b1 = 4;
		byte b2 = 8;
		int r = b1-b2;
		assertEquals(-4,r);	
	}
	

}