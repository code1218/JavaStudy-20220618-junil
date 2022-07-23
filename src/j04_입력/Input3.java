package j04_입력;

import java.util.Scanner;

public class Input3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		char c = scanner.next().charAt(0);
		String s1 = scanner.next();
		scanner.nextLine();
		String s2 = scanner.nextLine();
		
		System.out.println("num: " + num);
		System.out.println("c: " + c);
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
	}

}




