package ch12.verify.exam10;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder bstr = new StringBuilder();
		for(int i = 1; i <= 100; i++) {
			bstr.append(i);
		}
		
		System.out.println(bstr.toString());
	}
}
