package j06_반복;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println(i + 1);
		}
		
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			System.out.println(n - i);
		}
	}

}
