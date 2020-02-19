package edu.umb.cs.cs680.hw05;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;


import java.awt.Point;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PolygonTest {

	@Test
	public void triangleAreaTest() {
		ArrayList<Point> triangle = new ArrayList<Point>();
		triangle.add(new Point(0, 0));
		triangle.add(new Point(0, 1));
		triangle.add(new Point(1, 0));
		Polygon pol = new Polygon(triangle, new TriangleAreaCalc());
		float actual = pol.getArea();
		float expected = 0.5f;
		assertThat(actual, is(expected));
	}
	@Test
	public void rectangleAreaTest() {
		ArrayList<Point> rectangle = new ArrayList<Point>();
		rectangle.add(new Point(0, 0));
		rectangle.add(new Point(0, 1));
		rectangle.add(new Point(1, 0));
		rectangle.add(new Point(1, 1));
		Polygon pol = new Polygon(rectangle, new RectangleAreaCalc());
		float actual = pol.getArea();
		float expected = 1f;
		assertThat(actual, is(expected));
		
		
		
	}
}
