package ch07.sec03.exam01;

public class A extends Object{
	public A() {
		System.out.println("A 생성자");
	}
}

// 부모클래스의 생성자는 상속안됨.
// super()로만 호출됨
class B extends A {
	public B() {
		super(); //컴파일러가 추가됨
		System.out.println("B 생성자");
	}
}
