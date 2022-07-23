package j06_반복;

public class Star2 {

	public static void main(String[] args) {
		int n = 5;
		
		for(int i = 0; i < n + n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			if(i < n) {
				for(int j = 0; j < (i + 1) * 2 - 1; j++) {
					System.out.print("*");
				}
			}else {
				for(int j = 0; j < i - n + 1; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < n + n - 1 - ((i * 2) - 8); j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
