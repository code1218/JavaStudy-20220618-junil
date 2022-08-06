package j14_최상위클래스;

public class Main2 {

	public static void main(String[] args) {
		Object object1 = new Animal();
		Student object2 = new Student();
		Object object3 = new User();
		
		Animal animal = (Animal) object1;
		
		System.out.println(object1.toString());
		System.out.println(object1);
		System.out.println(animal.toString());
		System.out.println(animal);
		
		System.out.println(object2);

	}

}
