package j05_조건;

public class Switch {

	public static void main(String[] args) {
		int select = 2;
		String select2 = "이창엽";
		
		switch(select) {
			case 1: 
				System.out.println("1을 선택했습니다.");
				break;
			case 2:
				System.out.println("2를 선택했습니다.");
				break;
			case 3:
				System.out.println("3을 선택했습니다.");
				break;
			default:
				System.out.println("1, 2, 3만 선택할 수 있습니다.");
		}
		
		switch(select2) {
			case "김준일": 
				System.out.println("김준일을 선택했습니다.");
				break;
			case "이준우":
				System.out.println("이준우를 선택했습니다.");
				break;
			case "서태진":
				System.out.println("서태진을 선택했습니다.");
				break;
			default:
				System.out.println("학생은 김준일, 이준우, 서태진 밖에 없습니다.");
		}

	}

}
