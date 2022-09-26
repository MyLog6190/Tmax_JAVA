package ch07.sec01;

public class MainExample {
	public static void main(String[] args) {
		C c = new C();
		c.method1(null);
		
		Child child = new Child();
		
		child.method1("hello", "꺽정");
	}
}
