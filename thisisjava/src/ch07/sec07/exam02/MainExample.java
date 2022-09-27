package ch07.sec07.exam02;

public class MainExample {
	public static void main(String[] args) {
		A a;
		B b = new B();
		
		// 자동 형변환 ()
		a = b;
		// 부모클래스 (A)범위의 객체의 필드,메소드 접근가능
		a.a = 10;
		a.me1();
		
		// 참조 변수 a범위가 A이므로 자식클래스(B) 필드, 메소드 접근 불가
		a.b = 10;
		a.me2();
		
		// 강제 형변환()
		// 강제 형변환(참조변수 b2는 B타입이므로 A타입 범위와 B타입)
		B b2 = (B)a;
		b2.a = 10;
		b2.me1();
		b2.b = 20;
		b2.me2();
		
	}
}
