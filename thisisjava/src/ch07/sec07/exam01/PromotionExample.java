package ch07.sec07.exam01;

// A a  = new B(); new C(); new D(); new E();
class A {}

// B b = new B(); new D{};
class B extends A {}

// C c = new C(); new E{};
class C extends A {}

class D extends B {}
class E extends C {}

public class PromotionExample {
	public static void main(String[] args) {
		// A 타입으로 변환되어 대입
		A a = new B();
		a = new C();
		// a = new D();
		a = new E();
		
		// B타입으로 변환되어서 대입
		B b = new B();
		b = new D();
		
		// C타입으로 변화되어 대입
		C c = new C();
		c = new E();
		
		D d = new D();
		E e = new E();
		
		// 객체를 참조하는 참조 변수 대입 가능
		a = b;
		a = c;
		a = d;
		a = e;
		
		a = b; // 시작이 B객체로 생성되어서 시작
		// 강제 형변환(down-casting)
		B b2 = (B)a;
		
		// 자신보다 하위의 자식클래스로는 변환불가
		// ClassCastingException 발생
		// B -> A -> B -> D
		A a2 = new B(); // B -> A
		B b3 = (B)a2;	// A -> B
		D d2 = (D)b3;	// B -> D 불가
		
		
		// 컴파일시 오류 안남
		// 실행시 ClassCastingException 발생
		B b4 = new B();
		C c4 = new C();
		A a4 = b4; // B -> A
		C c5 = (C)a4; // B -> A -> C
		
	}
}
