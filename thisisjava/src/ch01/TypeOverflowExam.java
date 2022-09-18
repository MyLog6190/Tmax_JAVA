package ch01;

public class TypeOverflowExam {
	public static void main(String[] args) {
		/*
		 * byte의 허용 범위(-128 ~ 127)
		 * byte변수 선언시 허용 값이 넘어 가는 값을 넣으면 오류가 생긴다
		 * 연산자에 의해 byte가 허용 값을 넘겨면 허용 값 안에서 순환
		 * -> (byte)(127 + 1) = -128
		 * -> (byte)(-128 - 1) = 127 
		 */
		byte b = 127;
		for(int i = 1; i <= 400; i++) {
			System.out.println("i의 값:"+i+" byte타입의 값:"+(byte)(b+i));
		}

		
		
	}
}
