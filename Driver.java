package oswaldo;

import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		
		char someArray[] = {'z','a','s','f','b'};
		
		// original order of list
		System.out.println("initial order is: " + Arrays.toString(someArray));
			
		// use arrays.sort to place in natural ordering		
		Arrays.sort(someArray);
		System.out.println("after using arrays.sort order is: " + Arrays.toString(someArray));
		
		// carry out a binary search
		int location = Arrays.binarySearch(someArray, 'b');
		System.out.println("After using binary search method of arrays 'a' is found at: " + location);
		
		
	}
}