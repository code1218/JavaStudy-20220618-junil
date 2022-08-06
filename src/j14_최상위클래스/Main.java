package j14_최상위클래스;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main {

	public static void main(String[] args) {
		Object object = new Object();
		
		object.toString();
		
		Class<?> class1 = object.getClass();
		
		System.out.println(class1.getSimpleName());
		System.out.println(class1.getName());
		
		Method[] methods = class1.getMethods();
		
		for(int i = 0; i < methods.length; i++) {
			String name = methods[i].getName();
			System.out.println("메소드명: " + name);
					
			Parameter[] params = methods[i].getParameters();
			
			for(int j = 0; j < params.length; j++) {
				System.out.println(params[j].getName());
			}
			
		}
		
		System.out.println();
		
		System.out.println(object);
		System.out.println(object.toString());
		
		
	}

}






