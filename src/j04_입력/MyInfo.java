package j04_입력;

import java.util.Scanner;

public class MyInfo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = null;
		int	age = 0;
		String phone = null;
		String address = null;
		char gender = 0;
		
		System.out.println("[정보 입력]");
		System.out.print("이름: ");
		name = scanner.next();
		System.out.print("나이: ");
		age = scanner.nextInt();
		System.out.print("연락처: ");
		phone = scanner.next();
		scanner.nextLine();
		System.out.print("주소: ");
		address = scanner.nextLine();
		System.out.print("성별: ");
		gender = scanner.next().charAt(0);
		
		System.out.println();
		
		System.out.println("[정보 출력]");
		System.out.println(name + " 회원의 나이는 " + age + "살입니다.");
		System.out.println("연락처는 " + phone + "이고 " + address + "에 거주중입니다.");
		System.out.println("성별은 " + gender + "성입니다.");
		
		/*
		 * [정보 입력]
		 * 이름: 김준일					next()				name
		 * 나이: 29						nextInt()			age
		 * 연락처: 010-9988-1916		next()				phone
		 * 주소: 부산 동래구 사직동		nextLine()			address
		 * 성별: 남						next().charAt(0)	gender
		 * 
		 * 
		 * [정보 출력]
		 * 김준일 회원의 나이는 29살입니다.
		 * 연락처는 010-9988-1916이고 부산 동래구 사직동에 거주중입니다.
		 * 성별은 남성입니다.
		 * 
		 * 
		 */
		
		
	}

}
