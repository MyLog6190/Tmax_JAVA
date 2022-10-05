package ch15.verify.exam08;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민권"));
		
		System.out.println("저장된 객페수 : " + set.size());
		for(Student s : set) {
			System.out.println(s.studentNum +  ":" + s.name);
		}
	}
}

class Student implements Comparable<Student>{
	public int studentNum;
	public String name;
	
	public Student (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.studentNum - o.studentNum;
	}

	
}
