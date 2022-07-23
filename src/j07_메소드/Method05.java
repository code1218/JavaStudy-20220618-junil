package j07_메소드;

import java.util.Scanner;

public class Method05 {

	/*
	 * 메소드 오버로딩 활용
	 * 
	 * main에서 Scanner를 통해 a, b, c
	 * a(int)		10
	 * b(double)	3.14
	 * c(String)	"문자열"
	 * 
	 * plus
	 * 
	 * a + b	13.14
	 * a + c	10문자열
	 * b + c	3.14문자열
	 * 
	 * 
	 */
	
	public static void plus(int a, double b) {
		System.out.println(a + b);
	}
	
	public static void plus(int a, String c) {
		System.out.println(a + c);
	}
	
	public static void plus(double b, String c) {
		System.out.println(b + c);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = 0;
		double b = 0;
		String c = null;
		
		System.out.print("a: ");
		a = scanner.nextInt();
		
		System.out.print("b: ");
		b = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.print("c: ");
		c = scanner.nextLine();
		
		plus(a, b);
		plus(a, c);
		plus(b, c);
	}

}







