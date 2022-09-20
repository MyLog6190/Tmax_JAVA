package ch05.sec05;

public class EqualsExample {
	public static void main(String[] args) {
		// 리터럴로 생성된 객체는 같은 내용의 리터럴이면 객체를 공유
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}
		
		String strVar3 = "홍길동";
		String strVar4 = "홍길동";
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}
		
		
	}
}
