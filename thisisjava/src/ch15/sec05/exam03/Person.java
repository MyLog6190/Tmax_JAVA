package ch15.sec05.exam03;

public class Person implements Comparable<Person>{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		// 자신의 name앞이면-, 뒤면+, 같은위치면0
		return name.compareTo(o.name);
	}
	
	
}
