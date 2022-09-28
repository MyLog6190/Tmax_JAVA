package ch08.sec05;

// 인터페이스는 메소드 집합
public interface RemoCon {
	public static final int MAX_VOLUME = 10; //상수
	int MIN_VOLUME = 0;
	
	// 추상 메소드
	void turnOn();
	
	// default
	default void setVolume(int volume) {};
	
	// 정적 메소드
	static void staticMethod() {
		System.out.println("static메소드");
	}
}
