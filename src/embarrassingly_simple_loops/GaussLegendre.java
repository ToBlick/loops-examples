package embarrassingly_simple_loops;

/**
 * A method to compute pi to desired accuracy.
 * https://en.wikipedia.org/wiki/Gauss%E2%80%93Legendre_algorithm
 * 
 */
public class GaussLegendre {

	public static void main(String[] args) {

		// initialize values
		double a = 1;
		double b = 1/Math.sqrt(2);
		double t = 0.25;
		double p = 1;

		double pi = Math.PI;
		double error = Math.abs(a-b);
		double approxpi = (a + b)*(a + b)/4/t;

		int i = 0;
		// stopping criterion
		double tol = 1e-15;

		while (error > tol) {
			double a_old = a;
			a = (a + b)/2;
			b = Math.sqrt(a_old * b);
			t = t - p*(a - a_old)*(a - a_old);
			p = 2*p;

			error = Math.abs(a-b);
			i++;
			approxpi = (a + b)*(a + b)/4/t;
			System.out.print("After " + i + " iteration" + (i > 1 ? "s" : "") + ", the approximate value of pi is " + approxpi + ". ");
			System.out.println("The relative error is " + Math.abs(approxpi/pi - 1) + ".");
		} // while
	} // main method
} // class
