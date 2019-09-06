package oswaldo;

import java.util.ArrayList;
import java.util.Scanner;

public class gasMileage {
	public static void main(String[] args) {
		float mpg = 0F;
		ArrayList<Integer> arrayOfGallonsUsed = new ArrayList<Integer>();
		ArrayList<Integer> arrayOfMilesDriven = new ArrayList<Integer>();

		float runningTotalMpg = 0F;
		float totalMpg = 0F;
		int iterator = 0;
		int trips = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter trips taken: ");
		trips = input.nextInt();

		while (iterator < trips) {
			System.out.print("Enter miles driven for this trip: ");
			arrayOfMilesDriven.add(input.nextInt());

			System.out.print("Enter gallons used for this trip: ");
			arrayOfGallonsUsed.add(input.nextInt());

			iterator++;
		}

		input.close();

		for (int i = 0; i < trips; i++) {

			mpg = arrayOfMilesDriven.get(i) / arrayOfGallonsUsed.get(i);

			runningTotalMpg += mpg;
		}
		totalMpg = runningTotalMpg / trips;

		System.out.println("During all trips combined mpg was " + totalMpg + " miles per gallon");

	}
}
