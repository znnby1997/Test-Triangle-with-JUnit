package triangle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import triangle.Triangle;

public class TestCase {

	private Triangle aTriangle;
	
	@Before
	public void setUp() {
		aTriangle = new Triangle();
	}

	@Test
	public void testScalene() {
		assertEquals(3, aTriangle.getTriangleShape(4, 2, 3));
	}
	
	@Test
	public void testEquilateral() {
		assertEquals(1, aTriangle.getTriangleShape(1, 1, 1));
	}
	
	@Test
	public void testIsosceles() {
		assertEquals(2, aTriangle.getTriangleShape(2, 3, 3));
	}
	
	/*
	@Test
	public void testNotExist() {
		assertEquals(0, aTriangle.getTriangleShape(1, 2, 5));
	}*/
}
