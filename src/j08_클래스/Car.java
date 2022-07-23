package j08_클래스;

public class Car {
	/*
	 * company 회사명
	 * model 차량모델
	 * color 색상
	 * 
	 * carInfo()
	 * 회사명: 현대자동차
	 * 모델: 쏘나타
	 * 색상: 화이트
	 * 
	 * KIA, k5, 블랙
	 * 테슬라, modelS, 레드
	 * 
	 */
	String company;
	String model;
	String color;
	
	//생성자(Constructor)
	Car() {
		/*
		 * 생성자 특징
		 * 1. 생성자의 이름은 클래스의 이름과 동일하다.
		 * 2. 생성자의 반환 자료형은 생략되어있다.
		 * 3. 모든 클래스의 생성자는 무조건 주소값을 리턴하게 
		 * 만들어졌기 때문에 반환 자료형이 생략되어 있다.
		 */
		System.out.println("자동차 인스턴스 생성");
	}
	
	void carInfo() {
		System.out.println("회사명: " + company);
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
		System.out.println();
	}
	
}










