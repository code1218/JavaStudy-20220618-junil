package j10_배열;

public class Array1 {

	public static void main(String[] args) {
		String name1 = "김준일";
		String name2 = "이창엽";
		String name3 = "강주현";
		
		/////////////////////////////////////////////////
		
		String[] names = new String[5];
		names[0] = "김준일";
		names[1] = "이창엽";
		names[2] = "강주현";
		
		for(int i = 0; i < 5; i++) {
			System.out.println("이름: " + names[i]);
		}
		

	}

}
