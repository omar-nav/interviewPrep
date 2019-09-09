package oswaldo;

import java.util.Arrays;

class BubbleSort {
	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < (n - i - 1); j++) {
				// leads to a swap if j is larger
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					System.out.println("temp is now: " + temp);
					System.out.println("just swapped " + arr[j] + " for a " + arr[j + 1]);
					System.out.println("array is currently: ");
					printArray(arr);
					// " array sub j "
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
	}

	/* Prints the array */
	void printArray(int arr[]) {

		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
