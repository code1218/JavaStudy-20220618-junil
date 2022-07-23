package j09_접근지정자.정보은닉;

public class UserMain {
	
	public static void main(String[] args) {
		User user = new User("junil");
		System.out.println(user.getEmail());
		
		User user2 = new User();
		
		user2.setEmail("junil2");
		user.setEmail("abc");
		System.out.println(user2.getEmail());
		System.out.println(user.getEmail());
		
		
	}
	
}
