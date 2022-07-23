package j04_입력;

import java.util.Scanner;

public class InputInt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 두개를 입력하세요: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int result = num1 + num2;
		
		System.out.println("두수의 합: " + result);

	}

}
