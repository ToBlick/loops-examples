package embarrassingly_simple_loops;

import java.util.Scanner;

/**
 * A method to compute the square root.
 * https://en.wikipedia.org/wiki/Methods_of_computing_square_roots#Heron's_method
 * 
 */
public class Heron {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		// TODO: Ask user for input number to compute sqrt of. Call it S.
		// ...
		scn.close();

		// a heuristic to determine how many iterations we need
		double tol = 1e-15;
		int max_it = (int) Math.sqrt(1/tol);

		// initialize values
		// ...

		// Implement the for loop. At every iteration, print the current estimate and relative error
		// The algorithm is: x(n+1) = 0.5 * ( x(n) + S / x(n) )
		//
		// ...
	}
}
