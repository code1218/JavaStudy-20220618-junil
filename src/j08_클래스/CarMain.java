package j08_클래스;

public class CarMain {

	public static void main(String[] args) {
		new Car();
		System.out.println();
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.company = "현대자동차";
		car1.model = "쏘나타";
		car1.color = "화이트";
		
		car2.company = "KIA";
		car2.model = "k5";
		car2.color = "블랙";
		
		car3.company = "테슬라";
		car3.model = "modelS";
		car3.color = "레드";
		
		car1.carInfo();
		car2.carInfo();
		car3.carInfo();
		
	}

}
