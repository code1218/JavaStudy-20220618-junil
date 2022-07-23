package j06_반복;

public class While3 {

	public static void main(String[] args) {
	
		int i = 0;
		while(i < 8) {
			int dan = i + 2;
			
			int j = 0;
			while(j < 9) {
				int num = j + 1;
				System.out.println(dan + " X " + num + " = " + (dan * num));
				j++;
			}
			i++;
		}
	}
}








