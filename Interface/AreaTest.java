import static org.junit.Assert.*;

import org.junit.Test;

public class AreaTest {

	@Test
	public void AreaTest() {
		RectanglePlus rp = new RectanglePlus(2, 2);
		int result = rp.getArea();
		assertEquals(5, result);
	}
	
	@Test
	public void AreaTest1() {
		RectanglePlus rp = new RectanglePlus(2, 2);
		int result = rp.getArea();
		assertEquals(4, result);
	}
}
