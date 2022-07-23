package j04_입력;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("값을 입력하세요: ");
		String text = scanner.next();
		
		System.out.println("입력된 값은: " + text);
		
		// 문자열(띄어쓰기 미포함)
		scanner.next();
		
		// 문자열(띄어쓰기 포함)
		scanner.nextLine();
		
		// 문자
		scanner.next().charAt(0);
		
		// 정수
		scanner.nextInt();
		
		// 실수
		scanner.nextDouble();
		
		// 논리
		scanner.nextBoolean();
	}

}
