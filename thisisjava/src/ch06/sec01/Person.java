package ch06.sec01;


public class Person {
	// 속성
	private String name;
	private int age;	
		
	// 동작
	void eat(String food) {
		System.out.println(food + "를 먹다");
	}
	void laugh() {
		System.out.println("웃다");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0) {
			age = 0;
		}else if(age > 120) {
			age = 120;
		}
		this.age = age;
	}
}
