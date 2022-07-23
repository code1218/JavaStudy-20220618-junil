package j09_접근지정자.정보은닉;

public class User {
	private String provider = "google";
	private String domain = "com";
	private String email;
	
	public User() {
		
	}
	
	public User(String id) {
		if(id.contains("@")) { //id 변수 값에 @문자열이 포함되어 있으면 true 그렇지 않으면 false
			id = id.substring(0, id.indexOf("@"));
			//substring은 시작 인덱스 부터 마지막 인덱스 전까지 문자열을 잘라라.
		}
		email = id + "@" + provider + "." + domain;
	}
	
	public void setEmail(String email) {
		if(email.contains("@")) {
			email = email.substring(0, email.indexOf("@"));
		}
		
		this.email = email + "@" + provider + "." + domain;
	}
	
	public String getEmail() {
		return email;
	}
	
}








