/*	Jeff Morin	
 * 	CIS3150
 *  8/27/2015
 * 	
 * 	--HW1 Quesiton 5--
 *  Write a program that reads three 2D points A, B, and C from the user. 
 *  Next, calculate the length of each side of the triangle using the 
 *  distance formula: sqrt((x2-x1)^2+(y2-y1)^2). Finally, determine if it's a 
 *  real triangle. For a triangle to be real, the sum of any two sides needs 
 *  to be greater than the third. Make sure your output has some real and at 
 *  least one fake triangle.
 *  
 * */

package Homework_1;
import java.util.*;
import java.awt.geom.*;

public class HW1_Question5 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Point2D pointA = new Point2D.Double();
		Point2D pointB = new Point2D.Double();
		Point2D pointC = new Point2D.Double();
		double lineA_B, lineB_C, lineC_A;
		double x, y;
		
		System.out.println("Enter three 2D points:");
		
		for(char i =  'A' ; i <= 'C' ; i++) {
			System.out.print("\nPoint " + i + "\n(x): ");
			x = scan.nextDouble();
			System.out.print("(y): ");
			y = scan.nextDouble();
			
			if(i == 'A') pointA = setPoint(x, y);
			else if(i == 'B') pointB = setPoint(x, y);
			else if(i == 'C') pointC = setPoint(x, y);
		}
		scan.close();
		
		lineA_B = calcLength(pointA, pointB);
		lineB_C = calcLength(pointB, pointC);
		lineC_A = calcLength(pointC, pointA);
		
		if(((lineA_B < lineB_C) && (lineA_B < lineC_A)) 
			||((lineB_C < lineA_B) && (lineB_C < lineC_A)) 
			||((lineC_A < lineA_B) && (lineC_A < lineB_C))) 
			System.out.println("\nThe triangle is real.");
		 else 
			 System.out.println("\nThe triangle is fake.");
	}
	
	public static Point2D setPoint(double x, double y) 
	{
		Point2D point = new Point2D.Double(x, y); 
		return point;
	}
	
	public static double calcLength(Point2D point1, Point2D point2)
	{
		return Math.sqrt(Math.pow((point2.getX() - point1.getX()), 2) + 
				Math.pow((point2.getY() - point1.getY()), 2));
	}	
}