/*	Jeff Morin	
 * 	CIS3150
 *  8/27/2015
 * 	
 * 	--HW1 Quesiton 2--
 * 	In a loop, read radiuses from a user. Calculate the area of a circle using 
 *  the formula PI*r^2. Use the pow function, and the PI constant in the Math 
 *  class. Pick your data types wisely. Exit when the user presses ^d. Show 
 *  your output.
 *  
 * */
package Homework_1;
import java.util.Scanner;

public class HW1_Question2 {
	public static void main(String[] args) 
	{
		final double PI = Math.PI;
		double radius;

		Scanner scanRadius = new Scanner(System.in);
		Scanner scanEndPoint = new Scanner(System.in);
		
		System.out.print("\nEnter a radius to calculate its area: ");	
		
		while(scanRadius.hasNextDouble()) {
			radius = scanRadius.nextDouble();	
			double area = PI * (Math.pow(radius, 2));
			System.out.printf("area: %.2f%n%n", area);	
			System.out.print("radius: ");	
		}
		scanRadius.close();
		scanEndPoint.close();
	}
}