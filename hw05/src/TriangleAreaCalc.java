package edu.umb.cs.cs680.hw05;
import java.lang.Math;
import java.awt.Point;
import java.util.ArrayList;

public class TriangleAreaCalc implements AreaCalculator {
	
public TriangleAreaCalc() {
	
}
	     public float getArea(ArrayList<Point> points) {
		
         double x0 =(double)points.get(0).x;
         double y0 =(double)points.get(0).y;
         double x1 =(double)points.get(1).x;
         double y1 =(double)points.get(1).y;
         double x2 =(double)points.get(2).x;
         double y2 =(double)points.get(2).y;
       
        
         double A = Math.sqrt(Math.pow(x0 - x1, 2) + Math.pow(y0 - y1, 2));
         double B = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
         double C = Math.sqrt(Math.pow(x0 - x2, 2) + Math.pow(y0 - y2, 2));
         double S = (A + B + C)/2;
		
		return (float)Math.sqrt(S*(S-A)*(S-B)*(S-C));
			
	
	}
	

}
