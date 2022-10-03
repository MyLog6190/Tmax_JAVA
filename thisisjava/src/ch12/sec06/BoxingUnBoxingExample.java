package ch12.sec06;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		/* Boxing
		   - 기본 타입의 값을 클래스 타입으로 변경
		   - Integer.valueOf(100); int -> Integer
		   
		   Auto-Boxing
		   - 자동으로 Boxing되는 것을 말함
		   - Integer integer = 100;  
		   
		   UnBoxing
		   - 클래스 타입의 값을 기본 타입 변수로 변경
		   - Interger i; -> i.intValue(); Integer -> int
		   
		   Auto-UnBoxing
		   - 자동으로 UnBoxing되는 것을 말함
		   - int i = (Integer)integer
		*/
		Integer obj = 100; // int -> Integer
		System.out.println("value : " + obj.intValue());// unboxing(Wrapper -> int)
		int value = obj; // java 1.5 (Auto-Unboxing) Wrapper -> int
		System.out.println("value : " + value);
		
		Integer obj2 = Integer.valueOf(value); // boxing
		obj2 = value; // Auto-boxing
		
	}
}
