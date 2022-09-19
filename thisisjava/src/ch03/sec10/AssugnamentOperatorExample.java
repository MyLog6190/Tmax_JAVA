package ch03.sec10;

public class AssugnamentOperatorExample {
	public static void main(String[] args) {
		int result = 0;
		
		//복합 대입 연산
		result += 10;
		System.out.println("result = " + result);
		
		result -= 5;
		System.out.println("result = " + result);
		
		result *= 3;
		System.out.println("result = " + result);
		
		result /= 5;
		System.out.println("result = " + result);
		
		result %= 3;
		System.out.println("result = " + result);
	}
}
