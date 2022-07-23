package j05_조건;

public class Switch3 {

	public static void main(String[] args) {
		int select = 10;
		char select2 = '5';
		String select3 = "1";
		
		switch(select3) {
			case "10":
				System.out.println("정수 10을 선택했습니다.");
				break;
			case "준일":
				System.out.println("정수 12를 선택했습니다.");
				break;
			case "14":
				System.out.println("정수 14를 선택했습니다.");
				break;
			case "15":
				System.out.println("정수 15를 선택했습니다.");
				break;
			case "18":
				System.out.println("정수 18을 선택했습니다.");
				break;
			default:
				System.out.println("존재하지않습니다.");
			
		}
		
	}

}
