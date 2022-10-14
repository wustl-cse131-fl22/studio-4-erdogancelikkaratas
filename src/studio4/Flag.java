package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.Color;
import java.util.Scanner;



import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		StdDraw.clear();
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledRectangle(0, 0, 1, 1);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.25);
		StdDraw.setPenColor(128, 0, 32);
		StdDraw.filledCircle(0.5, 0.5, 0.15);
		StdDraw.setPenColor(255, 255, 0);
		StdDraw.filledCircle(0.5, 0.5, 0.075);
	}
}