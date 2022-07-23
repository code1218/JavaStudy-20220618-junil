package j07_메소드;

public class Method01 {
	
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public static double sub(double num1, double num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		int r = add(10, 20);
		double r2 = sub(1.5, 10.5);
		System.out.println(r);
		System.out.println(r2);
		
	}

}
