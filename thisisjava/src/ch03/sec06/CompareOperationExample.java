package ch03.sec06;

public class CompareOperationExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		
		// ASCII UNICODE 65
		char char1 = 'A';
		// ASCII UNICODE 66
		char char2 = 'B';
		// 65 < 66 비교연산자 int 타입으로 변환되어서 연산
		boolean result4 = (char1 < char2);
		System.out.println("result4: " + result4);
		
		int num3 = 1;
		double num4 = 1.0;
		// 피연산자(num3) 연산자(==) 피연사자(num4)
		// int가 데이터 크기가 더 큰 double로 변화되어
		// num3 == num4는 true가 나온다.
		boolean result5 = (num3 == num4);
		System.out.println("result5: " + result5);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		
		// float 0.1과 double의 0.1은 다르다
		// float와 double이 연산되어도 자동형 변환이 안됨
		boolean result6 = (num5 == num6);
		boolean result7 = (num5 == (float)num6);
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);
		
		String str1 = "자바";
		String str2 = "JAVA";
		
		// String의 문자열 값 비교는 equals() 매소드를 사용
		// str1과 str2가 참조하고있는 문자열(String)객체의 주소 값(hash코드) 비교
		boolean result8 = (str1 == str2);
		boolean result9 = (str1.equals(str2));
		
		// str1과 str2 변수가 저장하고 있는 String객체의 주소 값
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	 	
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);
		
		
	}
}
