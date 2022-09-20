package ch05.sec04;

public class StringLiterarlExample {
	public static void main(String[] args) {
		// 리터럴로 만들어진 String은 동일한 객체로 사용(상수임)
		// 똑같은 리터럴을 사용하는 String은 상수풀에 저장된 값을 사용
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));
	}
}
