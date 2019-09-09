package oswaldo;

import java.security.SecureRandom;

public class Driver {
	public static void main(String args[]) {
		SecureRandom randomNumbers = new SecureRandom();
		System.out.println(randomNumbers.nextDouble());
//		MergeSort mergeSort = new MergeSort();
//		int arr[] = { 12, 11, 13, 5, 6, 7 };
//
//		System.out.println("Given Array");
//		mergeSort.printArray(arr);
//
//		mergeSort.sort(arr, 0, arr.length - 1);
//
//		System.out.println("\nSorted array");
//		mergeSort.printArray(arr);
	}
}