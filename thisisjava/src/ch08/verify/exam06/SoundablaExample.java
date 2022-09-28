package ch08.verify.exam06;

////////////// 6
public class SoundablaExample {
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}

interface Soundable{
	public String sound();
}

class Cat implements Soundable{
	@Override
	public String sound() {
		return "야용";
	}
	
}

class Dog implements Soundable{
	@Override
	public String sound() {
		return "멍멍";
	}
	
}