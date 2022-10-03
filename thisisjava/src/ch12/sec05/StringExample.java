package ch12.sec05;

public class StringExample {
	public static void main(String[] args) {
		// String은 문자열이 변할 때마다 새로운 객체를 생성함
		// 자원을 많이 사용하기 때문에 자주 바뀌는 문자열은 StringBuilder나 StringBuffer를 사용
		String msg = "a"; // "a"객체 생성
		msg += "b"; // "ab"
		msg += "c"; // "abc"
		msg += "d"; // "abcd"
		
		System.out.println(msg);
		System.out.println("생성된 문자열 객체 갯수는? " + 4);
	}
}
