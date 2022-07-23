package j10_배열;

import java.util.Arrays;

public class Array3 {

	/*
	 * Arrays 클래스
	 */

	public static void main(String[] args) {
		int[] numbers = { 1, 9, 7, 4, 6, 5, 3, 8, 2, 10 };
		
		Arrays.sort(numbers);

		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
