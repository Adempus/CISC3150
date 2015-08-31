/*	Jeff Morin	
 * 	CIS3150
 *  8/27/2015
 * 	
 * 	--HW1 Quesiton 4--
 * Feed a file that contains numbers into your program using command line 
 * redirection. Have your program read & print the file on the screen.
 * 
 * */
package Homework_1;
import java.util.*;
import java.util.regex.Pattern;

public class HW1_Question4 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		StringBuilder text = new StringBuilder();
		scan.useDelimiter(Pattern.compile("\r\n"));
 		
		while(scan.hasNext()) 
			text.append(scan.next());

		System.out.println("file contents:\n" + text);
		scan.close();
	}
}