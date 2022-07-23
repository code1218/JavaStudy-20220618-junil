package j09_접근지정자.정보은닉;

public class Student {
	private int studentCode;	//학번
	private String studentName;	//이름
	private int studentYear;	//학년
	
	//생성자
	public Student() {
		
	}
	
	/*
	 * this 키워드
	 * 자기 자신의 주소값을 의미한다.
	 */
	
	public Student(int studentCode) {
		this.studentCode = studentCode;
	}
	
	
	public Student(int studentCode, String studentName) {
		this.studentCode = studentCode;
		this.studentName = studentName;
	}
	
	public Student(int studentCode, String studentName, int studentYear) {
		this.studentCode = studentCode;
		this.studentName = studentName;
		this.studentYear = studentYear;
	}
	
	void studentInfo() {
		System.out.println(studentCode);
		System.out.println(studentName);
		System.out.println(studentYear);
		System.out.println();
	}
}









