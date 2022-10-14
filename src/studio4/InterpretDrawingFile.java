package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.Color;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String ShapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameterOne  = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();

		
		
		StdDraw.setPenColor(new Color (redComponent, greenComponent, blueComponent));
		if (ShapeType.equals("rectangle")) {
			System.out.println("Hello");
			if (isFilled){
			StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
			else {
			StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}
		if (ShapeType.equals("ellipse")) {
			if (isFilled){
			StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
			else {
			StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}
		if (ShapeType.equals("triangle")) {
			if (isFilled) {
				double parameterFive = in.nextDouble();
				double parameterSix = in.nextDouble();
				double [] x = {parameterOne, parameterThree, parameterFive};
				double [] y = {parameterTwo, parameterFour, parameterSix};
				StdDraw.filledPolygon(x, y);
			} else {
				double parameterFive = in.nextDouble();
				double parameterSix = in.nextDouble();
				double [] x = {parameterOne, parameterThree, parameterFive};
				double [] y = {parameterTwo, parameterFour, parameterSix};
				StdDraw.polygon(x, y);
			}
		}

	}
}
