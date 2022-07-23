package j05_조건;

public class Switch2 {

	public static void main(String[] args) {
		int score = 61;
		
		switch(score / 10) {
			case 10: 
			case 9:
				System.out.println("A등급");
				break;
			case 8:
				System.out.println("B등급");
				break;
			case 7:
				System.out.println("C등급");
				break;
			case 6:
				System.out.println("D등급");
				break;
			default:
				System.out.println("F등급");
		}
		
	}

}
