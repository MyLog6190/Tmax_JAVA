package ch05.sec12;

public class MySingleTon {
	// 자신타입의 필드 선언 및 객체 초기화
	private static MySingleTon instance = new MySingleTon();
	
	// 기본생성자를 private로 선언
	// 기본 생성자를 private로 선언하여 외부에서 접근을 차단
	// new를 통해 객체 생성 불가
	private MySingleTon() {}
	
	// getInstance를 통해서만 접근 가능하게 한다.
	// 자신을 요청하는 객체에서 전달하는 메소드
	// static을 사용하여 프로그램이 종료 할 때까지 한가지 객체만 사용하게 한다. 
	public static MySingleTon getInstance() {
		return instance;
	}
	
	public static void greet() {
		System.out.println("hello!!!");
	}
}
