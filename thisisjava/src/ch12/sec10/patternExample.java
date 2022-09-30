package ch12.sec10;

import java.util.regex.Pattern;

public class patternExample {
	public static void main(String[] args) {
		// 정규 표현식
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		System.out.println(result?"정규식과 일치합니다":"정규식과 일치하지 않습니다.");
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@mycompanycom";
		result = Pattern.matches(regExp, data);
		System.out.println(result?"정규식과 일치합니다":"정규식과 일치하지 않습니다.");
	}
}
