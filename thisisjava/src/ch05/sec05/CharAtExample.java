package ch05.sec05;

public class CharAtExample {
	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		System.out.println(str.length());
		
		// 메소드 String.lenth()
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.println(c);
		}
		
		char[] charArray = {'j', 's', 'v', 'a', ' ', 'p', 'r', 'p', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g'};
		str = new String(charArray);
		System.out.println(str);
	}
}
