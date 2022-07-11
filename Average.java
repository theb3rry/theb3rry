// Java program to read some values using Scanner 
// class and print their mean. 
import java.util.Scanner; 

public class Average
{ 
	public static void main(String[] args) 
	{ 
		// Declare an object and initialize with 
		// predefined standard input object 
		Scanner sc = new Scanner(System.in); 
int[] myIntegers = {10, 20, 30, 47, 32, 12};
		// Initialize sum and count of input elements 
		int sum = myIntegers[1] + myIntegers[0], count = 2; 

		// Check if an int value is available 
		while (sc.hasNextInt()) 
		{ 
			// Read an int value 
			int num = sc.nextInt(); 
			sum += num; 
			 
		} 
		int mean = sum / count; 
		System.out.println("Mean: " + mean); 
	} 
} 
