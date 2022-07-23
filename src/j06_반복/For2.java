package j06_반복;

public class For2 {

	public static void main(String[] args) {

		for(int i = 0; i < 8; i++) {
			int dan = i + 2;
			
			System.out.println(dan + "단");
			
			for(int j = 0; j < 9; j++) {
				int num = j + 1;
				
				System.out.println(dan + " x " + num + " = " + (dan * num));
			}
			System.out.println();
			
		}
	}

}
