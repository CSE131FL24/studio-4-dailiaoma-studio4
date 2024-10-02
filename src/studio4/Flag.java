package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.green);
		StdDraw.filledRectangle(0.5, 0.5, 0.35, 0.2);
		StdDraw.setPenColor(Color.red);
		double [] x = {0.15, 0.5, 0.85, 0.5};
		double [] y = {0.5, 0.7, 0.5, 0.3};
		StdDraw.filledPolygon(x, y);
		StdDraw.setPenColor(Color.cyan);
		double [] m = {0.25, 0.5, 0.75, 0.5};
		double [] n = {0.5, 0.65, 0.5, 0.35};
		StdDraw.filledPolygon(m, n);
		StdDraw.setPenColor(Color.yellow);
		double [] p = {0.32, 0.5, 0.68, 0.5};
		double [] q = {0.5, 0.6, 0.5, 0.4};
		StdDraw.filledPolygon(p, q);
	}
}