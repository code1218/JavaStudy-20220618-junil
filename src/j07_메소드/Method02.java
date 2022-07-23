package j07_메소드;

public class Method02 {
	
	//void 비어있다, 공허하다, 반환할 값이 없다.

	// 매개변수와 반환값이 없는 메소드
	public static void test1() {
		System.out.println("test1 메소드 실행");
	}
	
	// 매개변수는 있고 반환값이 없는 메소드
	public static void test2(int age, int year) {
		System.out.println("나이: " + age);
		System.out.println("출생년도: " + year);
	}
	
	// 매개변수는 없고 반환값이 있는 메소드
	public static String test3() {
		return "김준일";
	}
	
	// 매개변수와 반환값이 모두 있는 메소드
	public static String test4(String name, String job) {
		System.out.println("이름: " + name);
		System.out.println("직업: " + job);
		return name + ", " + job;
	}
	
	// 반환자료형이 void 일 때 메소드를 강제로 탈출하는 방법
	public static void test5(int num) {
		for(int i = 0; i < 10; i++) {
			System.out.println("i: " + i);
			if(i == num) {
				System.out.println("메소드를 탈출");
				break;
			}
		}
		System.out.println("for문이 정상적으로 종료되었음.");
	}
	
	public static void main(String[] args) {
		test1();
		test2(29, 1994);
		String name = test3();
		System.out.println(name);
		String nameAndJob = test4("김준일", "강사");
		System.out.println(nameAndJob);
		test5(5);
		System.out.println("test5 메소드 호출 후에 출력");
	}
	


}






