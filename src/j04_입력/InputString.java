package j04_입력;

import java.util.Scanner;

public class InputString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열 입력1: ");
		String str = scanner.next();
		scanner.nextLine();
		
		System.out.print("문자열 입력2: ");
		String str2 = scanner.nextLine();
		
		System.out.println("첫번째 입력: " + str);
		System.out.println("두번째 입력: " + str2);
		
		
	}

}
