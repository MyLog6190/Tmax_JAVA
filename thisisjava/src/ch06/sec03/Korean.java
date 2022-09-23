package ch06.sec03;

public class Korean {
	// 필드 선언
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 생성자
	public Korean() {
		this.nation = "대한민국";
	}
	
	public Korean(String name, String ssn) {
		this(name);
		this.ssn = ssn;
	}
	public Korean(String name) {
		this();
		this.name = name;
	}
	
	public static void main(String[] args) {
		Korean korean = new Korean("홍길동", "20010103000010");
	}
}
