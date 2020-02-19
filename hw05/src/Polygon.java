package edu.umb.cs.cs680.hw05;

import java.awt.Point;
import java.util.ArrayList;

public class Polygon {

	private ArrayList<Point> points = new ArrayList<Point>();
	private AreaCalculator areaCalc;

	public Polygon(ArrayList<Point> points, AreaCalculator areaCalc) {
		this.points = points;
		this.areaCalc = areaCalc;
	}

	public void setAreaCalc(AreaCalculator calc) {
		areaCalc = calc;
	}

	public void addPoint(Point point) {
		points.add(point);
	}

	public float getArea() {
		return areaCalc.getArea(points);
	}

	public static void main(String[] args) {
//This is one way of testing
		ArrayList<Polygon> collection = new ArrayList<Polygon>();//a collection of polygons

		ArrayList<Point> triangle1 = new ArrayList<Point>();
		ArrayList<Point> triangle2 = new ArrayList<Point>();
		ArrayList<Point> rectangle1 = new ArrayList<Point>();
		ArrayList<Point> rectangle2 = new ArrayList<Point>();

		triangle1.add(new Point(0, 0));
		triangle1.add(new Point(0, 1));
		triangle1.add(new Point(1, 0));

		triangle2.add(new Point(0, 0));
		triangle2.add(new Point(0, 2));
		triangle2.add(new Point(2, 0));

		rectangle1.add(new Point(1, 1));
		rectangle1.add(new Point(1, 0));
		rectangle1.add(new Point(0, 1));
		rectangle1.add(new Point(0, 0));

		rectangle2.add(new Point(2, 2));
		rectangle2.add(new Point(2, 0));
		rectangle2.add(new Point(0, 2));
		rectangle2.add(new Point(0, 0));

		//since each polygon consists of and arraylist of points, and a area calculator...
		collection.add(new Polygon(triangle1, new TriangleAreaCalc()));
		collection.add(new Polygon(triangle2, new TriangleAreaCalc()));
		collection.add(new Polygon(rectangle1, new RectangleAreaCalc()));
		collection.add(new Polygon(rectangle2, new RectangleAreaCalc()));

		for (Polygon item : collection) {
			System.out.println(item.getArea());
		}

	}

}
