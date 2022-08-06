package j14_최상위클래스;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Animal animal2 = new Animal();
		Animal animal3 = animal;
		
		System.out.println(animal == animal2);		System.out.println(animal == animal3);
		
		String name = "김준일";
		String name2 = "김준일";
		String name3 = null;
		String name4 = new String("김준일");
		
		
		System.out.println(name == name2);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		name3 = scanner.nextLine();
		
		System.out.println("name: " + name);
		System.out.println("name3: " + name3);
		System.out.println("name4: " + name4);
		
		System.out.println(name == name3);

	}

}










