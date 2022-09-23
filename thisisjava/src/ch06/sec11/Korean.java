package ch06.sec11;

public class Korean {
	// final 선언한 필드는 선언과 동시에 초기화
	final String nation = "대한민국";
	
	// 인스턴스마다 생성되는 final필드
	final String ssn;
	
	// 인스턴스 필드
	String name;
	
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNation() {
		return nation;
	}

	public String getSsn() {
		return ssn;
	}
	
	public static void main(String[] args) {
		Korean korean1 = new Korean("200101011234567", "홍길동");
		System.out.println(korean1.getName());
		
		Korean korean2 = new Korean("200101011234567", "홍길동");
		System.out.println(korean2.getName());
	}
}
