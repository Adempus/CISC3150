/*	Jeff Morin	
 * 	CIS3150
 *  8/27/2015
 * 	
 * 	--HW1 Quesiton 3--
 * 	Write a program that randomly generates an integer between 1 & 12, and 
 *  displays the English name of that month. Run the program & show the output.
 *  
 * */

package Homework_1;
import java.util.Random;

public class HW1_Question3 {
	public static void main(String[] args) 
	{
		Random rand = new Random();
		
		int number = rand.nextInt(12) + 1;
		System.out.println("Number: " + number);
		
		String month[] = {
			null, "January", "February", "March", "April", "May", 
			"June", "July", "August", "September", "October", 
			"November", "December"
		};
		
		System.out.println("Month: " + month[number]);
	}
}