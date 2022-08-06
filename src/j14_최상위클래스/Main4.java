package j14_최상위클래스;

public class Main4 {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Animal animal2 = new Animal();
		
		System.out.println(animal.equals(animal2));
		System.out.println(animal == animal2);
		
		System.out.println("animal 주소: " + animal.hashCode());
		
		
		Student student1 = new Student("김준일", 29);
		Student student2 = new Student("김준일", 29);
		
		System.out.println(student1 == student2); // 실제 주소 비교
		System.out.println(student1.equals(student2)); // 값 비교
		
		System.out.println(student1.getClass());
		System.out.println(student2.getClass());
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		
		System.out.println(student1.hashCode() == student2.hashCode()); // 값을 통해 만들어진 hashcode로 비교
		
		
		
		
		
		
	}

}
