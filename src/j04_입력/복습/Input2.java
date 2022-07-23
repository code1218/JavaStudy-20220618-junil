package j04_입력.복습;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str1 = null;
		
		System.out.print("띄어쓰기를 포함하지 않는 문자열 입력: ");
		str1 = scanner.nextLine();
		
		System.out.println(str1);
	}

}
