package ch15.sec05.exam03_02;

import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		
		// 객체 저장
		treeSet.add(new Person(5, "홍길동"));
		treeSet.add(new Person(25, "김자바"));
		treeSet.add(new Person(31, "박지원"));
		
		System.out.println(treeSet);
	}
	
}
