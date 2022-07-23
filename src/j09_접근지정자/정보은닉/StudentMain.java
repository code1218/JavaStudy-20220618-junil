package j09_접근지정자.정보은닉;

public class StudentMain {
	public static void main(String[] args) {
		Student junil = new Student(20220001, "김준일", 2);
		Student chaewon = new Student(20220002, "이채원", 3);
		
		junil.studentInfo();
		chaewon.studentInfo();
		
//		junil.studentCode = 20220001;
//		junil.studentName = "김준일";
//		junil.studentYear = 2;
//		
//		chaewon.studentCode = 20220002;
//		chaewon.studentName = "이채원";
//		chaewon.studentYear = 3;
		
	}
}
