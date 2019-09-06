package oswaldo;

import java.util.Scanner;

public class Analysis {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// initialzing variables in declarations
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		
		// process 10 students using counter-controlled loop
		while(studentCounter <= 10) {
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			int result = input.nextInt();
			
			// if...else is nested in the while statement
			if(result == 1) {
				passes += 1;
			}
			else {
				failures += 1;
			}
			
			studentCounter += 1;
		}
		
		input.close();
		
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
		
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
		
		// determine whether more than 8 students passed
		if (passes > 8) {
			System.out.println("Bonus to instructor!!!");
		} else {
			System.out.println("No bonus to instructor! Teach more betta");
		}

	}
}
