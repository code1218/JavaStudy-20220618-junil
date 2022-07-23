package j06_반복;

import java.util.Scanner;

public class For4 {

	public static void main(String[] args) {
		
		/*
		 * 입력한 값 만큼 숫자를 출력
		 * 입력: 4
		 * 10
		 * 20
		 * 30
		 * 40
		 * 
		 * 40
		 * 30
		 * 20
		 * 10
		 * 
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("반복할 횟수를 입력하세요: ");
		int num = scanner.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.println(num - i);
		}
		
		
		
		
	}

}






