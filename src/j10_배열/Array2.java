package j10_배열;

public class Array2 {

	public static void main(String[] args) {
		/*
		 * 배열 선언 방법
		 */

		// 지정한 크기 만큼 배열 공간 생성
		int[] numbers = new int[10];

		// 주어진 값들 만큼의 배열 공간을 생성하고 각 인덱스에 값들을 주입
		int[] numbers2 = { 1, 2, 3, 4, 5, 6 };

		int[] numbers3 = new int[] { 1, 2, 3, 4, 5, 6 };

		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);			
		}
		System.out.println();
		
		for(int i = 0; i < numbers2.length; i++) {
			System.out.println(numbers2[i]);			
		}
		System.out.println();
		
		for(int i = 0; i < numbers3.length; i++) {
			System.out.println(numbers3[i]);			
		}
		System.out.println();
	}

}








