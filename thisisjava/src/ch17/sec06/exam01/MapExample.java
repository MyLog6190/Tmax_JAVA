package ch17.sec06.exam01;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("홍길동", 85));
		personList.add(new Person("홍길동", 92));
		personList.add(new Person("홍길동", 87));
		
		personList.stream()
			.mapToInt(person -> person.getScore())
			.forEach(s -> System.out.println(s));
	}
}

class Person {
	private String name;
	private int score;
	
	public Person(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}