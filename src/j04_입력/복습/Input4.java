package j04_입력.복습;

import java.util.Scanner;

public class Input4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = null;
		String address = null;
		String phone = null;
		
		/*
		 * 김준일
		 * 부산 동래구 사직동
		 * 010-9988-1916
		 * 
		 */
		System.out.print("이름: ");
		name = scanner.next();
		scanner.nextLine();
		
		System.out.print("주소: ");
		address = scanner.nextLine();
				
		System.out.print("연락처: ");
		phone = scanner.next();
		
		System.out.println("이름 -> " + name);
		System.out.println("주소 -> " + address);
		System.out.println("연락처 -> " + phone);
		
	}

}









