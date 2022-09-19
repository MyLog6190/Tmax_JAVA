package ch03.sec07;

public class LogicalOperationExample {
	public static void main(String[] args) {
		// 논리연산자 AND 연산
		// 모든 연산이 true가 나와야 값이 true가 된다
		
		char charCode = 'A';
		
		// true & true -> true
		if((65 <= charCode) & (charCode <= 90)) {
			System.out.println("대문자이군요");
		}
		
		// false & true -> true
		if((97 <= charCode) & (charCode <= 122)) {
			System.out.println("대문자이군요");
		}
		
		// true & false -> false
		if((48 <= charCode) & (charCode <= 57)) {
			System.out.println("0~9 숫자이군요");
		}
		
		//----------------------------------------
		
		// 논리연산자 OR연산
		// 둘 중에 1나만 true여도 true
		
		int value = 6;
		
		if((value % 2 == 0)) {
			System.out.println("짝수이군요");
		}
		
		if((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수이군요");
		}
		
		// 연산의 우선순위 비교연산(==), 논리비교(||), 대입연산(=)
		boolean result = value % 2 == 0 || value % 3 == 0;
		
		if(result) {
			System.out.println("2 또는 3의 배수이군요");
		}
		
		if(!result) {
			System.out.println("2 또는 3의 배수가 아니군요.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
