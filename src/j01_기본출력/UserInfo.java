package j01_기본출력;

public class UserInfo {

	public static void main(String[] args) {
		String username = "junil2";
		String password = "aaa1234";
		
		
		System.out.print("사용자 이름: ");
		System.out.println(username);
		System.out.print("비밀번호: ");
		System.out.println(password);
		System.out.println("접속하신 회원의 사용자 이름은 " + username + "입니다.");
		
		System.out.println();
		System.out.println("=========================================");
		System.out.println();
		
		/*
		 * name		>	String
		 * age		>	int
		 * phone	> 	String
		 * address	>	String
		 * 
		 * 이름: 김준일
		 * 나이: 29
		 * 연락처: 010-9988-1916
		 * 주소: 부산 동래구 사직동
		 */
		
		String name = "김준일";
		int age = 29;
		String phone = "010-9988-1916";
		String address = "부산 동래구 사직동";
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("연락처: " + phone);
		System.out.println("주소: " + address);
		
		
	}

}
