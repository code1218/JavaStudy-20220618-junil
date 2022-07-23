package j07_메소드;

public class Method04 {
	/*
	 * 메소드 오버로딩
	 * 매개변수가 다르면 동일한 메소드명을 계속 사용할 수 있다.
	 */
	
	public static void test() {
		System.out.println("매개변수가 없는 test메소드 호출");
	}
	
	public static void test(int a) {
		System.out.println("매개변수가 정수인 test메소드 호출");
	}
	
	public static void test(String a) {
		System.out.println("매개변수가 문자열인 test메소드 호출");
	}
	
	public static void test(int a, int b) {
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
	public static void test(int a, String b) {
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

	public static void main(String[] args) {
		test();
		test(10);
		test("문자열");
		test(100, 200);
		test(300, "400");
	}

}







