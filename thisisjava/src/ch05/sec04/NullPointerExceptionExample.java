package ch05.sec04;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		// 참조 변수는 선언 후 new에 의한 객체 생성 및 대입을 해야 참조 변수에 접근 가능
		// 그렇지 않으면 예외발생 java.lang.NullPointerException
		// java.lang.Null Pointer
		int[] intArray = null;
		
		String str = null;
		System.out.println("총 문자수: " + str.length());
	}
}
