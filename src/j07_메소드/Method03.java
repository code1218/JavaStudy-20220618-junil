package j07_메소드;

public class Method03 {

	/*
	 * 리턴 자료형		메소드명		매개변수
	 * double			add(덧셈)		double	2개		
	 * 					sub(뺄셈)
	 * 					mul(곱셈)
	 * 					div(나눗셈)
	 * 
	 * div()
	 * a = 0, b = 0
	 * 
	 * if a와 b 둘중 하나라도 0이면 return 무조건 0을 리턴
	 * 
	 */
	
	public static double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double sub(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double mul(double num1, double num2) {
		return num1 * num2;
	}
	
	public static double div(double num1, double num2) {
		if(num1 == 0 || num2 == 0) {
			return 0;
		}
		return num1 / num2;
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		System.out.println(a + " + " + b + " = " + add(a, b));
		System.out.println(a + " - " + b + " = " + sub(a, b));
		System.out.println(a + " x " + b + " = " + mul(a, b));
		System.out.println(a + " / " + b + " = " + div(0, b));

	}

}
