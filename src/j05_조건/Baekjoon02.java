package j05_조건;

import java.util.Scanner;

public class Baekjoon02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int year = 0;
		
		System.out.print("년도를 입력하세요: ");
		year = scanner.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("윤년이 아닙니다.");
		}

	}

}







