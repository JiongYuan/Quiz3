import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetArea() {
		Triangle t = new Triangle(6.0, 8.0, 10.0);
		assertEquals(t.getArea(), 24.0, 0.001);
		t = new Triangle(10.0, 10.0, 10.0);
		assertEquals(t.getArea(), Math.pow(t.getSide1(), 2) * Math.sqrt(3.0) / 4.0, 0.001);
		}

	@Test
	public void testGetPerimeter() {
		Triangle t = new Triangle(6.0, 8.0, 10.0);
		assertEquals(t.getPerimeter(), 24.0, 0.001);
		t = new Triangle(10.0, 10.0, 10.0);
		assertEquals(t.getPerimeter(), 30.0, 0.001);
		}

}