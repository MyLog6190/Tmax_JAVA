package ch07.sec06.package3;
import ch07.sec06.package1.A;

// 다른패키지의 A를 상속받은 D클래스
public class D extends A{
	
	// 생성자
	protected D() {
		// 다른패키지의 부모(A)클래스의 생성접근가능
		super();
	}
	
	// 메소드
	public void method1() {
		// 다른패키지의 부모(A) 클래스의 필드에 접근가능	
		this.fleid = "v";
		
		// 다른패키지의 부모(A) 클래스의 메소드에 접근가능
		this.method();
	}
	
	public void method2() {
		// new에 의해서 생성된 객체에 대한 접근 불가
		A a = new A();
		
		// new에 의해서 생성된 객체의 필드에 대한 접근 불가
		a.field = "v";
		
		// new에 의해서 생성된 객체의 메소드에 대한 접근 불가
		a.method();
	}
}
