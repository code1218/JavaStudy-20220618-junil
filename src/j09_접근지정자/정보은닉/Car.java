package j09_접근지정자.정보은닉;

public class Car {
	private String company;
	private String model;
	private String color;
	
	/*
	 * getter & setter
	 * 
	 * 변수명 앞에 get 또는 set이 붙고 뒤에오는 변수명은 카멜표기법으로 작성한다.
	 * 접근지정자는 public이다.
	 * 
	 */
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}








