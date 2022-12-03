
/**
 * Example of two different ways of creating arrays in Java

 * @author Foo Barstein
 * @version 1.9
 */

public class BasicCreation {

	public static void main(String[] args) {

		// two part variable "creation"
		int y; // declaration
		y = 10; // assignment 

		//int z = 10; // both declaration and assignment in one statement
		
		//example how to create an array
		int[] x; //declaration of variable
		x = new int[5]; //allocation of memory
		
		//populating the array... defining the array elements
		x[0] = 100;
		x[1] = 200;
		x[2] = 300;
		x[3] = 100;
		x[4] = 200;
		
		//the same thing in shorthand syntax
		int[] z = {
				100,
				200,
				300,
				100,
				200
		};
		

	}

}