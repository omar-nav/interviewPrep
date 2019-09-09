package oswaldo;

import java.util.Scanner;

public class MaximumFinder {
	public static void main(String[] args) {
		// create a scanner for input from command window
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three floating-point values separated by spaces: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		input.close();
		// determine the max calue
		double result = maximum(number1, number2, number3);

		// display maximum value
		System.out.println("Maximum is: " + result);
	}

	// returns the max of its three double parameters
	public static double maximum(double x, double y, double z) {
//		double maximumValue = x; // assume x is the largest to start
//		
//		// determine wheter y is greater than max Value
//		if (y > maximumValue) {
//			maximumValue = y;
//		}
//		
//		// determine whether z is greater than maximum Value
//		if (z > maximumValue) {
//			maximumValue = z;
//		}
//		
//		return maximumValue;
		return Math.max(x, Math.max(y, z));
	}
}
