package j06_반복;

public class While1 {

	public static void main(String[] args) {
		int dan = 0;
		
		while(dan < 8) {
			int num = 0;
			
			while(num < 9) {
				System.out.println((dan + 2) + " x " + (num + 1) + " = " + ((dan + 2) * (num + 1)));
				num++;
			}
			
			dan++;
		}
		
		
		
		
	}

}
