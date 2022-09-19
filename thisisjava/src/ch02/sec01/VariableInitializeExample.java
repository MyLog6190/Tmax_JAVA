package ch02.sec01;
// camel표기법
// Class는 대문자로 시작
// 합성어 Variable + initialize + example
public class VariableInitializeExample {
	public static void main(String[] args) {
		//int + value + result
		int intValueResult = 10;
		
		// 변수선업시 특수문자 사용불가 예외( _, $ )
		int #l = 10;
		int l# = 10;
		int _l = 10;
		int $l = 10;
		
		// 변수 선언시 숫자로 시작 불가
		int 5bun = 5;
		int bun5 = 5;
		
		// 변수 선언시 변수사이에 공백이있으면 안됨
		int my space = 10;
		
		// 변수 선언시 키워드(에약어-reserved word)
		int class = 10;
		
	}
	//메소드명 my + method => myMethod
	public static void myMethod() {
		System.out.println("카멜표기법 메소드");
	}
}
