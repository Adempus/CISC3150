/*	Jeff Morin	
 * 	CIS3150
 *  8/27/2015
 * 	
 * 	--HW1 Quesiton 6--
 * Write a program that prompts the user to enter the center coordinates and 
 * radiuses of two circles. Determine whether they are separate from each 
 * other, touching each other, overlapping each other, or completely within 
 * one another. Test each case and show the output.
 * 
 * Circles intersect if the sum of their radii is greater than the distance
 * between the centres. 
 *  
 * */

package Homework_1;
import java.util.*;
import java.awt.geom.*;

public class HW1_Question6 {
	public static void main(String[] args) 
	{
		Scanner scanRadius = new Scanner(System.in);
		Scanner scanCenter = new Scanner(System.in);
		Point2D centerA = new Point2D.Double();
		Point2D centerB = new Point2D.Double();
		double x, y, radiusA = 0, radiusB = 0;

		for (char i = 'A'; i <= 'B'; i++) {
			System.out.print("\nCircle " + i);
			System.out.print("\nEnter center cordinates:" + "\n(x): ");
			x = scanCenter.nextDouble();
			System.out.print("(y): ");
			y = scanCenter.nextDouble();

			System.out.print("Enter radius: ");	
			if (i == 'A') {
				radiusA = scanCenter.nextDouble();
				centerA.setLocation(x, y);
			} else if (i == 'B') {
				radiusB = scanCenter.nextDouble();
				centerB.setLocation(x, y);
			}
		}
		scanRadius.close();
		scanCenter.close();

		double distance = distance(centerA, centerB);

		if (distance == (radiusA + radiusB))
			System.out.println("\nThe two circles are touching");
		else if ((distance < Math.abs(radiusA - radiusB)))
			System.out.println("\nOne circle encloses another");
		else if (distance < (radiusA + radiusB))
			System.out.println("\nThe two circles overlap");
		else if (distance > (radiusA + radiusB))
			System.out.println("\nThe two circles are separate");
	}

	public static double distance(Point2D center1, Point2D center2) 
	{
		return Math.sqrt(Math.pow((center2.getX() - center1.getX()), 2)
				+ Math.pow((center2.getY() - center1.getY()), 2));
	}
}
