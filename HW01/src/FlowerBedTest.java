import static org.junit.Assert.*;

import org.junit.Test;

public class FlowerBedTest {

	@Test
	public void testCalcPerimeter() {
		FlowerBed flowerBed = new FlowerBed();
		double actual = flowerBed.calcCircumference(1.0);
		double expected = 6.28;
		assertEquals(actual, expected, 0.01);
	}

}
