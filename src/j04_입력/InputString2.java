package j04_입력;

import java.util.Scanner;

public class InputString2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열 두개를 입력하세요: ");
		String str1 = scanner.next();
		String str2 = scanner.next();
		
		System.out.println(str1);
		System.out.println(str2);
		
		
	}

}
