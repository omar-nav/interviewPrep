package oswaldo;

import java.math.BigInteger;

public class FibonacciCalculator {
	private static BigInteger TWO = BigInteger.valueOf(2);

	// recursive declaration of method fibonacci
	public static BigInteger fibonacci(BigInteger number) {
		// test base case
		if (number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE)) { // base case
			return number;
		} else { // recursion step
			// THESE CALLS ARE RECURSIVE INDEED
			return fibonacci(number.subtract(BigInteger.ONE)).add(fibonacci(number.subtract(TWO)));
		}
	}

	public static void main(String[] args) {
		// displays the fibonacci values from 0-3
		for (int counter = 0; counter <= 100; counter++) {
			System.out.printf("Fibonacci of %d is: %d%n", counter, 
					fibonacci(BigInteger.valueOf(counter))); // this call is NOT recursive
		}
	}
}
