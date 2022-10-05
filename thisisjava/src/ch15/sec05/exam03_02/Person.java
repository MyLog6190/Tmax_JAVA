package ch15.sec05.exam03_02;

public class Person implements Comparable<Person>{
	public int sno;
	public String name;
	
	public Person(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		return sno - o.sno;
	}

	@Override
	public String toString() {
		return "Person [sno=" + sno + ", name=" + name + "]";
	}
	
	
}
