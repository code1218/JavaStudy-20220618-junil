package j02_현변환;

public class Convert2 {

	public static void main(String[] args) {
		/*
		 * num1, num2, num3
		 * 
		 * 10.5 * 2 => 20
		 * 
		 * 20 * 2.2 => 
		 * 
		 * num1 = 10.5 * 2
		 * num2 = num1 * 2.2
		 * 
		 * 
		 */
		
		int num1 = (int) 10.5 * 2;
		double num2 = num1 * 2.2;
		char n = '김';
		char n2 = '준';
		
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println("" + n + n2 + "일");

	}

}
