package ch17.verify.exam05;

import java.util.Arrays;
import java.util.List;

public class Example {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("This is a java book","Lambda Expressions",
				"Java8 supports lambda expressions");
		list.stream()
			.filter( l -> l.contains("java") || l.contains("Java"))
			.forEach( l -> System.out.println(l) );
			
	}
}