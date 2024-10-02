package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		Color pen = new Color(a,b,c);
		StdDraw.setPenColor(pen);
		boolean filled = in.nextBoolean();
		if(shape.equals("rectangle")) {
			double m = in.nextDouble();
			double n = in.nextDouble();
			double p = in.nextDouble();
			double q = in.nextDouble();
			if (filled == true) {
				StdDraw.filledRectangle(m, n, p, q);
			}
			else {
				StdDraw.rectangle(m, n, p, q);
			}
		}
		else if(shape.equals("ellipse")) {
			double m = in.nextDouble();
			double n = in.nextDouble();
			double p = in.nextDouble();
			double q = in.nextDouble();
			if (filled == true) {
				StdDraw.filledEllipse(m, n, p, q);
			}
			else {
				StdDraw.ellipse(m, n, p, q);
			}
		}
		else if (shape.equals("triangle")) {
			double m = in.nextDouble();
			double n = in.nextDouble();
			double p = in.nextDouble();
			double q = in.nextDouble();
			double u = in.nextDouble();
			double v = in.nextDouble();
			double []x= {m,n,p};
			double []y = {q,u,v};
			if (filled == true) {
				StdDraw.filledPolygon(x, y);
			}
			else {
				StdDraw.polygon(x, y);
			}
		}
	}
}
