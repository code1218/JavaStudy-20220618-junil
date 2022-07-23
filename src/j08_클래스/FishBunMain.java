package j08_클래스;

public class FishBunMain {

	public static void main(String[] args) {
		FishBun fishBun1 = new FishBun(); //생성
		FishBun fishBun2 = new FishBun();
		FishBun fishBun3 = new FishBun();
		FishBun fishBun4 = new FishBun();
		
		//주소 확인
		System.out.println("주소1: " + fishBun1);
		System.out.println("주소2: " + fishBun2);
		System.out.println("주소3: " + fishBun3);
		System.out.println("주소4: " + fishBun4);
		
		//재료 변수에 값 대입
		fishBun1.material = "팥";
		fishBun2.material = "슈크림";
		fishBun3.material = "고구마";
		fishBun4.material = "커피";
		
		//반죽 변수에 값 대입
		fishBun1.dough = "찹쌀반죽";
		fishBun2.dough = "일반반죽";
		fishBun3.dough = "30일 숙성반죽";
		fishBun4.dough = "달달한반죽";
		
		//showInfo()메소드 호출
		fishBun1.showInfo();
		fishBun2.showInfo();
		fishBun3.showInfo();
		fishBun4.showInfo();
	}

}







