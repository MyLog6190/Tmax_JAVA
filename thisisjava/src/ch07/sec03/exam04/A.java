package ch07.sec03.exam04;

public class A {
	A() {
		System.out.println("A 기본 생성자");
	}
	
	A(int a){
		System.out.println("int타입 매개변수 1개짜리 생성자");
	}
	
	A(int a, int b){
		System.out.println("int타입 매개변수 2개짜리 생성자");
	}
}


class B extends A {
	B() {	
		// 부모생성자 호출 메소드 super(); 반드시 생성자 출력의 첫줄에 기술;
		super(10, 20); // super(int, int);
		System.out.println("default 생성자");
	}
	
	B(int a) {
		super();
		System.out.println("int타입 매개변수 1개짜리 생성자");
	}
	
	B(int a, int b) {
		super(a);
		System.out.println("int타입 매개변수 2개짜리 생성자");
	}
}

class C extends B {
	C() {
		super(10);
		System.out.println("C의 기본생성자");
	}
}