package java_array;

import java.util.Arrays;

public class exercise_1 {
	public static void main(String[] args) {
		int [] array1 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.binarySearch(array1, 1));
		System.out.println(Arrays.binarySearch(array1, 2));
		System.out.println(Arrays.binarySearch(array1, 3));
		System.out.println(Arrays.binarySearch(array1, 4));
		System.out.println(Arrays.binarySearch(array1, 5));
		System.out.println(Arrays.binarySearch(array1, 6));
		System.out.println(Arrays.binarySearch(array1, 7));
		System.out.println(Arrays.binarySearch(array1, 8));
		System.out.println(Arrays.binarySearch(array1, 9));
		System.out.println(Arrays.binarySearch(array1, 10));
	}
}
