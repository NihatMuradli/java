package java_array;

import java.util.Arrays;

public class exercise_2 {
	public static void main(String[] args) {
		int [] array2 = {2,1,5,4,11,6,3,7,10,25};
		System.out.println("Sortlasmadan evvel");
		System.out.println(Arrays.toString(array2));
		Arrays.sort(array2);
		System.out.println("Sortlasmadan sonra");
		System.out.println(Arrays.toString(array2));
		System.out.println("10-un indeksi "+Arrays.binarySearch(array2, 10));
	}
}
