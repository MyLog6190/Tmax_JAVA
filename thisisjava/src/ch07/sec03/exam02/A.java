package ch07.sec03.exam02;

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
		super();
		System.out.println("default 생성자");
	}
	
	B(int a) {
		super();
		System.out.println("int타입 매개변수 1개짜리 생성자");
	}
	
	B(int a, int b) {
		super();
		System.out.println("int타입 매개변수 2개짜리 생성자");
	}
}