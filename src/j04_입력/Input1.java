package j04_입력;

import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학원명을 입력하세요: ");
		String str = scanner.next();
		
		System.out.println("학원명: " + str);
	}

}
