package j06_반복;

public class While2 {

	public static void main(String[] args) {
		// 1 ~ 100까지 전부 더하세요.
		
		int i = 0;
		int result = 0;
		
		while(i < 100) {
			result = result + (i + 1);
			i++;
		}
		
		System.out.println("1 ~ 100까지 더한 결과: " + result);
		
		
	}

}
