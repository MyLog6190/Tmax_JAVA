package ch12.sec05;

public class StringExample {
	public static void main(String[] args) {
		String msg = "a"; // "a"객체 생성
		msg += "b"; // "ab"
		msg += "c"; // "abc"
		msg += "d"; // "abcd"
		
		System.out.println(msg);
		System.out.println("생성된 문자열 객체 갯수는? " + 4);
	}
}
