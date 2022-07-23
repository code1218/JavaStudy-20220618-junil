package j07_메소드;

public class Method06 {
	
	
	public static void showInfo(String name, int age, String address) {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + address);
	}
	
	
	//메소드 오버로딩
	public static String outputInfo(String name, int age, String address) {
		return "[이름: " + name + ", 나이: " + age + ", 주소: " + address + "]";
	}
	
	public static String outputInfo(String name, int age) {
		return "[이름: " + name + ", 나이: " + age + "]";
	}
	

	public static void main(String[] args) {
		String n = "김준일";
		int a = 29;
		String addr = "부산 동래구 사직동";
				
		showInfo("이채원", 15, "부산");
		
		String result = outputInfo(n, a, addr);
		System.out.println(result);
		
		String result2 = outputInfo("이창엽", 21);
		System.out.println(result2);
	}

}






