package ch06.sec08;

public class ReturnExample {
	
	public static void main(String[] args) {
		ReturnExample re = new ReturnExample();
		re.method1();
		System.out.println("끝");
	}
	
	void method1() {
		System.out.println("메소드에서");
		System.out.println("return문이 하는 역활은");
		System.out.println("return문 에서 실행을 멈추고");
		System.out.println("매소드를 호출한 곳으로 되돌아가는 명령");
		return;
	}
}
