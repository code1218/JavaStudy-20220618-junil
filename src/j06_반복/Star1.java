package j06_반복;

import java.util.Scanner;

public class Star1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("별의 개수를 입력하세요: ");
		int n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
